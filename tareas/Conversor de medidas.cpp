#include <iostream>
using namespace std;
int main(void){
	
	int opcion;
	double pulgadas, centimetros, metros, yardas, Pies;
	
	cout<< "Ingrese una opcion: "<< endl;
	cout<< " 1. Pies a pulgadas "<< endl;
	cout<< " 2. Pies a centimetros "<< endl;
	cout<< " 3. Pies a metros "<< endl;
	cout<< " 4. Pies a yardas "<< endl;
	cin>> opcion;
	
	switch (opcion){
	
		case 1:
			cout<<"---Pies a pulgadas---"<< endl;
			cout<<"Ingrese la cantidad de pies a convertir"<<endl;
			cin>>Pies;
			pulgadas=Pies*12;
			cout<<pulgadas<< " pulgadas " <<endl;
			break;
		
		case 2:
		   cout<<"---Pies a centimetros---"<< endl;
		    cout<<"Ingrese la cantidad de pies a convertir"<<endl;
			cin>> Pies;
			centimetros=Pies*30,48;
			cout<<centimetros<< "centimetros" <<endl;
		   break;
		
		
		case 3:
		   cout<< "---Pies a metros---"<< endl;
		    cout<<"Ingrese la cantidad de pies a convertir"<<endl;
			cin>> Pies;
			metros=Pies*0.3048;
			cout<<metros<< "metros" <<endl;
		   break;
		
		
		case 4: 
		    cout<<"---Pies a yardas---"<< endl;
			cout<<"Ingrese la cantidad de pies a convertir"<<endl;
			cin>>Pies;
			yardas=Pies*0.33;
			cout<<yardas<< "yardas" <<endl;
		   break;
		
		
		default:
		   cout<< "La opcion ingresada no es correcta."<< endl;
		            
	}

}
