export class Persona {
    constructor(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    mostrarInformacion() {
        return `Nombre: ${this.nombre}, Edad: ${this.edad}`;
    }
}