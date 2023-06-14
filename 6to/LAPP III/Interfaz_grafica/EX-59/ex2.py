#Ingresar el nombre de usuario y clave en controles de tipo Entry. 
# Si se ingresa las cadena (usuario: juan, clave="abc123") luego mostrar en el título de la ventana el mensaje 
# "Correcto" en caso contrario mostrar el mensaje "Incorrecto".
#Para mostrar '*' cuando se ingresa la clave debemos pasar en el parámetro 'show' el caracter a mostrar:

import tkinter as tk

class Aplicacion:
    def __init__(self):
        self.ventana1=tk.Tk()
        self.ventana1.title("Ingreso de usuario y clave")
        self.label1=tk.Label(self.ventana1, text="Usuario: ")
        self.label1.grid(column=0, row=0)
        self.usuario=tk.StringVar()
        self.entry1=tk.Entry(self.ventana1, width=10, textvariable=self.usuario)
        self.entry1.grid(column=1, row=0)
        self.label2=tk.Label(self.ventana1, text="Clave: ")
        self.label2.grid(column=0, row=1)
        self.clave=tk.StringVar()
        self.entry2=tk.Entry(self.ventana1, width=10, textvariable=self.clave, show="*")
        self.entry2.grid(column=1, row=1)
        self.boton1=tk.Button(self.ventana1, text="Validar", command=self.validar)
        self.boton1.grid(column=0, row=2)
        self.ventana1.mainloop()

    def validar(self):
        if self.usuario.get()=="juan" and self.clave.get()=="abc123":
            self.ventana1.title("Correcto")
        else:
            self.ventana1.title("Incorrecto")
            
aplicacion1=Aplicacion()

