#include<iostream>
#include<vector>
using namespace std;

class CNumeros{
	
	public:
		vector<int> BuscarNumeroPerfecto(int n);
			
};

vector<int> CNumeros::BuscarNumeroPerfecto(int n){
	int temp=0; //variable para divisores
	vector<int>res;
	//itera sobre el rango(n) 
	for(int i=1; i<=n; i++){
		//itera sobre cada numero desde j hasta n
		for(int j=1; j<i; j++){
			//verifica si son divisores
			if(i%j==0){
				temp+=j;
			}
		}
		//si es perfecto lo suma al vector
		if(temp==i){
			res.push_back(i);
		}
		temp=0;
	}
	return res;
}

int main(){
	int n;
	
	CNumeros Numeros;
	cout<<"Ingrese un numero: ";
	cin>>n;
	vector<int>res=Numeros.BuscarNumeroPerfecto(n);
	
	//mostrar elementos/resultados del array
	for(int i=0; i<res.size(); i++){
		cout<<res[i]<<endl;
	}

	
	
}
