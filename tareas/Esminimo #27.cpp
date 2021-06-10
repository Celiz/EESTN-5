#include<iostream>
using namespace std;
int esMinimo(int a, int b, int c),n1,n2,n3;
int main(){
	cout<<"Ingrese el primer numero: ";
	cin>>n1;
	cout<<"Ingrese el segundo numero: ";
	cin>>n2;
	cout<<"Ingrese el tercer numero: ";
	cin>>n3;
	esMinimo(n1,n2,n3);
	return 0;
}

int esMinimo(int a,int b, int c){
	if(n1<n2&&n1<n3){
		cout<<"El numero mayor es: "<<n1;
	}
	
	else if(n2<n1&&n2<n3){
		cout<<"El numero mayor es: "<<n2;
	}
	else if(n3<n1&&n3<n2){
		cout<<"El numero mayor es: "<<n3;
	}
	
return 0;	
}
