#include<iostream>
#include<conio.h>
#include<string.h>
#include "articuloDeportivo.h"

using namespace std;
CArticulo *articulo;

void menu(){
	int code, stock, precioU, cantA;
    string descripcion;

	int opcion;
    bool repetir = true; 
	
		do{
        cout<<"\n\n\t\t\tMenu de Opciones"<< endl;
        cout<<"\t\t\t----------------"<<endl;
        cout<<"\n\t1. Agregar articulo";
        cout<<"\n\t2. Mostrar inventario";
        cout<<"\n\t3. Buscar articulo por codigo"<<endl;
        cout<<"\t0. SALIR"<<endl;

        cout<<"\n\tIngrese una opcion: ";
        cin >> opcion;

        switch (opcion)
        {
   	 	case 0:
            repetir = false;
            break;
            
		case 1:
			cout << "Cantidad de articulos: "; cin>>cantA;
			articulo = new CArticulo[cantA];
			for(int i = 0; i < cantA; i++){
				cout << "Codigo de producto: "; cin>>code;
				cout<<"Descripcion: "; cin.ignore(10000, '\n'); getline(cin, descripcion);
				cout << "stock: "; cin>>stock;
				cout << "Precio: "; cin>>precioU;
				articulo[i] = CArticulo(code, descripcion, stock, precioU);
			}
		system("pause");
		system("cls");
		break;
			
		case 2:
			cout<<"\n\tArticulos: "<<endl;
				for(int i = 0; i < cantA; i++){
					cout<<"\nCodigo: "<<articulo[i].getDescripcion();
					cout<<"\nDescripcion: "<<articulo[i].getDescripcion();
					cout<<"\nStock: "<<articulo[i].getStock();
					cout<<"\nPrecio Unitario: $"<<articulo[i].getPrecioU()<<endl;	
					
		}
		system("pause");
		system("cls");
		break;
		
		case 3:
			int codigo;
			cout<<"\n\tIngrese codigo de producto: "; cin>>codigo;
			for(int i=0; i<cantA; i++){
			if(codigo == articulo[i].getCode()){
				cout << "Codigo de producto: "; cout<<articulo[i].getCode()<<endl;
				cout<<"Descripcion: "; cout<<articulo[i].getDescripcion()<<endl;
				cout << "stock: "; cout<<articulo[i].getStock()<<endl;
				cout << "Precio: "; cout<<articulo[i].getPrecioU();
				articulo[i] = CArticulo(code, descripcion, stock, precioU);
				}
			}
			system("pause");
			system("cls");
				
		}
	}while (repetir);
}	   


int main(){
	
	menu();
	return 0;
}
