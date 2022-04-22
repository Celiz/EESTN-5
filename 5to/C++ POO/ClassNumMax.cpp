#include<iostream>
using namespace std;
class CNumeros{
	private:
		int n1;
		int n2;
		int n3;
		
	public:
		int CalcularNumeroMaximo(int n1, int n2, int n3);
	
};


int CNumeros::CalcularNumeroMaximo(int n1, int n2, int n3){
	int max;
	
	if(n1>n2 && n1>n3){
		max=n1;
	}	
	else if(n2>n1 && n2>n3){
		max=n2;
	}
	else if(n3>n1 && n3>n2){
		max=n3;
	}
	
	return max;
}


int main(){
	int n1, n2, n3, max;
	CNumeros Numeros;
	
	n1=3;
	n2=4;
	n3=5;	

	max = Numeros.CalcularNumeroMaximo(n1, n2, n3);
	
	cout<<"El numero maximo: "<<max;
	
return 0;
}


