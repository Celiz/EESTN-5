#Mediante dos controles de tipo Entry permitir el ingreso de dos números. 
# Crear un menú que contenga una opción que cambie el tamaño de la ventana con los valores ingresados 
# por teclado. Finalmente disponer otra opción que finalice el programa

import tkinter as tk

class Aplicacion:
    def __init__(self):
        self.ventana1=tk.Tk()
        self.ventana1.title("Ventana con botones")
        self.label1=tk.Label(self.ventana1, text="Número 1:")
        self.label1.grid(column=0, row=0)
        self.label2=tk.Label(self.ventana1, text="Número 2:")
        self.label2.grid(column=0, row=1)
        self.entry1=tk.Entry(self.ventana1, width=30) #ENTRY1
        self.entry1.grid(column=1, row=0)
        self.entry2=tk.Entry(self.ventana1, width=30) #ENTRY2
        self.entry2.grid(column=1, row=1)
        self.menubar1=tk.Menu(self.ventana1)
        self.ventana1.config(menu=self.menubar1)
        self.opciones1=tk.Menu(self.menubar1, tearoff=0)
        self.menubar1.add_cascade(label="Opciones", menu=self.opciones1)
        self.opciones1.add_command(label="Cambiar tamaño", command=self.cambiar_tamaño)
        self.opciones1.add_command(label="Finalizar", command=self.ventana1.destroy)
        self.ventana1.mainloop()

    def cambiar_tamaño(self):
        self.ventana1.geometry(self.entry1.get() + "x" + self.entry2.get())
        
aplicacion1=Aplicacion()