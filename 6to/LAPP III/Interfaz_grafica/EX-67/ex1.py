import tkinter as tk
from tkinter import ttk


class Aplicacion:
    def __init__(self):
        self.ventana1 = tk.Tk()
        self.labelframe1 = ttk.LabelFrame(self.ventana1, text="Articulo")
        self.labelframe1.grid(column=0, row=0, padx=5, pady=10)
        self.form_articulo()
        self.labelframe2 = ttk.LabelFrame(self.ventana1, text="Opeaciones")
        self.labelframe2.grid(column=0, row=1, padx=5, pady=10)
        self.form_operaciones()
        self.ventana1.mainloop()

    def form_articulo(self):
        self.label1 = ttk.Label(self.labelframe1, text="Codigo de articulo:")
        self.label1.grid(column=0, row=0, padx=4, pady=4)
        self.entry1 = ttk.Entry(self.labelframe1, width=30)
        self.entry1.grid(column=1, row=0, padx=4, pady=4)
        self.label2 = ttk.Label(self.labelframe1, text="Descripcion:")
        self.label2.grid(column=0, row=1, padx=4, pady=4)
        self.entry2 = ttk.Entry(self.labelframe1, width=30)
        self.entry2.grid(column=1, row=1, padx=4, pady=4)
        self.label3 = ttk.Label(self.labelframe1, text="Precio:")
        self.label3.grid(column=0, row=2, padx=4, pady=4)
        self.entry3 = ttk.Entry(self.labelframe1, width=30)
        self.entry3.grid(column=1, row=2, padx=4, pady=4)


    def form_operaciones(self): 
        self.boton1 = ttk.Button(self.labelframe2, text="Agregar")
        self.boton1.grid(column=0, row=0, padx=4, pady=4)
        self.boton2 = ttk.Button(self.labelframe2, text="Modificar")
        self.boton2.grid(column=1, row=0, padx=4, pady=4)
        self.boton3 = ttk.Button(self.labelframe2, text="Eliminar")
        self.boton3.grid(column=2, row=0, padx=4, pady=4)
        
aplicacion1 = Aplicacion()
