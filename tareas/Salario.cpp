#include <iostream>
#include <string>
using namespace std;
int salario() ;
int main(){
	salario();
	
	
	
	return 0;
}
int salario(){
	double salario, nuevosal, dinerowin;
	cout<<"ingrese salario del empleado: ";
	cin>>salario;

	if(salario<=400.00){
	nuevosal=salario*(1+0.15);
	cout<<"En porcentaje: 15%"<<endl;
	}
	else if (salario>400.00 && salario<=800.00){
	nuevosal=salario*(1+0.12);
		cout<<"En porcentaje: 12%"<<endl;
	}
	else if  (salario>800.00 && salario<=1200.0){
	nuevosal=salario*(1+0.10);
	cout<<"En porcentaje: 10%"<<endl;
	}
	else if  (salario>1200.00 && salario<=2000.00) {
	nuevosal=salario*(1+0.07);
		cout<<"En porcentaje: 7%"<<endl;
	}
	else{
		nuevosal=salario*(1+0.04);
		cout<<"En porcentaje: 4%"<<endl;
	}

	if(salario)
	cout<<"Nuevo salario: "<<nuevosal<<endl;
	
	dinerowin=nuevosal-salario;
	cout<<"Dinero ganado: "<<dinerowin<<endl;
	
	return 0;
	

}

