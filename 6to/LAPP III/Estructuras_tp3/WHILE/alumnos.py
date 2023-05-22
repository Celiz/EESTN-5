aprobados = 0
desaprobados = 0
x = 1

while x <= 10:
    nota = int(input("Ingrese la nota: "))
    if nota >= 7:
        aprobados = aprobados + 1
    else:
        desaprobados = desaprobados + 1
    x += 1
    
print("Cantidad de aprobados: ", aprobados)
print("Cantidad de desaprobados: ", desaprobados)    
    
    
    