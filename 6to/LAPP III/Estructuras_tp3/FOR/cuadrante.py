valor = int(input('Cuantos puntos ingresara: '))
x = 1
cuadrante1 = 0
cuadrante2 = 0
cuadrante3 = 0
cuadrante4 = 0

for f in range(valor):
    x = int(input('\nIngrese el valor de X del punto '+str(x)+': '))
    y = int(input('Ingrese el valor de Y del punto '+str(x)+': '))
    x += 1

    if x >= 0 and y >= 0:
        print('Esta en el primer cuadrante')
        cuadrante1 += 1
    elif x <= 0 and y >= 0:
        print('Esta en el segundo cuadrante')
        cuadrante2 += 1
    elif x <= 0 and y <= 0:
        print('Esta en el tercer cuadrante')
        cuadrante3 += 1
    elif x >= 0 and y <= 0:
        print('Esta en el cuarto cuadrante')
        cuadrante4 += 1

print('\nCuadrante 1: ', cuadrante1, '\nCuadrante 1: ', cuadrante2,
      '\nCuadrante 1: ', cuadrante3, '\nCuadrante 4: ', cuadrante4)