########################################
#~ définitions
########################################

BIN=bin/Pi bin/suppr bin/semInit

# liste des fichiers sources
SRCS0=Pi.c
SRCS1=supprimeSem.c
SRCS2=semInit.c

default: $(BIN)

########################################
#~ regles pour l'executable
########################################

obj/%.o: %.c
	gcc -Wall -Iinclude -c $< -o $@

bin/Pi: $(SRCS0:%.c=obj/%.o)
	gcc -o $@ $+

bin/suppr: $(SRCS1:%.c=obj/%.o)
	gcc -o $@ $+

bin/semInit: $(SRCS2:%.c=obj/%.o)
	gcc -o $@ $+

clean:
	rm -f $(BIN) obj/*.o *~
