.data
	rand_double:
		.double 3.14794364
	zero_double:
		.double 0.0

.text
	ldc1 $f0, rand_double
	ldc1 $f2, zero_double
	
	li $v0, 3
	add.d $f12, $f0, $f2
	syscall