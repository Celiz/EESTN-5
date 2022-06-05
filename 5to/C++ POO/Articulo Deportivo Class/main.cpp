#include<iostream>
#include "articuloDeportivo.h"

using namespace std;


void desplegarDatos(CArticulo *arreglo){

	
	cout<<"------INVENTARIO------- \n";	
		for(int i=0; i<5; i++){
			cout<<arreglo[i].getDescripcion();
			cout<<"\n\n";
			
		}

}
	
int main(){
	cout<<"Crear 5 personas"<<endl;
	
	CArticulo *articulo = new CArticulo[5];
	
	articulo[0]= CArticulo(1902, "Pelota de Futbol", 12 , 5600);
	articulo[1]= CArticulo(1912, "Pelota de Basquet", 7 , 15600);
	articulo[2]= CArticulo(1922, "Pelota de Tenis x3", 4 , 3500);
	articulo[3]= CArticulo(1932, "Pelota de Rugby", 1 , 8400);
	articulo[4]= CArticulo(1942, "Pelota de Hockey", 4 , 3000);
	
	desplegarDatos(articulo);

	delete[]articulo;
	
	return 0;
}
