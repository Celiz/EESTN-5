import re

txt = "Salta la linda"  

x = re.search(r"\bS\w+", txt)

print(x.span()) #devuelve la posicion de la primera coincidencia y la ultima
print(x.string) #devuleve el string si concide
print(x.group()) #Literalmente devuleve lo primeor que coicide