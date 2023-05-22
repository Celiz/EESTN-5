x = int(input('Ingrese un numero del 1-10: '))

for i in range(3):
    if x > 10:
        x = int(input('Ingrese un numero del 1-10: '))
    else:
        for i in range(x, x*13, x):
            print(i)