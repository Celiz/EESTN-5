cantidad = 10
precio = 500
itemN = 90

miOrden = "Quiero {} piezas del item {} por {:.2f} pesos."
print(miOrden.format(cantidad, itemN, precio))

edad = 17
nombre = "Matias"

txt = "Mi nombre es {1}. Yo {1} tengo {0} años."
print(txt.format(edad, nombre))