#include<iostream>
using namespace std;
int br();
int main(){
	br();
	return 0;
}
int br(){
	int DDD;
	cout<<"Ingrese DDD: ";
	cin>>DDD;
	
	
	if(DDD==71){
		cout<<"Salvador";
	}
	else if(DDD==11){
		cout<<"Sao Paulo";
	}
	else if(DDD==21){
		cout<<"Rio de janeiro";
	}
	else if(DDD==32){
		cout<<"Juiz de Fora";
	}
	else if(DDD==19){
		cout<<"Campinas";
	}
	else if(DDD==27){
		cout<<"Vitoria";
	}
	else if(DDD==31){
		cout<<"Belo Horizonte";
	}
    
	else{
		
		cout<<"DDD NO ENCONTRADO";
		
	}
	return 0;
}
