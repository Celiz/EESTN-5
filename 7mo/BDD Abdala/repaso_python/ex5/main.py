import sqlite3
import os

# 1. Crear la base de datos y la conexión
conn = sqlite3.connect('repaso_python/ex3/escuela.db')
cursor = conn.cursor()

# 2. Crear la tabla estudiantes
cursor.execute('''
    CREATE TABLE IF NOT EXISTS estudiantes (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT,
        promedio REAL
    )
''')

# Nueva función para leer datos del archivo e insertarlos en la BD
def cargar_datos_desde_archivo(nombre_archivo):
    try:
        with open(nombre_archivo, 'r', encoding='utf-8') as archivo:
            nuevos_registros = 0
            for linea in archivo:
                # Asumimos que el formato del archivo es: nombre,promedio
                nombre, promedio = linea.strip().split(',')
                promedio = float(promedio)
                
                # Verificar si el estudiante ya existe
                cursor.execute('SELECT COUNT(*) FROM estudiantes WHERE nombre = ?', (nombre,))
                if cursor.fetchone()[0] == 0:
                    cursor.execute('INSERT INTO estudiantes (nombre, promedio) VALUES (?, ?)',
                                 (nombre, promedio))
                    nuevos_registros += 1
            
            conn.commit()
            if nuevos_registros > 0:
                print(f"\nSe han insertado {nuevos_registros} nuevos registros desde el archivo.")
                print("\nRegistros insertados:")
                mostrar_estudiantes_recientes(nuevos_registros)
            else:
                print("\nNo se encontraron nuevos registros para insertar.")
                
    except FileNotFoundError:
        print(f"\nError: No se encontró el archivo {nombre_archivo}")
    except ValueError:
        print("\nError: El archivo no tiene el formato correcto (nombre,promedio)")
    except Exception as e:
        print(f"\nError inesperado: {str(e)}")

# Función para mostrar los registros más recientes
def mostrar_estudiantes_recientes(limite):
    cursor.execute('SELECT * FROM estudiantes ORDER BY id DESC LIMIT ?', (limite,))
    estudiantes = cursor.fetchall()
    
    print("\nÚltimos registros insertados:")
    print("-" * 40)
    print("ID  |  Nombre          |  Promedio")
    print("-" * 40)
    for estudiante in estudiantes:
        print(f"{estudiante[0]:<4}|  {estudiante[1]:<15} |  {estudiante[2]:.2f}")

# 4. Función para agregar nuevo estudiante
def agregar_estudiante():
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
    
    cursor.execute('INSERT INTO estudiantes (nombre, promedio) VALUES (?, ?)', (nombre, promedio))
    conn.commit()
    print(f"\nEstudiante {nombre} agregado correctamente con promedio {promedio}")

# 5. Función de búsqueda
def buscar_estudiante():
    nombre = input("\nIngrese el nombre del estudiante a buscar: ")
    
    cursor.execute('SELECT nombre, promedio FROM estudiantes WHERE nombre LIKE ?', ('%'+nombre+'%',))
    resultados = cursor.fetchall()
    
    if resultados:
        print("\nEstudiantes encontrados:")
        for estudiante in resultados:
            print(f"Nombre: {estudiante[0]}")
            print(f"Promedio: {estudiante[1]}")
            print("-" * 30)
    else:
        print(f"\nNo se encontró ningún estudiante con el nombre '{nombre}'")

# 6. Función para mostrar todos los estudiantes
def mostrar_estudiantes():
    cursor.execute('SELECT * FROM estudiantes')
    estudiantes = cursor.fetchall()
    
    if estudiantes:
        print("\nLista de todos los estudiantes:")
        print("-" * 40)
        print("ID  |  Nombre          |  Promedio")
        print("-" * 40)
        for estudiante in estudiantes:
            print(f"{estudiante[0]:<4}|  {estudiante[1]:<15} |  {estudiante[2]:.2f}")
    else:
        print("\nNo hay estudiantes registrados")

# 7. Menú principal
while True:
    print("\n=== SISTEMA DE ESTUDIANTES ===")
    print("1. Agregar nuevo estudiante")
    print("2. Buscar estudiante")
    print("3. Mostrar todos los estudiantes")
    print("4. Cargar datos desde archivo")
    print("5. Salir")
    
    opcion = input("\nSeleccione una opción (1-5): ")
    
    if opcion == "1":
        agregar_estudiante()
    elif opcion == "2":
        buscar_estudiante()
    elif opcion == "3":
        mostrar_estudiantes()
    elif opcion == "4":
        nombre_archivo = input("\nIngrese el nombre del archivo (ej: datos_estudiantes.txt): ")
        nombre_archivo = os.path.join('repaso_python', 'ex5', nombre_archivo)
        cargar_datos_desde_archivo(nombre_archivo)
    elif opcion == "5":
        print("\n¡Hasta luego!")
        break
    else:
        print("\nOpción no válida")

# Cerrar la conexión
conn.close()