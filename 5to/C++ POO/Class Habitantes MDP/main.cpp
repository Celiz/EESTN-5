#include<bits/stdc++.h>
#include<string>
#include "estadisticas.h"
#include <locale.h>

using namespace std;


void mostrarPersona(CParte *persona, int cantP){
	setlocale(LC_ALL, "spanish");
	
	//Recorre el objeto y lo muestra por pantalla
	cout<<"\tListado de personas: "<<endl;
	for(int i = 0; i < cantP; i++) {
			cout<<"\nNombre: "<<persona[i].getNombre();
			cout<<"\nEdad: "<<persona[i].getEdad();
			if(persona[i].getGenero() == 'h'){
				cout<<"\nGénero: Masculino";
			}
			else{
				cout<<"\nGénero: Femenino";
			}
			cout<<"\nAltura: "<<persona[i].getAltura()<<"cm";
			cout<<"\nNacionalidad: "<<persona[i].getNacionalidad();
			cout<<"\nCiudad: "<<persona[i].getCiudad()<<endl;
		}
	}

void filtros(CParte *persona, int cantP) {
	cout<<"\n\tPersonas que habitan en Mar del Plata: "<<endl;
		for(int i = 0; i < cantP; i++) {
			if(persona[i].habitaMDP())  {
				cout<<persona[i].getNombre()<<endl;
			}
		}
	
	cout<<"\n\tPersonas con nombre terminado en 'a': "<< endl;
		for (int i = 0; i < cantP; i++){
			if (persona[i].letraA()){
				cout<<persona[i].getNombre()<<endl;
			}
		}
		cout << "\n\tPersonas mayor de 18 años: " << endl;
			for(int i = 0; i < cantP; i++){
				if (persona[i].mayor18()){
					cout << persona[i].getNombre()<<endl;
			}
		}
}

 
int main(){
	setlocale(LC_ALL, "spanish");
	int cantP, edad;
	string nombre, nacionalidad, ciudad;
	char genero;
	float altura;
 
 	
	cout << "Cantidad de personas: "; cin >> cantP;
	CParte *persona = new CParte[cantP];
	for(int i = 0; i < cantP; i++) {
		fflush(stdin);//limpia el buffer
		cout << "Nombre: "; cin >> nombre;
		do{
			cout << "Género(h/m): "; cin >> genero;
		}while(genero != 'h' && genero != 'm');
		cout << "Edad: "; cin >> edad;
		cout << "Altura(en CM): "; cin >> altura;
		cout << "Nacionalidad: "; cin >> nacionalidad;
		cout << "Ciudad de residencia: ";cin.ignore(10000, '\n');getline(cin,ciudad);
		persona[i] = CParte(nombre, genero, edad, altura, nacionalidad, ciudad);
	}
 	mostrarPersona(persona, cantP);
 	filtros(persona, cantP);
 
	delete []persona;
 
	return 0;
}


