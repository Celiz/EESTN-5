# Diccionario para almacenar los datos de los empleados
empleados = {
    "Juan Pérez": {"edad": 35, "puesto": "Gerente"},
    "Ana Gómez": {"edad": 28, "puesto": "Analista"},
    "Carlos Rodríguez": {"edad": 42, "puesto": "Supervisor"},
    "Luisa Fernández": {"edad": 31, "puesto": "Coordinadora"},
    "Miguel Sánchez": {"edad": 25, "puesto": "Asistente"},
    "Sofía Martínez": {"edad": 39, "puesto": "Ingeniera"},
    "Diego Gutiérrez": {"edad": 27, "puesto": "Desarrollador"},
    "Isabel Torres": {"edad": 33, "puesto": "Contadora"},
    "Javier Herrera": {"edad": 29, "puesto": "Administrativo"},
    "Valentina Reyes": {"edad": 36, "puesto": "Recursos Humanos"}
}

def agregar_empleado():
    nombre = input("Ingrese el nombre del empleado: ")
    if nombre in empleados:
        print(f"El empleado {nombre} ya está registrado.")
    else:
        edad = int(input("Ingrese la edad del empleado: "))
        puesto = input("Ingrese el puesto del empleado: ")
        empleados[nombre] = {"edad": edad, "puesto": puesto}
        print(f"El empleado {nombre} ha sido agregado al registro.")

def listar_empleados():
    if not empleados:
        print("No hay empleados registrados.")
    else:
        print("Listado de empleados:")
        for nombre, datos in empleados.items():
            print(f"Nombre: {nombre}, Edad: {datos['edad']}, Puesto: {datos['puesto']}")

def actualizar_empleado():
    nombre = input("Ingrese el nombre del empleado a actualizar: ")
    if nombre in empleados:
        nueva_edad = int(input("Ingrese la nueva edad del empleado: "))
        nuevo_puesto = input("Ingrese el nuevo puesto del empleado: ")
        empleados[nombre]["edad"] = nueva_edad
        empleados[nombre]["puesto"] = nuevo_puesto
        print(f"Los datos de {nombre} han sido actualizados.")
    else:
        print(f"No se encontró un empleado con el nombre {nombre}.")

def eliminar_empleado():
    nombre = input("Ingrese el nombre del empleado a eliminar: ")
    if nombre in empleados:
        del empleados[nombre]
        print(f"El empleado {nombre} ha sido eliminado del registro.")
    else:
        print(f"No se encontró un empleado con el nombre {nombre}.")

def calcular_edad_promedio():
    if not empleados:
        print("No hay empleados registrados.")
    else:
        edades = [datos["edad"] for datos in empleados.values()]
        edad_promedio = sum(edades) / len(edades)
        print(f"La edad promedio de los empleados es: {edad_promedio:.2f}")

while True:
    print("\nMenú de Opciones:")
    print("1. Agregar empleado")
    print("2. Listar empleados")
    print("3. Actualizar empleado")
    print("4. Eliminar empleado")
    print("5. Calcular edad promedio")
    print("6. Salir")

    opcion = input("Ingrese el número de la opción que desea: ")

    if opcion == "1":
        agregar_empleado()
    elif opcion == "2":
        listar_empleados()
    elif opcion == "3":
        actualizar_empleado()
    elif opcion == "4":
        eliminar_empleado()
    elif opcion == "5":
        calcular_edad_promedio()
    elif opcion == "6":
        print("¡Hasta luego!")
        break
    else:
        print("Opción inválida. Por favor, intente de nuevo.")