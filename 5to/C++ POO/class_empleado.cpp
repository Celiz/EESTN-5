#include<iostream>
#include<string>
using namespace std;

 class CEmpleado{
 	private:
 		//Definimos las variables privadas
 			string nombre;
 			string apellido;
 			string domicilio;
 			int cantHijos;
 			float sueldoB;
 			int antiguedad;
 		
 	public:
	 		CEmpleado(float sB, int anti, int h, string n, string a, string d);
	 		//seteamos un valor a todas las variables
	 		float SetSueldo(float sB);
	 		int SetAntiguedad(int anti);
	 		int SetHijos(int h);
	 		string SetNombre(string n);
	 		string SetApellido(string a);
	 		string SetDomicilio(string d);
	 		
	 		//Definimos el procedimiento que calcula las deducciones que se aplican al sueldo bruto
			float CalcularDeduccion(float sB);
 };
 
 CEmpleado::CEmpleado(float sB, int anti, int h, string n, string a, string d){
 	//Utilizamos las variables publicas
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
	string n, a, d="Vertiz 3765";


	float sB;
	int h = 3;
	int anti = 25;
	
	float deducciones; 
	
	CEmpleado Empleado(sB, anti, h,n, a, d); //declaracion de la clase que se va a usar en el programa main
	cout<<"Ingrese nombre: ";
	cin>>n;
	cout<<"Ingrese apellido: ";
	cin>>a;
	cout<<"Ingrese direccion:";
	cin.ignore( 1000, '\n' );
	getline(cin, d);
	cout<<"Ingrse sueldo bruto: ";
	cin>>sB;
	cout<<"-----------------------------------------------------------------------"<<endl;
	
	cout<<"Nombre: "<<n<<" "<<a<<"\n"<<"Direccion: "<<d<<endl;
	cout<<"Sueldo bruto: "<<sB<<endl; //Devuelve sueldo bruto
	deducciones = Empleado.CalcularDeduccion(sB); //definimos que deducciones es igual a Empleado.CalcularDeduccion
	cout<<"Deducciones: "<<deducciones<<endl;
	cout<<"Sueldo neto: "<<sB-deducciones;
	
return 0;
}
