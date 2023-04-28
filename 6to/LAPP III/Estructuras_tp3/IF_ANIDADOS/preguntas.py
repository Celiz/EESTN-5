nPreguntas = int(input("Ingrese la cantidad de preguntas: "))
nCorrectas = int(input("Ingrese la cantidad de respuestas correctas: "))

porcentaje = (nCorrectas * 100) / nPreguntas

if porcentaje >= 90:
    print("Nivel maximo")
elif porcentaje >= 75:
    print("Nivel medio")
elif porcentaje >= 50:
    print("Nivel regular")
else:
    print("Fuera de nivel")
    