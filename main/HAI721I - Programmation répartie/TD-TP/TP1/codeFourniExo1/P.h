#include <stdlib.h>
#include <stdio.h>//perror
#include <sys/types.h>
#include <sys/msg.h>
#include <sys/ipc.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>
#include "calcul.h"

#define E_SEND_TO_PI 2 // étiquette d'envoie des messages côté pus contrôle
#define E_SEND_TO_PCTRL 1 // étiquette d'envoie de message côté pus de demandeur
#define E_RECV_FROM_PI E_SEND_TO_PCTRL // étiquette de reception de message côté pus contrôle
#define E_RECV_FROM_PCTRL E_SEND_TO_PI // étiquette de reception de message côté pus de demandeur

typedef struct {
    long etiquette;
    long data;
} Acces;