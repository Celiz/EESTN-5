#include<iostream>
using namespace std;
 int ContarDigitos(int n);
 int main(){
 	int num;
 	cout<<"Ingrese numero: ";
 	cin>>num;
 	ContarDigitos(num);
 	return 0;
 	
 }
  int ContarDigitos(int n){
  	int s=0;
  	
  	while(n>0){
  		s=s+n%10;
  		n=n/10;
	  }
	  
	  cout<<""<<s<<endl;
  	
  }
