.data
 	nbr1: .word 22
 	nbr2: .word 75
 	
.text
	lw $t1, nbr1
	lw $t2, nbr2
	
	li $v0, 1
	sub $t0, $t2, $t1
	move $a0, $t0
	
	syscall
	