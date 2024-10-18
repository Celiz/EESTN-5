# Paso 1: Crear y escribir en el archivo "notas.txt"
with open("mda2/ex2/notas.txt", "w") as archivo:
    archivo.write("Matematicas es mi favorita\n")
    archivo.write("Fisica es muy interesante\n")
    archivo.write("Programacion me encanta\n")

# Paso 2: Leer y mostrar las líneas del archivo
with open("mda2/ex2/notas.txt", "r") as archivo:
    for linea in archivo:
        print(linea.strip())  # strip() elimina el salto de línea