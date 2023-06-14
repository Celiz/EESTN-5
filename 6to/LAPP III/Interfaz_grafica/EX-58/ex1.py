#Disponer dos objetos de la clase Button con las etiquetas: "varón" y "mujer", 
# al presionarse mostrar en la barra de títulos de la ventana la etiqueta del botón presionado.

import tkinter as tk

class Aplicacion:
    def __init__(self):
        self.ventana1=tk.Tk()
        self.ventana1.title("Ventana con botones")
        self.boton1=tk.Button(self.ventana1, text="Varón", command=self.presion_varon)
        self.boton1.grid(column=0, row=0)
        self.boton2=tk.Button(self.ventana1, text="Mujer", command=self.presion_mujer)
        self.boton2.grid(column=1, row=0)
        self.ventana1.mainloop()

    def presion_varon(self):
        self.ventana1.title("Varón")

    def presion_mujer(self):
        self.ventana1.title("Mujer")
        
aplicacion1=Aplicacion()        
