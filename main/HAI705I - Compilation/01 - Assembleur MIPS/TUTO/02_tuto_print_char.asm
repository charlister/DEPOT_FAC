.data
	lettre_c: 
		.byte 'c'

.text
	li $v0, 4
	la $a0, lettre_c
	syscall 
	