package modelo;

class Hoy {
    private int dia;
    private int mes;
    private int año;
    
    public Hoy() {
    }
    
    
    public Hoy(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    // Setters y Getters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    
    public String nombreDiaDeSemana(int numeroDia) {
        String[] diasSemana = {"domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
        int indice = (numeroDia - 1) % 7; // Ajusta el número de día al rango 0-6
        return diasSemana[indice];
    }


    public String nombreDeMes(int numeroMes) {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return meses[numeroMes - 1];
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hoy hoy = (Hoy) o;
        return dia == hoy.dia && mes == hoy.mes && año == hoy.año;
    }


    @Override
    public String toString() {
        String nombreDia = nombreDiaDeSemana(getDia());
        String nombreMes = nombreDeMes(mes);
        return "Hoy es " + nombreDia + " " + getDia() + " de "  + nombreMes;
    }
}