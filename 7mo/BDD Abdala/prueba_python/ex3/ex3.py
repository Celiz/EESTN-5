def ingresar_calificaciones():
    calificaciones = []
    while True:
        try:
            calificacion = input("Ingrese una calificación (o 'fin' para terminar): ")
            if calificacion.lower() == 'fin':
                break
            calificacion = float(calificacion)
            if 0 <= calificacion <= 10:
                calificaciones.append(calificacion)
            else:
                print("Por favor ingrese una calificación entre 0 y 10")
        except ValueError:
            print("Por favor ingrese un número válido")
    
    if calificaciones:
        print(f"\nCalificación más alta: {max(calificaciones)}")
        print(f"Calificación más baja: {min(calificaciones)}")
        print(f"Promedio: {sum(calificaciones) / len(calificaciones):.2f}")
    else:
        print("No se ingresaron calificaciones")

ingresar_calificaciones()
