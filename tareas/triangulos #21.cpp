#include <iostream>
#include <string>
using namespace std;
int tri();
int ang();
int main (void){
	tri();
	return 0;

}

int tri(){
	

	double A,B,C;
	cout<<"Ingrese el primer lado del triangulo: "<<endl;
	cin>>A;
	cout<<"Ingrese el segundo lado del triangulo: "<<endl;
	cin>>B;
	cout<<"Ingrese el tercer lado del triangulo: "<<endl;
	cin>>C;
	
	if ( ((A+B)>C) && ((A+C)>B) && ((B+C)>A) ){
	
		if (A==B&&A==C){
			cout<<"Es un triangulo equilatero.\n"; 
			
		}
		else if (A==B||B==C||A==C){
			cout<<"Es in triangulo isosceles.\n"; 
			
		}
		
}
	else{
		cout<<"No corresponde a un triangulo.\n";
	}
	 if((A*A) == ((B*B)+(C*C))) cout<<"Triangulo rectangulo\n";
        if((A*A) >  ((B*B)+(C*C))) cout<<"Triangulo obtusangulo\n";
        if((A*A) <  ((B*B)+(C*C))) cout<<"Triangulo acutangulo\n";
	
	
	return 0;
}



