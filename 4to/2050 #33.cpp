#include<iostream>
using namespace std;
#include <locale.h>
int CalcularAnios();
int main() {
	setlocale(LC_ALL, "spanish");
    CalcularAnios ();


return 0;
}
CalcularAnios(){
	int edad, anio, anioB;
	cout<<"Digite su edad: ";
	cin>>edad;
	
	cout<<"Digite año actual: ";
	cin>>anio;
	
	anioB=2050-(anio-edad);
	
	cout<<"usted en el 2050 tendra: "<<anioB;
  
}
   


