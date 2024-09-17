def registrar_persona(registro, nombre, edad, correo):
    registro[nombre] = {"edad": edad, "correo": correo}

def filtrar_mayores_18(registro):
    return {nombre: datos for nombre, datos in registro.items() if datos["edad"] > 18}

registro = {}
registrar_persona(registro, "Juan", 25, "juan@email.com")
registrar_persona(registro, "Ana", 17, "ana@email.com")
registrar_persona(registro, "Carlos", 30, "carlos@email.com")

mayores_18 = filtrar_mayores_18(registro)
print("Personas mayores de 18:")
for nombre, datos in mayores_18.items():
    print(f"{nombre}: {datos}")
