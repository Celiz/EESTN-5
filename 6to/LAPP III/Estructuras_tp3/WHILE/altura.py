nPersonas = int(input("Ingrese el número de personas: "))
x = 1
suma = 0
while x <= nPersonas:
    altura = float(input("Ingrese la altura de la persona: "))
    suma += altura
    
    x+=1
promedio = suma / nPersonas

print("El promedio de altura es: ", promedio)    
        
    