.data
	weight: 
		.float 67.0

.text
	li $v0, 2
	lwc1 $f12, weight
	syscall