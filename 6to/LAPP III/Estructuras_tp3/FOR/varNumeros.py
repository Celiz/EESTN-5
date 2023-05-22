negativos = 0
positivos = 0
multiplo15 = 0
pares = 0
x = 1

for f in range(10):
    val = int(input('\nIngrese el valor '+str(x)+': '))
    if val < 0:
        negativos += 1
        print('Negativo')
    elif val > 0:
        positivos += 1
        print('Positivo')
    if val % 15 == 0:
        multiplo15 += 1
        print('Multiplo de 15')
    if val % 2 == 0:
        pares += 1
        print('Par')
    x += 1

print('\nPositivos:', positivos, '\nNegativos:', negativos,
      '\nMultiplos de 15:', multiplo15, '\nPares:', pares)