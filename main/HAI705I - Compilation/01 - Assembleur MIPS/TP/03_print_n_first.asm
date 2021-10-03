.data
	msg: .asciiz "veuillez définir une limite : "
	space: .byte ' '
.text
	li $v0, 4
	la $a0, msg
	syscall
	
	li $v0, 5
	syscall
	
	move $t0, $v0
	
	li $t1, 1
	
	loop:
		bgt $t1, $t0, exit
		
		li $v0, 1
		move $a0, $t1
		syscall
		
		li $v0, 4
		la $a0, space
		syscall
		
		addi $t1, $t1, 1
		j loop
	exit:
		
