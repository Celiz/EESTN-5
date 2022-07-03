#ifndef estudiantes_h
#define estudiantes_h
#include <string>
#include <iostream>

using namespace std;

class cEstudiantes {
	public: 
		cEstudiantes(string n, string a, int d, int m, int an, float no);
		cEstudiantes();
		~cEstudiantes();
		string getNombre();
		string getApellido();
		int getDia();
		int getMes();
		int getAnio();
		float getNotas();
		bool Aprobado();
		bool aprobo2021();

	
	private: 
		string nombre;
		string apellido;
		int dia;
		int mes;
		int anio;
		float nota;
};	

cEstudiantes::cEstudiantes(string n, string a, int d, int m, int an, float no){
	nombre = n;
	apellido = a;
	dia = d;
	mes = m;
	anio = an;
	nota = no;
}

cEstudiantes::~cEstudiantes(){
	cout<<"Borrando datos"<<endl;
}

cEstudiantes::cEstudiantes(){
	
}

string cEstudiantes::getNombre(){
	return nombre;
}

string cEstudiantes::getApellido(){
	return apellido;
}
int cEstudiantes::getDia(){
	return dia;
}
int cEstudiantes::getMes(){
	return mes;
}
int cEstudiantes::getAnio(){
	return anio;
}
float cEstudiantes::getNotas(){
	return nota;
}
bool cEstudiantes::aprobo2021(){
	return(anio==2021) ? true : false;
}
bool cEstudiantes::Aprobado(){
	return(nota>=7) ? true : false;
}
#endif
