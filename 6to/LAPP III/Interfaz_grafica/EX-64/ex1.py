#Solicitar el ingreso del nombre de una persona y seleccionar de un control Combobox un país. 
# Al presionar un botón mostrar en la barra de la ventana el nombre ingresado y el país seleccionado.

import tkinter as tk
from tkinter import ttk

class Aplicacion:
    def __init__(self):
        self.ventana1=tk.Tk()
        self.ventana1.title("Ventana con botones")
        self.label1=tk.Label(self.ventana1, text="Nombre:")
        self.label1.grid(column=0, row=0)
        self.label2=tk.Label(self.ventana1, text="País:")
        self.label2.grid(column=0, row=1)
        self.entry1=tk.Entry(self.ventana1, width=30)
        self.entry1.grid(column=1, row=0)
        self.combobox1=ttk.Combobox(self.ventana1, state="readonly")
        self.combobox1.grid(column=1, row=1)
        self.combobox1["values"]=("Argentina", "Brasil", "Chile", "Uruguay", "Paraguay", "Bolivia")
        self.boton1=tk.Button(self.ventana1, text="Mostrar", command=self.mostrar)
        self.boton1.grid(column=1, row=2)
        self.ventana1.mainloop()

    def mostrar(self):
        cadena=self.entry1.get()
        cadena=cadena + " - " + self.combobox1.get()
        self.ventana1.title(cadena)
        
aplicacion1=Aplicacion()        