#ifndef parteMedico_H
#define	parteMedico_H
#include <string>
#include <iostream>
 
using namespace std;
 
class CParte{
public:
    CParte(string nom, string dir, string tel, bool obraso, bool aler, string ultiv);
  CParte();
   ~CParte();
    string getNombre();
    string getDireccion();
    string getTelefono();
    bool getObraS();
    bool getAlergias();
    string getUltimaV();
    
   
   
    
private:
    string nombre;
    string direccion;
    string telefono;
    bool obraSocial;
    bool alergias;
    string ultimaVisita;

};
 
 
CParte::CParte(string n, string d, string t, bool os, bool a, string uv) {
 
    nombre = n;
    direccion = d;
    telefono = t;
 	obraSocial= os;
 	alergias = a;
 	ultimaVisita = uv;
}
 
 
CParte::~CParte() {
 
    cout <<"\nBorrando datos ... \n";
 
}
 
string CParte::getNombre(){
 
    return nombre;
 
}
 
 
CParte::CParte(){
 
}

  
string CParte::getDireccion(){
 
    return direccion;
 
}
 
string CParte::getTelefono(){
 
    return telefono;
 
}

bool CParte::getObraS(){
	
	return obraSocial;
}
	
bool CParte::getAlergias(){
	
	return alergias;
}

string CParte::getUltimaV(){
	
	return ultimaVisita;
}



	
#endif	/* CParte_H */


