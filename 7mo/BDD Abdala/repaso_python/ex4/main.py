def crear_archivo_inicial():
    """Crea el archivo notas.txt si no existe con algunos datos de ejemplo"""
    try:
        with open('repaso_python/ex4/notas.txt', 'a') as archivo:
            if archivo.tell() == 0:  # Si el archivo está vacío
                archivo.write("=== REGISTRO DE NOTAS DE ESTUDIANTES ===\n")
                archivo.write("Nombre: Juan Pérez | Promedio: 8.5\n")
                archivo.write("Nombre: María López | Promedio: 9.2\n")
                archivo.write("Nombre: Carlos Ruiz | Promedio: 7.8\n")
                print("Archivo notas.txt creado con datos de ejemplo.")
            else:
                print("El archivo notas.txt ya existe.")
    except Exception as e:
        print(f"Error al crear el archivo: {e}")

def mostrar_contenido():
    """Lee y muestra el contenido del archivo notas.txt"""
    try:
        with open('repaso_python/ex4/notas.txt', 'r') as archivo:
            contenido = archivo.read()
            print("\nContenido del archivo notas.txt:")
            print("-" * 40)
            print(contenido)
    except FileNotFoundError:
        print("El archivo notas.txt no existe aún.")
    except Exception as e:
        print(f"Error al leer el archivo: {e}")

def agregar_estudiante():
    """Agrega un nuevo estudiante al archivo"""
    try:
        nombre = input("\nIngrese el nombre del estudiante: ")
        
        while True:
            try:
                promedio = float(input("Ingrese el promedio del estudiante (1-10): "))
                if 1 <= promedio <= 10:
                    break
                else:
                    print("El promedio debe estar entre 1 y 10")
            except ValueError:
                print("Por favor, ingrese un número válido")
        
        with open('repaso_python/ex4/notas.txt', 'a') as archivo:
            archivo.write(f"Nombre: {nombre} | Promedio: {promedio:.1f}\n")
        
        print(f"\nEstudiante {nombre} agregado correctamente con promedio {promedio}")
    
    except Exception as e:
        print(f"Error al agregar estudiante: {e}")

def main():
    # Crear el archivo si no existe
    crear_archivo_inicial()
    
    while True:
        print("\n=== SISTEMA DE NOTAS ===")
        print("1. Mostrar todos los estudiantes")
        print("2. Agregar nuevo estudiante")
        print("3. Salir")
        
        opcion = input("\nSeleccione una opción (1-3): ")
        
        if opcion == "1":
            mostrar_contenido()
        elif opcion == "2":
            agregar_estudiante()
        elif opcion == "3":
            print("\n¡Saliendo!")
            break
        else:
            print("\nOpción no válida")

if __name__ == "__main__":
    main()