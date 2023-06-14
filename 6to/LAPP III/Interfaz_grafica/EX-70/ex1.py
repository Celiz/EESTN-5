import tkinter as tk
from tkinter import ttk

class Aplicacion:

    def __init__(self):
        self.ventana1=tk.Tk()
        self.agregar_menu()
        self.ventana1.mainloop()

    def agregar_menu(self):
        self.menubar1 = tk.Menu(self.ventana1)
        self.ventana1.config(menu=self.menubar1)
        self.opciones1 = tk.Menu(self.menubar1, tearoff=0)
        self.opciones1.add_command(label="Configurar ventana", command=self.configurar)
        self.menubar1.add_cascade(label="Opciones", menu=self.opciones1)    

    def configurar(self):
        dialogo1 = DialogoTamano(self.ventana1)
        s=dialogo1.mostrar()
        self.ventana1.geometry(s[0]+"x"+s[1])
        

class DialogoTamano:

    def __init__(self, ventanaprincipal):
        self.dialogo=tk.Toplevel(ventanaprincipal)
        self.label1=ttk.Label(self.dialogo, text="Ingrese ancho:")
        self.label1.grid(column=0, row=0, padx=5, pady=5)
        self.dato1=tk.StringVar()
        self.entry1=ttk.Entry(self.dialogo, textvariable=self.dato1)
        self.entry1.grid(column=1, row=0, padx=5, pady=5)
        self.entry1.focus()
        self.label2=ttk.Label(self.dialogo, text="Ingrese alto:")
        self.label2.grid(column=0, row=1, padx=5, pady=5)
        self.dato2=tk.StringVar()
        self.entry2=ttk.Entry(self.dialogo, textvariable=self.dato2)
        self.entry2.grid(column=1, row=1, padx=5, pady=5)
        self.boton1=ttk.Button(self.dialogo, text="Confirmar", command=self.confirmar)
        self.boton1.grid(column=1, row=2, padx=5, pady=5)
        self.dialogo.protocol("WM_DELETE_WINDOW", self.confirmar)
        self.dialogo.resizable(0,0)
        self.dialogo.grab_set()

    def mostrar(self):
        self.dialogo.wait_window()
        return (self.dato1.get(), self.dato2.get())

    def confirmar(self):
        self.dialogo.destroy()


aplicacion1=Aplicacion() 