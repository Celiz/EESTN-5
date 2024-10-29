
alumnos = ["Juan", "Maria", "Carlos", "Ana", "Pedro", "Laura", "Diego", "Sofia"]

notas = {
    "Juan": [7, 8, 9, 7, 8, 9],
    "Maria": [9, 9, 8, 9, 10, 9],
    "Carlos": [6, 7, 8, 7, 8, 7],
    "Ana": [8, 8, 9, 8, 9, 8],
    "Pedro": [7, 7, 8, 7, 8, 7],
    "Laura": [9, 8, 9, 9, 8, 9],
    "Diego": [7, 8, 7, 8, 7, 8],
    "Sofia": [8, 9, 8, 9, 8, 9]
}

for alumno, calificaciones in notas.items():
    promedio = sum(calificaciones) / len(calificaciones)
    print(f"Promedio de {alumno}: {promedio:.2f}")