#include<iostream>
#include<vector>
#include<string>
#include "estadisticas.h"

using namespace std;

void listaP(CParte *array){
	cout<<"\tListado de personas: "<<endl;
	for(int i=0; i<5; i++){
		//lista de todas las personas(CParte *array)
		cout<<"\nNombre: "<<array[i].getNombre();
		cout<<"\nGenero: "<<array[i].getGenero();
		cout<<"\nEdad: "<<array[i].getEdad();
		cout<<"\nAltura: "<<array[i].getAltura();
		cout<<"\nNacionalidad: "<<array[i].getNacionalidad();
		cout<<"\nCiudad: "<<array[i].getCiudad()<<endl;	
	}
}

void habitaMdP(CParte *array){
	cout<<"\n\tPersonas que residen en Mar del Plata: \n";
	for(int i=0; i<5; i++){
		//comprueba si la ciudad de algunas de las personas(CParte *array), es igual a Mar del Plata, en caso de serlo lo muestra por pantalla
		if(array[i].getCiudad() == "Mar del Plata"){
		cout<<"\nNombre: "<<array[i].getNombre();
		cout<<"\nGenero: "<<array[i].getGenero();
		cout<<"\nEdad: "<<array[i].getEdad();
		cout<<"\nAltura: "<<array[i].getAltura();
		cout<<"\nNacionalidad: "<<array[i].getNacionalidad();
		cout<<"\nCiudad: "<<array[i].getCiudad()<<endl;	
		}
	}
}

void mayoresEdad(CParte *array){
	cout<<"\n\tMayores de edad: \n";
	for(int i=0; i<5; i++){
		//comprueba si la edad de algunos de las personas(CParte *array), es mayor a 18, en caso de serlo se muestra por pantalla 
		if(array[i].getEdad() > 18){
		
		cout<<"\nNombre: "<<array[i].getNombre();
		cout<<"\nGenero: "<<array[i].getGenero();
		cout<<"\nEdad: "<<array[i].getEdad();
		cout<<"\nAltura: "<<array[i].getAltura();
		cout<<"\nNacionalidad: "<<array[i].getNacionalidad();
		cout<<"\nCiudad: "<<array[i].getCiudad()<<endl;	
		}
	}
}

void letraA(CParte *array){
	cout<<"\n\tPersonas que terminan con la letra 'a': \n";
	for(int i=0; i<5; i++){
		//comprueba si el nombre termina con la letra 'a', en caso de hacerlo muestra los datos por pantalla
		if(array[i].getNombre()[array[i].getNombre().length()-1] == 'a'){
			cout<<"\nNombre: "<<array[i].getNombre();
			cout<<"\nGenero: "<<array[i].getGenero();
			cout<<"\nEdad: "<<array[i].getEdad();
			cout<<"\nAltura: "<<array[i].getAltura();
			cout<<"\nNacionalidad: "<<array[i].getNacionalidad();
			cout<<"\nCiudad: \n"<<array[i].getCiudad()<<endl;	
		}
		
	}
		
}





int main(){
	cout<<"Crear 3 personas"<<endl;
	//creacion del objeto(persona)
	CParte *persona = new CParte[5];
	
	persona[0]= CParte("Pablo", "Masculino", 46, 189, "Argentina", "Mar del Plata");
	persona[1]= CParte("Maximo", "Masculino", 36, 159, "Argentina", "Ciudad Autonoma de Buenos Aires");
	persona[2]= CParte("Alan", "Masculino", 16, 199, "Argentina", "Mar del Tuyu");
	persona[3]= CParte("Lamas", "Masculino", 17, 199, "Argentina", "Mar del Plata");
	persona[4]= CParte("Martina", "Femenino", 16, 199, "Argentina", "Las Toninas");
	
	listaP(persona);
	habitaMdP(persona);
	mayoresEdad(persona);
	letraA(persona);
	

	return 0;
}



