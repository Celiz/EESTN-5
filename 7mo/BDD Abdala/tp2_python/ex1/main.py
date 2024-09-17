def estudiantes_edad_extrema(estudiantes):
    if not estudiantes:
        return None, None
    
    estudiante_mayor = max(estudiantes, key=lambda x: x[1])
    estudiante_menor = min(estudiantes, key=lambda x: x[1])
    
    return estudiante_mayor, estudiante_menor


estudiantes = [("Ana", 22), ("Carlos", 18), ("María", 24), ("Pedro", 19)]
mayor, menor = estudiantes_edad_extrema(estudiantes)
print(f"Estudiante mayor: {mayor}")
print(f"Estudiante menor: {menor}")
