.data
hello: 
	.asciiz "Hello ! It's me."

.text
	li $v0, 4
	la $a0, hello
	syscall
	