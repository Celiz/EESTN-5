# Diccionario para almacenar los estudiantes y sus notas
estudiantes = {}

def ingresar_notas():
    # Solicitar nombre del estudiante
    nombre = input("\nIngrese el nombre del estudiante: ")
    
    # Lista para almacenar las notas
    notas = []
    
    # Solicitar las tres notas
    for i in range(3):
        while True:
            try:
                nota = float(input(f"Ingrese la nota {i+1} (1-10): "))
                if 1 <= nota <= 10:  # Validación del rango de notas
                    notas.append(nota)
                    break
                else:
                    print("La nota debe estar entre 1 y 10")
            except ValueError:
                print("Por favor, ingrese un número válido")
    
    # Almacenar las notas en el diccionario
    estudiantes[nombre] = notas
    
    # Calcular y mostrar el promedio
    promedio = sum(notas) / len(notas)
    print(f"\nEl promedio de {nombre} es: {promedio:.2f}")
    print(f"Notas registradas: {', '.join(map(str, notas))}")

def main():
    while True:
        print("\n=== SISTEMA DE NOTAS ===")
        print("1. Ingresar notas de un estudiante")
        print("2. Salir")
        
        opcion = input("\nSeleccione una opción (1-2): ")
        
        if opcion == "1":
            ingresar_notas()
        elif opcion == "2":
            print("\n¡Saliendo!")
            break
        else:
            print("\nOpción no válida. Por favor, seleccione 1 o 2.")

if __name__ == "__main__":
    main()
