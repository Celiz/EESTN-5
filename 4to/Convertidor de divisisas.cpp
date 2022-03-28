#include <iostream>
using namespace std;
int main(){


    float ars;
	
	cout<<"Ingrese la cantidad de pesos argentinos (ARS)"<<endl;
	cin>>ars;
   cout << "\n USD:" << ars/140 << "\n EUR:" << ars/165.28 << "\n BRL:" << ars/16.65 <<  "\n UYU:" << ars/2.06;
    return 0;
}

