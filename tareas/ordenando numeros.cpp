#include <iostream>
#include <string>
using namespace std;
	

int main(){
	int a, b, c;
	string e = " ";
	cout<<"ingrese los numeros a verificar:";
	cin>>a>>b>>c;
	if(a <= b && b <= c ){
    	cout<<a<<e<<b<<e<<c<<endl;
	}else if( b <= a && a <= c){
		cout<<b<<e<<a<<e<<c<<endl;
	}else if( b <= c && c <= a){
		cout<<b<<e<<c<<e<<a<<endl;
	}else if( c <= b && b <= a){
		cout<<c<<e<<b<<e<<a<<endl;
	}else if( c <= a && a <= c){
		cout<<c<<e<<a<<e<<b<<endl;
	}else if( a <= c && c <= b){
		cout<<a<<e<<c<<e<<b<<endl;
	}
	return 0;
}
