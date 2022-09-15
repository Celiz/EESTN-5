
class cEmpleado{
    constructor(nombre,yearJoin, direccion){
        this.nombre = nombre;
        this.yearJoin = yearJoin;
        this.direccion = direccion;
    }

    getEdad(){
        return this.yearJoin;
    }
    getDireccion(){
        return this.direccion;
    }
    getNombre(){
        return this.nombre;
    }
}

const empleado1 = new cEmpleado("Robert", 1994, "64C- WallsStreat");
const empleado2 = new cEmpleado("Sam", 2000, "68D- WallsStreat");
const empleado3 = new cEmpleado("John", 1999, "26B- WallsStreat");

document.write(
    "<table>"
    +"<tr>"
    +"<th>Nombre</th>"
    +"<th>Año de ingreso</th>"
    +"<th>Dirección</th>"
    +"</tr>"
    +"<tr>"
    +"<td>"+empleado1.getNombre()+"</td>"
    +"<td>"+empleado1.getEdad()+"</td>"
    +"<td>"+empleado1.getDireccion()+"</td>"
    +"</tr>"
    +"<tr>"
    +"<td>"+empleado2.getNombre()+"</td>"
    +"<td>"+empleado2.getEdad()+"</td>"
    +"<td>"+empleado2.getDireccion()+"</td>"
    +"</tr>"
    +"<tr>"
    +"<td>"+empleado3.getNombre()+"</td>"
    +"<td>"+empleado3.getEdad()+"</td>"
    +"<td>"+empleado3.getDireccion()+"</td>"
    +"</tr>"
);

