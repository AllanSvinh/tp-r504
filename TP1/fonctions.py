def puissance(nombre_a, nombre_b):
    if not type(nombre_a) is int:
        raise TypeError("Only integers are allowed")
    
    if not type(nombre_b) is int:
        raise TypeError("Only integers are allowed")
        
    return nombre_a ** nombre_b
