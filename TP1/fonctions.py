def puissance(nombre_a, nombre_b):
	if not type(nombre_a) is int:
		raise TypeError("Only integers are allowed")
    
	if not type(nombre_b) is int:
		raise TypeError("Only integers are allowed")

	if nombre_a == 0 and nombre_b < 0:
		raise ValueError("0 élevé à une puissance négative est indéfini")

	result = 1

	for i in range(nombre_b):
		result=result*nombre_a

	if nombre_b < 0:
		return 1 / result

	return result
