.data
	msg: .asciiz "veuillez saisir un entier : "
.text
	input: 
		li $v0, 4
		la $a0, msg
		syscall
	
		li $v0, 5
		syscall
		
		bgtz $v0, res
		neg $v0, $v0
	res:
		move $a0, $v0
		li $v0, 1
		syscall
		
		