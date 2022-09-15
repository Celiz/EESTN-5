#include<iostream>
#include<string>
using namespace std;
class CEmpleados{
	private:
		int salario;
		int horas;
		string nombre;
		
	public:
		float CalcularSalario(int s, int h);
		float CalcularAumento(int s, int h);
	
};

}
float CEmpleados::CalcularAumento(int s, int h){
	if(h>=8 && h<10){
		s=s+20000;
	}	
	else if(h>=10 && h<12){
		s=s+25000;
	}
	else if(h>=12){
		s=s+30000;
	}
	
	return s;
}


int main(){
	string nombre;
	int s, h, nuevosal;
	CEmpleados Empleados;
	nombre = "Celiz Matias";
	
	s=10000;
	h=8;
	
	nuevosal= Empleados.CalcularAumento(s, h);
	
	cout<<"El nuevo salario de "<<nombre<<" es de: "<<nuevosal;
	
return 0;
}


