#include <iostream>
using namespace std;
int variable();
int main(){
    cout<<"ingrese cantidad de numero que habra: "<<endl;
	variable();
  
    return 0;
}
int variable(){
	int x, a;
    int in = 0;
    int out = 0;
    
    cin >> x;
    for(int i = 0; i < x; i++){
            cout<<"ingrese los numeros: "<<endl;
			cin >> a;
            if(a >= 10 && a <= 20) in++;
            else out++;
    }
    cout << in << " in\n";
    cout << out << " out\n";
}
