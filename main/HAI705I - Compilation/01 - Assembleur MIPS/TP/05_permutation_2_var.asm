.data
	x : .word 1
	y : .word 1
.text
	li $t0, 1
	la $t1, x
	sw $t0, ($t1)
	li $t0, 2
	la $t1, y
	sw $t0, ($t1)
	
	li $v0, 1
	la $t0, x
	lw $a0, ($t0)
	syscall
	
	li $v0, 1
	la $t0, y
	lw $a0, ($t0)
	syscall