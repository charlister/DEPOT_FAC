.data
	tab: .space 12
.text
	la $t0, tab
	li $t1, 1
	sw $t1, ($t0)
	li $t1, 2
	sw $t1, 4($t0)
	li $t1, 3
	sw $t1, 8($t0)
	
	lw $t1, ($t0)
	lw $t2, 4($t0)
	lw $t3, 8($t0)
	
	sw $t1, 4($t0)
	sw $t2, 8($t0)
	sw $t3, ($t0)
	
	
	
	
	
	
	