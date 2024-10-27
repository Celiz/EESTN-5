# Lista para almacenar los productos
productos = ["Laptop", "Mouse", "Teclado"]  # Productos iniciales como ejemplo

while True:
    # Mostrar el menú
    print("\n=== MENÚ DE OPCIONES ===")
    print("1. Mostrar lista de productos")
    print("2. Agregar nuevo producto")
    print("3. Salir")
    
    # Solicitar opción al usuario
    opcion = input("\nSeleccione una opción (1-3): ")
    
    # Procesar la opción seleccionada
    if opcion == "1":
        print("\nLista de productos:")
        for i, producto in enumerate(productos, 1):
            print(f"{i}. {producto}")
            
    elif opcion == "2":
        nuevo_producto = input("\nIngrese el nombre del nuevo producto: ")
        productos.append(nuevo_producto)
        print(f"Producto '{nuevo_producto}' agregado exitosamente!")
        
    elif opcion == "3":
        print("\n¡Saliendo!")
        break
        
    else:
        print("\nOpción no válida. Por favor, seleccione una opción válida (1-3)")