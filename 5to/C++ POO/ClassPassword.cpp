#include<iostream>
#include<string>
#include <locale.h>
using namespace std;

class CPassword{
	private:
		string usuario;
		string password;
		
	public:
		CPassword(string user, string pass);
		string SetUser(string user);
		string SetPass(string pass);
		
		bool CalcularSeguridadPass(string pass);
};

CPassword::CPassword(string user, string pass){
	usuario = SetUser(user);
	password = SetPass(pass);
}

string CPassword::SetUser(string user){
	return usuario = user;
}

string CPassword::SetPass(string pass){
	return password = pass;
}

bool CPassword::CalcularSeguridadPass(string pass){
	bool largo = false;
	bool mayus = false;
	bool num= false;
	bool comprobacion = false;
	
	if(pass.length() > 8 ){
		largo = true;
	}
	
	for(int i=0; i<pass.length(); i++){
		if(isupper(pass[i])){
			mayus = true;
		}
		
		if(isdigit(pass[i])){
			num = true;
		}
			
	}
	
	if(largo && mayus && num){
		comprobacion = true;
	}
	else{
		comprobacion = false;
	}
	
	return comprobacion;
	
}

int main(){
	setlocale(LC_ALL, "spanish");
	
	string user, pass;
	
	CPassword Password(user, pass);
	cout<<"Ingrese usuario: ";
	cin>>user;
	cout<<"Ingrese password: ";
	cin>>pass;
	
	
	bool comprobacion = Password.CalcularSeguridadPass(pass);
	
	if(comprobacion){
		cout<<"Contraseña segura";
	}
	else{
		cout<<"Contraseña insegura";
	}

return 0;
}


