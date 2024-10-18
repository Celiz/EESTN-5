# Paso 1: Crear y escribir en el archivo "mi archivo.txt"
with open("mda2/ex1/mi_archivo.txt", "w") as archivo:
    archivo.write("Hola, estoy aprendiendo Python!!!!!")

# Paso 2: Leer y mostrar el contenido del archivo
with open("mda2/ex1/mi_archivo.txt", "r") as archivo:
    contenido = archivo.read()
    print(contenido)