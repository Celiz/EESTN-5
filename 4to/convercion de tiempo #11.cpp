#include <iostream>
#include <string>
using namespace std;
int main(){
	int a, b;
	cout<<"Ingrese la hora a convertir: ";
	cin>>a>>b;
	if(a > 12){
		a = a-12;
		cout<<a<<":"<<b<<" PM"<<endl;	
	}else if(a == 12){
		cout<<a<<":"<<b<<" PM"<<endl;	
	}else{
		cout<<a<<":"<<b<<" AM"<<endl;	
	}
	return 0;
}
