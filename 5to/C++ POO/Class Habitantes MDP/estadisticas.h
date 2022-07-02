#ifndef estadisticas_H
#define	estadisticas_H
#include<bits/stdc++.h>
using namespace std;
 
class CParte{
public:
    CParte(string nom, char gen, int ed, int al, string nac, string ciu);
  	CParte();
   ~CParte();
    string getNombre();
    char getGenero();
    int getEdad();
    int getAltura();
    string getNacionalidad();
    string getCiudad();
    
    bool letraA();
    bool habitaMDP();
    bool mayor18();
   
    
	private:
    string nombre;
    char genero;
    int edad;
    int altura;
    string nacionalidad;
    string ciudad;

};
 
 
CParte::CParte(string n, char g, int e, int h, string na, string c) {
    nombre = n;
    genero = g;
    edad = e;
 	altura = h;
 	nacionalidad = na;
 	ciudad = c;
}

CParte::CParte(){
	
}
 
 
CParte::~CParte() {
 
    cout <<"\nBorrando datos ... \n";
}
 
string CParte::getNombre(){
 
    return nombre;
}
 
  
char CParte::getGenero(){
 
    return genero;
}
 
int CParte::getEdad(){
 
    return edad;
}

int CParte::getAltura(){
	
	return altura;
}
	
string CParte::getNacionalidad(){
	
	return nacionalidad;
}

string CParte::getCiudad(){
	
	return ciudad;
}

bool CParte::habitaMDP() { 
//Comprueba si la ciudad es mar del plata 
 return (ciudad == "mar del plata" || ciudad==  "Mar del Plata") ? true : false; 
} 

bool CParte::letraA(){
//comprueba si la utlima letra del nombre es igual a la letra 'a' ||fun fact(.back() solo funciona en c++ 11, usar -std=c++11 en opciones del compilador)
	return (nombre.back() == 'a') ? true:false;
}

bool CParte::mayor18(){
//comprueba si la edad es mayor a 18 	
	return (edad >= 18) ? true:false;
}

	
#endif	/* CParte_H */

