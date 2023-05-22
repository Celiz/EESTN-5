x = int(input("Ingrese cordenada X: "))
y = int(input("Ingrese cordenada Y: "))

if x > 0 and y > 0:
    print("Se encuentra en el primer cuadrante")
    
elif x < 0 and y > 0:
    print("Se encuentra en el segundo cuadrante")
    
elif x < 0 and y < 0:
    print("Se encuentra en el tercer cuadrante")

elif x > 0 and y < 0:
    print("Se encuentra en el cuarto cuadrante")
    