n1 = int(input("Ingrese el primer numero: "))
n2 = int(input("Ingrese el segundo numero: "))
n3 = int(input("Ingrese el tercer numero: "))

if n1 > n2:
    if n1 > n3:
        print("El mayor es: ", n1)
    else:
        print("El mayor es: ", n3)
else:
    if n2 > n3:
        print("El mayor es: ", n2)
    else:
        print("El mayor es: ", n3)

        