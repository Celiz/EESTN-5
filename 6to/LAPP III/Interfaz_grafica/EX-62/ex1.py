#Solicitar el ingreso del nombre de una persona y seleccionar de un control Listbox un país. 
# Al presionar un botón mostrar en la barra de la ventana el nombre ingresado y el país seleccionado.

import tkinter as tk

class Aplicacion:
    def __init__(self):
        self.ventana1=tk.Tk()
        self.ventana1.title("Ventana con botones")
        self.label1=tk.Label(self.ventana1, text="Nombre:")
        self.label1.grid(column=0, row=0)
        self.dato1=tk.StringVar()
        self.entry1=tk.Entry(self.ventana1, width=20, textvariable=self.dato1)
        self.entry1.grid(column=1, row=0)
        self.label2=tk.Label(self.ventana1, text="País:")
        self.label2.grid(column=0, row=1)
        self.listbox1=tk.Listbox(self.ventana1, height=3)
        self.listbox1.grid(column=1, row=1)
        self.listbox1.insert(0, "Argentina")
        self.listbox1.insert(1, "Brasil")
        self.listbox1.insert(2, "Chile")
        self.boton1=tk.Button(self.ventana1, text="Mostrar", command=self.mostrar)
        self.boton1.grid(column=1, row=2)
        self.ventana1.mainloop()

    def mostrar(self):
        cadena=self.dato1.get()+" - "+self.listbox1.get(tk.ACTIVE)
        self.ventana1.title(cadena)
        
aplicacion1=Aplicacion()