salario = int(input("Ingrese su salario: "))
antiguedad = int(input("Ingrese su antiguedad: "))

if salario < 500 and antiguedad >= 10:
    print("Su nuevo salario es: ", salario*1.2)
    
elif salario < 500 and antiguedad < 10:
    print("Su nuevo salario es: ", salario*1.05)
    
elif salario >= 500:
    print("Su nuevo salario es: ", salario)     