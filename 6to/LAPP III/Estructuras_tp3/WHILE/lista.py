sum1 = 0
sum2 = 0
n = 1

while n <= 15:
    valor = int(input('Ingrese el valor '+str(n)+' de la primer lista: '))
    sum1 += valor
    n += 1
    
n = 1
print('\n')
while n <= 15:
    valor = int(input('Ingrese el valor '+str(n)+' de la segunda lista: '))
    sum2 += valor
    n += 1

if sum1 > sum2:
    print('\nLa lista 1 es mayor')
elif sum1 < sum2:
    print('\nLa lista 2 es mayor')
else:
    print('\nLas listas son iguales')

print('Lista 1:', sum1, '\nLista 2:', sum2)