#include<iostream>
#include<string>
using namespace std;

 class CEmpleado{
 	private:
 			string nombre;
 			string apellido;
 			string domicilio;
 			int cantHijos;
 			float sueldoB;
 			int antiguedad;
 		
 	public:
	 		CEmpleado(float sB, int anti, int h, string n, string a, string d);
	 		float SetSueldo(float sB);
	 		int SetAntiguedad(int anti);
	 		int SetHijos(int h);
	 		string SetNombre(string n);
	 		string SetApellido(string a);
	 		string SetDomicilio(string d);
	 		
	 		
			float CalcularDeduccion(float sB);
 };
 
 CEmpleado::CEmpleado(float sB, int anti, int h, string n, string a, string d){
 	sueldoB = SetSueldo(sB);
 	antiguedad = SetAntiguedad(anti);
 	cantHijos = SetHijos(h);
 	nombre = SetNombre(n);
 	apellido = SetApellido(a);
 	domicilio = SetDomicilio(d);
 	
 }
 
float CEmpleado::SetSueldo(float sB){
 	return sueldoB = sB;
 }
 
int CEmpleado::SetAntiguedad(int anti){
 	return antiguedad = anti;
 } 
 
int CEmpleado::SetHijos(int h){
 	return cantHijos=h;
 } 
 
string CEmpleado::SetNombre(string n){
 	return nombre = n;
 }
 
string CEmpleado::SetApellido(string a){
 	return apellido = a;
 }
 
 
string CEmpleado::SetDomicilio(string d){
 	return domicilio = d;
 }
 
float CEmpleado::CalcularDeduccion(float sB){
	return (sB*0.11)+(sB*0.03)+(sB*0.03); //devuelve deducciones
} 


 

int main(){
	string n = "Matias";
	string a = "Celiz";
	string d= "Vertiz 3765";
	float sB = 20000;
	int h = 3;
	int anti = 25;
	
	float deducciones;
	
	CEmpleado Empleado(sB, anti, h,n, a, d); //declaracion de la clase que se va a usar en el programa main
	
	cout<<"Sueldo bruto: "<<sB;
	deducciones = Empleado.CalcularDeduccion(sB);
	cout<<"Deducciones: "<<deducciones;
	


	
return 0;
}


