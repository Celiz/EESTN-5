suma = 0
x = 1
for i in range(10):
    valor = int(input('Ingrese valor '+str(x)+': '))
    if i >= 5:
        suma += valor
    x += 1

print('La suma es:', suma)