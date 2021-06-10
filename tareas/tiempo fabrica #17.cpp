#include <iostream>

using namespace std;

int main()

{
	int h, m, s, tiempo;
	cout<<"Introduce el tiempo: "<<endl;
	cin>>tiempo;
	h=tiempo/3600;
	tiempo=tiempo%3600;
	m=tiempo/60;
	s=tiempo%60;
	
	cout<<h<<":"<<m<<":"<<s<<endl;
	
	
return 0;
}
