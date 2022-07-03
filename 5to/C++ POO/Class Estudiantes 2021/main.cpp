#include <iostream>
#include "estudiantes.h"
#include <locale.h>
using namespace std;


void datos(cEstudiantes *vector, int cantP){
	setlocale(LC_ALL, "spanish");
	cout<<"\n\tListado de estudiantes"<<endl<<endl;
	for(int i=0;i<cantP;i++){
		cout<<"Nombre: "<<vector[i].getNombre()<<endl;
		cout<<"Apellido: "<<vector[i].getApellido()<<endl;
		cout<<"Fecha: "<<vector[i].getDia() << "/"<<vector[i].getMes() << "/"<<vector[i].getAnio()<<endl;
		cout<<"Nota: "<<vector[i].getNotas()<<endl;
		
			if(vector[i].aprobo2021()){
				if(vector[i].Aprobado()){
					cout<<"El alumno: "<<vector[i].getNombre()<<" aprobó en 2021"<<endl<<endl;
			}
			else {
				cout<<"El alumno: "<<vector[i].getNombre()<<" desaprobó en 2021"<<endl<<endl;
			}
		}
		else{
			cout<<"El alumno: "<<vector[i].getNombre()<<" no rindió en 2021"<<endl<<endl;
		}
	}	
}

int main() {
	setlocale(LC_ALL, "spanish");
	int cantP;
	string nombre, apellido;
	int dia, mes, anio;
	float nota;

	cout << "Cantidad de estudiantes: "; cin >> cantP;
	cEstudiantes *estudiante = new cEstudiantes[cantP];
	for(int i = 0; i < cantP; i++){
		cout<<"Nombre: "; cin>>nombre;
		cout<<"Apellido: "; cin>>apellido;
		cout<<"Dia: "; cin>>dia;	
		cout<<"Mes: "; cin>>mes;
		cout<<"Año: "; cin>>anio;
		cout<<"Nota: "; cin>>nota;
		estudiante[i] = cEstudiantes(nombre, apellido, dia, mes, anio, nota);
	}
	
    datos(estudiante, cantP);

    delete[]estudiante;
 
    return 0;
}

