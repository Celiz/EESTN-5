#include<iostream>
#include "parteMedico.h"

using namespace std;

void desplegarDatos(CParte *arreglo){

	
	cout<<"Listado de personas con Obra Social: ";	
		for(int i=0; i<5; i++){
			if(arreglo[i].getObraS()){
			cout<<"\nNombre: "<<arreglo[i].getNombre();
			cout<<"\nNombre: "<<arreglo[i].getTelefono();
			cout<<"\n\n";
			}
		
		}

			
	cout<<"Listado de personas con Alergias: ";
		for(int i=0; i<5; i++){
			if(arreglo[i].getAlergias()){
			cout<<"\nNombre: "<<arreglo[i].getNombre();
			cout<<"\n\n";
			}
			
		}
	
}

	

int main(){
	cout<<"Crear 5 personas"<<endl;
	
	CParte *parte = new CParte[5];
	
	parte[0]= CParte("Pablo", "Vertiz 567", "2236786547" , true, false, "23/04/22");
	parte[1]= CParte("Pepe", "Vertiz 123", "2236047869" , false, true, "10/04/22");
	parte[2]= CParte("Luca", "Vertiz 312", "2239087658" , true, false, "12/04/22");
	parte[3]= CParte("Alan", "Vertiz 421", "2235044267" , true, false, "01/04/22");
	parte[4]= CParte("Tomi", "Vertiz 908", "2239087678" , false,  true, "05/04/22");
	
	desplegarDatos(parte);

	delete[]parte;
	
	return 0;
}





