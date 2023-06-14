#Confeccionar un programa que permita ingresar dos números en controles de tipo Entry, 
# luego sumar los dos valores ingresados y mostrar la suma en una Label al presionar un botón.

import tkinter as tk

class Aplicacion:
    def __init__(self):
        self.ventana1=tk.Tk()
        self.ventana1.title("Suma de dos números")
        self.label1=tk.Label(self.ventana1, text="Ingrese primer valor: ")
        self.label1.grid(column=0, row=0)
        self.dato1=tk.StringVar()
        self.entry1=tk.Entry(self.ventana1, width=10, textvariable=self.dato1)
        self.entry1.grid(column=1, row=0)
        self.label2=tk.Label(self.ventana1, text="Ingrese segundo valor: ")
        self.label2.grid(column=0, row=1)
        self.dato2=tk.StringVar()
        self.entry2=tk.Entry(self.ventana1, width=10, textvariable=self.dato2)
        self.entry2.grid(column=1, row=1)
        self.boton1=tk.Button(self.ventana1, text="Sumar", command=self.sumar)
        self.boton1.grid(column=0, row=2)
        self.label3=tk.Label(self.ventana1, text="Resultado: ")
        self.label3.grid(column=0, row=3)
        self.ventana1.mainloop()

    def sumar(self):
        suma=int(self.dato1.get())+int(self.dato2.get())
        self.label3["text"]="Resultado: "+str(suma)
        
aplicacion1=Aplicacion()

