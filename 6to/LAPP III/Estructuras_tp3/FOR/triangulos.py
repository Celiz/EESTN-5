x = int(input('Cuantos triangulos ingresara: '))
triangulo = 1
mayor = 0

for f in range(x):
    base = int(input('\nIngrese base del triangulo '+str(triangulo)+': '))
    altura = int(input('Ingrese altura del triangulo '+str(triangulo)+': '))
    superficie = (base*altura)/2
    print('La superficie es:', superficie)
    triangulo += 1

    if superficie >= 12:
        mayor += 1

print('\nSuperficies > 12:', mayor)