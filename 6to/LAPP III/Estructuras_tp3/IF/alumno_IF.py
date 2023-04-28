nota1 = int(input("Ingrese la nota 1: "))
nota2 = int(input("Ingrese la nota 2: "))
nota3 = int(input("Ingrese la nota 3: "))

promedio = (nota1 + nota2 + nota3) / 3

if promedio >= 7:
    print("Promocionado")
else:
    print("No promocionado")