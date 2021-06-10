#include<cstdlib>
#include<stdio.h>
#include<iostream>

using namespace std;
int main(){
	int fecha;
	cout<<"Ingrese el año a comprobar:  ";
	cin>>fecha;
	
	if(fecha%4!=0 || (fecha%100==0&&fecha%400!=0))
	cout<<("No es bisiesto");
	 
	else
    cout<<("Es bisiesto");
        
	
	return 0;	
}
