.data
	n1: .word 4
	n2: .word 8
.text
	lw $t0, n1
	lw $t1, n2
	add $t2, $t0, $t1
	