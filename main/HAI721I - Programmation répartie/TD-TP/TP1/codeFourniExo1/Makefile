########################################
#~ définitions
########################################

BIN=bin/Pi bin/Pctrl bin/suppr

# liste des fichiers sources
SRCS0=Pi.c
SRCS1=Pctrl.c
SRCS3=supprimeFile.c

default: $(BIN)

########################################
#~ regles pour l'executable
########################################

obj/%.o: %.c
	gcc -Wall -Iinclude -c $< -o $@

bin/Pi: $(SRCS2:%.c=obj/%.o) $(SRCS0:%.c=obj/%.o)
	cp calculC.o obj/
	gcc -o $@ $+ calculC.o

bin/Pctrl: $(SRCS1:%.c=obj/%.o)
	gcc -o $@ $+

bin/suppr: $(SRCS3:%.c=obj/%.o)
	gcc -o $@ $+

clean:
	rm -f $(BIN) obj/*.o *~

# cd OneDrive/Bureau/FAC/UMONTPELLIER/M1/main/HAI721I\ -\ Programmation\ répartie/TD-TP/TP1/codeFourniExo1/
