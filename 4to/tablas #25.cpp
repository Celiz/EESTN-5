#include<iostream>
using namespace std;
int tabla();
int main(){
	tabla();
	return 0;

}
int tabla(){
	int numero;
	do{
		cout<<"Escriba un numero: "; cin>>numero;
	}while((numero<1));
	
	for (int i=1;i<=10;i++){
		cout<<numero<<" * "<<i<<" = "<<numero*i<<endl; 
	}
	return 0;
	

}

