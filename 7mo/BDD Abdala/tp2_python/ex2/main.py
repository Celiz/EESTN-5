def calcular_total(productos, compra):
    total = sum(productos.get(producto, 0) *
                cantidad for producto, cantidad in compra.items())
    return total


productos = {"manzana": 0.5, "pera": 0.6, "naranja": 0.4}
compra = {"manzana": 4, "pera": 2, "naranja": 10}
total = calcular_total(productos, compra)
print(f"Total a pagar: ${total:.2f}")
