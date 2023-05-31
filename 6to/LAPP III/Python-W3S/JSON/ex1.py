#JSON module
import json

x = '{"nombre":"Matias", "edad":17, "ciudad":"Mar del Plata"}'

y = json.loads(x)

print(y["edad"])