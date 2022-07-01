#ifndef estadisticas_H
#define	estadisticas_H
#include<bits/stdc++.h>
using namespace std;
 
class CParte{
public:
    CParte(string nom, string gen, int ed, int al, string nac, string ciu);
  CParte();
   ~CParte();
    string getNombre();
    string getGenero();
    int getEdad();
    int getAltura();
    string getNacionalidad();
    string getCiudad();
    
    string letraA();
   
    
private:
    string nombre;
    string genero;
    int edad;
    int altura;
    string nacionalidad;
    string ciudad;

};
 
 
CParte::CParte(string n, string g, int e, int h, string na, string c) {
 
    nombre = n;
    genero = g;
    edad = e;
 	altura = h;
 	nacionalidad = na;
 	ciudad = c;
}
 
 
CParte::~CParte() {
 
    cout <<"\nBorrando datos ... \n";
 
}
 
string CParte::getNombre(){
 
    return nombre;
 
}
 
 
CParte::CParte(){
 
}

  
string CParte::getGenero(){
 
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



		



	
#endif	/* CParte_H */

