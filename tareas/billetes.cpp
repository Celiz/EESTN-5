#include <iostream>
using namespace std;
int billetes ();
int main (){
    billetes();
    return 0;
}
billetes()
{
    int cantidad, cien, cincuenta, veinte, diez, cinco, dos, uno;
    cout << "Cantidad: ";
    cin >> cantidad;
	cien = cantidad/100;
    cantidad = cantidad - 100*cien;
    cincuenta = cantidad/50;
    cantidad = cantidad - 50*cincuenta;
    veinte= cantidad/20;
    cantidad = cantidad - 20*veinte;
    diez   = cantidad/10;
    cantidad = cantidad - 10*diez;
    cinco  = cantidad/5;
    cantidad = cantidad - 5*cinco;
    dos   = cantidad/2;
    cantidad = cantidad - 2*dos;
    uno   = cantidad/1;
    cantidad = cantidad - 1*uno;
    cantidad = cantidad-uno;
    cout << " $100 billetes: "   << cien;
    cout << "\n $50 billetes: "  << cincuenta;
    cout << "\n $20 billetes: "  << veinte;
    cout << "\n $10 billetes: "  << diez;
    cout << "\n $5 billetes: "   << cinco;
    cout << "\n $2 billetes: "   << dos;
    cout << "\n $1 billetes: "   << uno;
    return 0;
}
