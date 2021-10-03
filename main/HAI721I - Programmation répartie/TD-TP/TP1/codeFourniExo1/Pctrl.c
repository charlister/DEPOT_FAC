#include "P.h"

int main(int argc, char const *argv[])
{
    if (argc!=3) {
        printf("Nbre d'args invalide, utilisation :");
        printf("%s fichier-pour-cle-ipc entier-pour-cle-ipc\n", argv[0]);
        exit(1);
    }

    key_t cle=ftok(argv[1], atoi(argv[2]));

    if (cle==-1) {
        perror("Erreur ftok : ");
        exit(2);
    }

    printf("ftok ok\n");
        
    int msgid = msgget(cle, IPC_CREAT | 0666);
    if(msgid==-1) {
        perror("erreur msgget : ");
        exit(3);
    }
    
    printf("msgget ok\n");

    Acces acces_rcv;
    Acces acces_snd;
    acces_snd.etiquette = E_SEND_TO_PI;
    long pid_rcv;
    while(1)
    {
        printf("en attente d'une demande d'accès ...\n");
        if(msgrcv(msgid, &acces_rcv, sizeof(acces_rcv.data), E_RECV_FROM_PI, 0) == -1)
        {
            perror("msgrcv error : ");
            exit(4);
        }
        pid_rcv = acces_rcv.data;
        printf("demande d'accès reçue du processus %ld\n", pid_rcv);

        acces_snd.etiquette = pid_rcv;

        if(msgsnd(msgid, &acces_snd, sizeof(acces_snd.data), 0) == -1)
        {
            perror("msgsnd error : ");
            exit(5);
        }
        printf("demande d'accès autorisée ! le processus %ld peut maintenant accéder à la ressource ...\n", pid_rcv);

        if(msgrcv(msgid, &acces_rcv, sizeof(acces_rcv.data), pid_rcv, 0) == -1)
        {
            perror("msgrcv error : ");
            exit(6);
        }
        printf("ressource libre !\nune nouvelle demande peut être traitée.\n" );
    }
    

    return 0;
}
