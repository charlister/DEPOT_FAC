#include <stdlib.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <stdio.h>//perror

// pour supprimer la file ayant la clé passée en parametre.

// une autre solution est d'utiliser la commande ipcrm -q <id_file>
// après avoir obtenue l'id de la file via la commande ipcs.

int main(int argc, char * argv[]){

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
    
  int msgid = msgget(cle, 0666);
  if(msgid==-1) {
    perror("erreur msgget : ");
    exit(3);
  }
  
  printf("msgget ok\n");

  if (msgctl(msgid, IPC_RMID, NULL) == -1)
    perror("erreur suppression file de message :");

   printf("suppression file ok\n");
  
  return 0;
}
