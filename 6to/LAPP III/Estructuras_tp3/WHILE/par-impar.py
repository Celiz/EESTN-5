x = int(input("Ingrese cantidad de numeros: "))
num = 1
par = 0
impar = 0

while num <= x:
    valor = int(input('\nIngrese valor '+str(num)+': '))
    num += 1
    if valor % 2 == 0:
        print('Es par')
        par += 1
    else:
        print('Es impar')
        impar += 1

print('\nPares:', par, '\nImpares:', impar)