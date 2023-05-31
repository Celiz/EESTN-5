import re

txt = "Salta la linda"
x = re.sub("\su", "!", txt) #remplaza espacios en blancos por carater especificado

print(x)