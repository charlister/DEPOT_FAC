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
        
    int msgid = msgget(cle, O_RDWR);
    if(msgid == -1) {
        perror("erreur msgget : ");
        exit(3);
    }
    
    printf("msgget ok\n");

    Acces acces_rcv;
    Acces acces_snd;
    acces_snd.etiquette = E_SEND_TO_PCTRL;
    acces_snd.data = getpid();
    
    printf("identifiant du processus : %ld\n", acces_snd.data);
    if(msgsnd(msgid, &acces_snd, sizeof(acces_snd.data), 0) == -1)
    {
        perror("msgsnd error : ");
        exit(4);
    }
    printf("demande d'accès envoyé !\nen attente d'une autorisation ...\n");

    if(msgrcv(msgid, &acces_rcv, sizeof(acces_rcv.data), getpid(), 0) == -1)
    {
        perror("msgrcv error : ");
        exit(5);
    }
    printf("autorisation reçue !\n");

    printf("calcul en cours ...\n");
    calcul(5);
    printf("fin du calcul.\n");

    acces_snd.etiquette = acces_snd.data;
    if(msgsnd(msgid, &acces_snd, sizeof(acces_snd.data), 0) == -1)
    {
        perror("msgsnd error : ");
        exit(6);
    }
    printf("ressource libérée !\n");

    return 0;
}
