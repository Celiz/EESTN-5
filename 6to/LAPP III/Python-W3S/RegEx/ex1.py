#module RegEx
import re


txt = "Salta la linda"
x = re.search("^Salta.*linda$", txt)

print(x)