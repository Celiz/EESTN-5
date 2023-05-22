n1 = int(input("Ingrese un numero: "))
n2 = int(input("Ingrese otro numero: "))
n3 = int(input("Ingrese otro numero: "))

if n1 > n2 and n2 > n3:
    print("El rango de numeros es " + str(n3) + " a " + str(n1))
    
elif n2 > n3 and n3 > n1:
    print("El rango de numeros es " + str(n1) + " a " + str(n2))
    
elif n3 > n1 and n1 > n2:
    print("El rango de numeros es " + str(n2) + " a " + str(n3))
    
elif n1 > n3 and n3 > n2:
    print("El rango de numeros es " + str(n2) + " a " + str(n1))
    
elif n2 > n1 and n3 > n2:  
    print("El rango de numeros es " + str(n1) + " a " + str(n3))
    
elif n3 > n2 and n2 > n1:
    print("El rango de numeros es " + str(n1) + " a " + str(n3))

    
    
     