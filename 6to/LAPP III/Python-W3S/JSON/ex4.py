import json

x = {
    "nombre":"Matias",
    "edad":17,
    "estado civil":"soltero",
    "hijos":False,
    "mascotas":True,
    "hijos":None,
    "autos": [
        {"marca":"Ford", "modelo":"Mustang", "anio":1964},
        {"marca":"Fiat", "modelo":"500", "anio":2018},
    ]
}

print("JSON string"+json.dumps(x)) #objeto python-->JSON

print("Identado"+json.dumps(x, indent=4)) #objeto python-->JSON con indentacion

print("Identado + separadores"+json.dumps(x, indent=5, separators=(". ", " = "))) #objeto python-->JSON con indentacion y separadores

print("Ordenados"+json.dumps(x, indent=4, sort_keys=True)) #objeto python-->JSON con indentacion, ordenado y separadores
