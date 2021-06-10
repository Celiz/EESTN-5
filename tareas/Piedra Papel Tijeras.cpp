#include <iostream>
#include <string>
using namespace std;

string juego(string A, string B);

int main()

{
	string Ana, Bartolo;
	cout<<"ingrese valor Ana"<<endl;
	cin>>Ana;
	cout<<"ingrese valor de Bartolo"<<endl;
	cin>>Bartolo;
	cout<<"Gana "<<juego(Ana,Bartolo)<<endl;
	
	return 0;
}

string juego(string A, string B)
{string gana;

if(A=="piedra"&& B=="tijera")
{gana="Ana";}

if(A=="papel"&& B=="piedra")
{gana="Ana";}

if(A=="tijera"&& B=="papel")
{gana="Ana";}

if(A==B)
gana="empate";

if(B=="piedra"&& A=="tijera")
{gana="Bartolo";}

if(B=="papel"&& A=="piedra")
{gana="Bartolo";}

if(B=="tijera"&& A=="papel")
{gana="Bartolo";}

return gana;


}
