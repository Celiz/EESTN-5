#include <iostream>
#include <locale.h>
using namespace std;
int cumple();
int main(){
	setlocale(LC_ALL, "spanish");
	cumple();
	return 0;
	
}

cumple(){
	int dias, meses, anios;
	cout<<"Ingrese la cantidad de dias: ";
	cin>>dias;
	anios=dias/365;
	meses=(dias-(anios*365))/30;
	dias=dias-anios*365-(meses*30);
	(anios > 1) ? cout<< anios << " años\n" : cout<<anios<<" año\n";
	(meses > 1) ? cout<<meses<< " meses\n" : cout<<meses<<" mes\n";
	(dias > 1) ? cout<<dias<< " dias\n" : cout<<anios<<" dia\n";
	
	return 0;
}
