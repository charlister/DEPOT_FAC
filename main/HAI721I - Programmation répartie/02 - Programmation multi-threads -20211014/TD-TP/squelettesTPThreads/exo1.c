#include <string.h>
#include <stdio.h>//perror
#include <sys/types.h>
#include <stdlib.h>
#include <unistd.h>
#include <pthread.h>
#include "calcul.h"

// gcc calculC.o -o exo1 exo1.c -lpthread

struct paramsFonctionThread {

  int idThread;

  // si d'autres param�tres, les ajouter ici.

};


void * fonctionThread (void * params){
  calcul(3);
  /* 
  suite à la temporasation, le temps que l'affichage ne se fassent, 
  les threads parallèles qui s'exécutent, partageant le même indice dans la boucle, 
  la lisent en même temps.
  */
  struct paramsFonctionThread * args = (struct paramsFonctionThread *) params;
  printf("index : %d ; id thread : %ld\n", args->idThread, pthread_self());
  pthread_exit(NULL);
}


int main(int argc, char * argv[]){

  if (argc < 2 ){
    printf("utilisation: %s  nombre_threads  \n", argv[0]);
    return 1;
  }     

  
  pthread_t threads[atoi(argv[1])];

  struct paramsFonctionThread p;
  
  // cr�ation des threards 
  for (int i = 0; i < atoi(argv[1]); i++){

    // Le passage de param�tre est fortement conseill� (�viter les
    // variables globles).

    p.idThread = i;

    if (pthread_create(threads+i, NULL, fonctionThread, &p) != 0){
      perror("erreur creation thread");
      exit(1);
    }
  }


// garder cette saisie et modifier le code en temps venu.
  for (int i = 0; i < atoi(argv[1]); i++)
    pthread_join(threads[i], NULL);

  return 0;
 
}
 
// 2. les autres tâches prennent aussi fin.

// 3. si une tâche fait exit(), c'est le thread principal qui prend fin, ce qui conduit à la situation de la première question.

