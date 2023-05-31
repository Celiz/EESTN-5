import re

txt = "Salta la linda"

x = re.search("\s", txt)

print("El primer espacio en blanco esta en la posicion: ", x.start())