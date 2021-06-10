#include <iostream>
#include <string>
using namespace std;
int main(){
	string nombre, t1, t2;
	int nota1, nota2, nota3;
	cout<<"Ingrese su nombre: \n";
	getline(cin, nombre);
	cout<<" Ingrese sus calificaciones:"<<endl;
	cin>>nota1>>nota2>>nota3;
	int notaFinal = (nota1+nota2+nota3)/3;
	if(notaFinal >= 7){
		cout<<"El alumno "<<nombre<< " esta promocionado" <<endl;	
	}else{
		cout<<"El alumno "<<nombre<< " reprobo" <<endl;	
	}	
	return 0;
}
