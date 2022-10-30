#include<iostream>
#include<string>
#include "class.h"

using namespace std;

CZooAnimal *ZooAnimal;

void menu(){
	int IdAnimal, numJaula, idTipoAnimal, peso, opcion;
	string nombre;

    bool repetir = true; 
	
		do{
        cout<<"\n\n\t\t\tMenu de Opciones"<< endl;
        cout<<"\t\t\t----------------"<<endl;
        cout<<"\n\t1. Agregar Animal";
        cout<<"\n\t2. Mostrar animales en jaula 5, menores a 3kg";
        cout<<"\n\t3. Mostrar animales felinos entre jaula 2 y 5";
		cout<<"\n\t4. Mostrar animales en jaula 4, menores a 120kg"<<endl;
        cout<<"\t0. SALIR"<<endl;

        cout<<"\n\tIngrese una opcion: ";
        cin >> opcion;

        switch (opcion){
   	 	case 0:
            repetir = false;
            break;
            
		case 1:
			int cantA;
			cout << "Cantidad de Animales: "; cin>>cantA;
			ZooAnimal = new CZooAnimal[cantA];
			for(int i = 0; i < cantA; i++){
				cout << "Id animal: "; cin>>IdAnimal;
				cout << "Nombre: "; cin>>nombre;
				cout<<"Numero de jaula: "; cin>>numJaula;
				cout << "Id tipo de animal(1 Felinos, 2 Aves, 3 Reptiles, 4 Mamifero): "; cin>>idTipoAnimal;
				cout << "Peso: "; cin>>peso;
				ZooAnimal[i] = CZooAnimal(IdAnimal, nombre,numJaula, idTipoAnimal, peso);
			}
		system("pause");
		system("cls");
		break;

		case 2:
			for(int i = 0; i < cantA; i++){
				if(ZooAnimal[i].getNumJaula() == 5 && ZooAnimal[i].getPeso() <= 3){
					cout <<ZooAnimal[i].getNombre() << endl;
				}
			}
		system("pause");
		system("cls");
		break;
		
		case 3:
			for(int i = 0; i < cantA; i++){
				if(ZooAnimal[i].isFeline() && ZooAnimal[i].getNumJaula() >= 2 && ZooAnimal[i].getNumJaula() <= 5){
					cout << ZooAnimal[i].getNombre() << endl;
				}
			}
		system("pause");
		system("cls");
		break;

		case 4:
			for(int i = 0; i < cantA; i++){
				if(ZooAnimal[i].getNumJaula() == 4 && ZooAnimal[i].getPeso() <= 120){
					cout << ZooAnimal[i].getNombre() << endl;
				}
			}
		system("pause");
		system("cls");
		break;
		

	}
		
}	while (repetir);

}

int main(){
	menu();
	return 0;
}
