#ifndef articuloDeportivo_H
#define	articuloDeportivo_H
#include <string>
#include <iostream>
 
using namespace std;
 
class CArticulo{
	public:
    CArticulo(int c, string d, int s, int pU);
  	CArticulo();
   ~CArticulo();
    int getCode();
    string getDescripcion();
    int getStock();
    int getPrecioU();
    
    void checkCode();
  
	private:
    int code;
    string descripcion;
    int stock;
    int precioU;
};
 
 
CArticulo::CArticulo(int c, string d, int s, int pU) {
    code = c;
    descripcion = d;
    stock = s;
 	precioU= pU;

}
 
 
CArticulo::~CArticulo() {
 
    cout <<"\nBorrando datos ... \n";
 
}
 
int CArticulo::getCode(){
 
    return code;
 
}
 
 
CArticulo::CArticulo(){
 
}

  
string CArticulo::getDescripcion(){
 
    return descripcion;
 
}
 
int CArticulo::getStock(){
 
    return stock;
 
}

int CArticulo::getPrecioU(){
	
	return precioU;
}

#endif	/* CArticulo_H */
