.data
	msg: .asciiz "saisir un entier : "
	msg_pair: .asciiz "pair !"
	msg_impair: .asciiz "impair !"
.text
	li $v0, 4
	la $a0, msg
	syscall
	
	li $v0, 5
	syscall
	
	move $t0, $v0
	li $t1, 2
	div $t0, $t1
	
	mfhi $t1
	beqz $t1, pair
	
	li $v0, 4
	la $a0, msg_impair
	syscall
	j exit
	
	pair:
		li $v0, 4
		la $a0, msg_pair
		syscall
		
	exit:
