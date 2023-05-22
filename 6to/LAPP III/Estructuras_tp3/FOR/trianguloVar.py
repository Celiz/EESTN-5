
n = int(input("Ingrese la cantidad de triángulos: "))

cant_equilateros = 0
cant_isosceles = 0
cant_escalenos = 0


for i in range(n):
    lado_a = float(input(f"Ingrese el lado A del triángulo {i+1}: "))
    lado_b = float(input(f"Ingrese el lado B del triángulo {i+1}: "))
    lado_c = float(input(f"Ingrese el lado C del triángulo {i+1}: "))
    
    if lado_a == lado_b == lado_c:
        tipo = "Equilátero"
        cant_equilateros += 1
    elif lado_a == lado_b or lado_a == lado_c or lado_b == lado_c:
        tipo = "Isósceles"
        cant_isosceles += 1
    else:
        tipo = "Escaleno"
        cant_escalenos += 1
    

    print(f"El triángulo {i+1} es {tipo}")
print("Resultados:")
print(f"Triángulos Equiláteros: {cant_equilateros}")
print(f"Triángulos Isósceles: {cant_isosceles}")
print(f"Triángulos Escalenos: {cant_escalenos}")
