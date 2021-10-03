#include <sys/types.h>
#include <unistd.h>
#include <stdio.h>
#include <sys/ipc.h>
#include <sys/sem.h>
#include <stdlib.h>


int main(int argc, char const *argv[])
{
    if (argc!=2) {
        printf("Nbre d'args invalide, utilisation :\n");
        printf("%s identifiant-semaphores\n", argv[0]);
        exit(1);
    }

    struct sembuf op[]={
        {(unsigned short)0, (short)-1, 0}, // P 
        {(unsigned short)0, (short)+0, 0} // Z pour attendre que la valeur du sémaphore soit 0
    };

    int idSem = atoi(argv[1]);
    
    printf("entrer dans le salon des processus\n");
    if(semop(idSem, op, 1) == -1) {
        perror("erreur semop ");
        exit(3);
    }

    printf("pid = %d : \nen attente des autres processus ...\n", getpid());
    if(semop(idSem, op+1, 1) == -1) {
        perror("erreur semop ");
        exit(4);
    }
    printf("tous les processus sont présents. le programme peut s'arrêter !\n");

    return 0;
}