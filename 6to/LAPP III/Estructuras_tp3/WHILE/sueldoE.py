nEmpleados = int(input("Ingrese la cantidad de empleados: "))
i=1
cant1 = 0
cant2 = 0
cant3 = 0
importeGastado=0
while i <= nEmpleados:
    sueldo = float(input("Ingrese el sueldo del empleado: "))
    if sueldo > 100 and sueldo < 500:
        cant1 = cant1 + 1
    if sueldo > 100 and sueldo < 300:
        cant2 = cant2 + 1
    if sueldo > 300:
        cant3 = cant3 + 1
    importeGastado = importeGastado + sueldo

    i = i + 1
print("Cantidad de empleados con sueldo entre 100 y 500: ", cant1)
print("Cantidad de empleados con sueldo entre 100 y 300: ", cant2)
print("Cantidad de empleados con sueldo mayor a 300: ", cant3)
print("Importe gastado: ", importeGastado)