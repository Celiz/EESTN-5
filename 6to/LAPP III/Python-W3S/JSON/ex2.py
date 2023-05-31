import json

x = {
    "nombre":"Matias",
    "edad":17,
    "ciudad":"Mar del Plata"
}

#diccionario-->JSON

y = json.dumps(x)

print(y) #JSON STRING