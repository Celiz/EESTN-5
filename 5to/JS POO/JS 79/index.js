class CRectangulo{

    constructor(base, altura){
        this.base = base;
        this.altura = altura;
    }

    area(){
        return this.base * this.altura;
    }

}

const rectangulo = new CRectangulo(4.8, 5.8);
    
document.write("Base: " + rectangulo.base + "<br>" + "Altura: " + rectangulo.altura + "<br>" + "Area: " + rectangulo.area());

