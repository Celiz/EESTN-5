#include<iostream>
using namespace std;
int x2();
int main(){
	x2();
	return 0;
}

int x2(){
	int num;
	cout<<"Ingrese numero: ";
	cin>>num;
	
	if(num>=1){
	cout<<"Resultado: "<<num*2;
	}	
return 0;		
}
