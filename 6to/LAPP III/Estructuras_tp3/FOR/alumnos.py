suma1 = 0
suma2 = 0
suma3 = 0
x = 1
for f in range(5):
    edad = int(input('Ingrese la edad del alumno '+str(x)+' turno mañana: '))
    suma1 += edad
    promedio1 = suma1/5
    x += 1
print('\nPromedio de edad turno mañana=', round(promedio1, 2))
x = 1

for f in range(6):
    edad = int(input('Ingrese la edad del alumno '+str(x)+' turno tarde: '))
    suma2 += edad
    promedio2 = suma2/6
    x += 1
print('\nPromedio de edad turno tarde=', round(promedio2, 2))
x = 1

for f in range(11):
    edad = int(input('Ingrese la edad del alumno '+str(x)+' turno noche: '))
    suma3 += edad
    promedio3 = suma3/11
    x += 1
print('\nPromedio de edad turno noche=', round(promedio3, 2))

if promedio1 > promedio2 and promedio1 > promedio3:
    print('\nEl mayor promedio es:', round(promedio1, 2), 'del turno mañana')
elif promedio2 > promedio3:
    print('\nEl mayor promedio es:', round(promedio2, 2), 'del turno tarde')
else:
    print('\nEl mayor promedio es:', round(promedio3, 2), 'del turno noche')