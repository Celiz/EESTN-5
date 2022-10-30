#ifndef class_H
#define class_H
#include<string>
#include<iostream>

using namespace std;

class CZooAnimal{
	
		private:
			int IdAnimal;
			string nombre;
			int numJaula;
			int idTipoAnimal; //1 felinos 2 aves 3 reptiles etc.
			int peso;
			
		public:
			
		CZooAnimal();	
		CZooAnimal(int id, string n, int cage,int typeAnimal,int w){
			IdAnimal = id;
			nombre = n;
			numJaula = cage;
			idTipoAnimal = typeAnimal;
			peso = w;
		}
		
		
		int getIdAnimal(){
			return IdAnimal;
		}
		
		string getNombre(){
			return nombre;
		}
		
		int getNumJaula(){
			return numJaula;
		}
		
		int getTipoAnimal(){
			return idTipoAnimal;
		}
		
		int getPeso(){
			return peso;
		}
		
		bool isFeline(){
			bool comprobacion = false;
			
			if(idTipoAnimal == 1){
				comprobacion = true;
			}
			else {
				comprobacion = false;
			}
			
			return comprobacion;
		}
		
		
			
};

CZooAnimal::CZooAnimal(){
	
}

#endif


