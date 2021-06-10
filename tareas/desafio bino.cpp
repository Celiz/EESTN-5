#include <iostream>
using namespace std;
int main()

{
    int num, x, cnt2=0, cnt3=0, cnt4=0, cnt5=0;
    cout<<"ingrese cantidad de numero:s que habra en la lista: "<<endl;
	cin>>num;
	cout<<"ingrese numeros de la lista: "<<endl;
	while(num>0){
		cin>>x;+
		num--;
		if(x%2==0){
			cnt2++;
		}
			if(x%3==0){
			cnt3++;
		}
			if(x%4==0){
			cnt4++;
		}
			if(x%5==0){
			cnt5++;
		}
	} 
	cout<<cnt2<<"Multiplo(s) de 2"<<endl;
	cout<<cnt3<<"Multiplo(s) de 3"<<endl;
	cout<<cnt4<<"Multiplo(s) de 4"<<endl;
	cout<<cnt5<<"Multiplo(s) de 5"<<endl;
	
return 0;
}
   
   
   
