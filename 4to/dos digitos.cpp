#include<iostream>
#include <string>
using namespace std;
int main(){
	float a, b;
	cout<<"Ingrese los numeros: ";
	cin>>a>>b;
	if(a > b){
		cout<<"La suma es:\n>";
		cout<<a+b<<endl;
		cout<<"La diferencia es: \n>";
		cout<<a-b<<endl;
	}else{
		cout<<"El producto es: \n>";
		cout<<a*b<<endl;
		cout<<"La divison es: \n>";
		cout<<a/b<<endl;
	}
	return 0;
}
