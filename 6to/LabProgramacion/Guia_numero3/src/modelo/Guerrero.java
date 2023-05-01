package modelo; 
 
public class Guerrero { 
 private String nombre; 
 private int vitalidad; 
 private int armadura; 
 private double x; 
 private double y; 
 
 public int getVitalidad() { 
  return vitalidad; 
 } 
 
 public void setVitalidad(int vitalidad) { 
  this.vitalidad = vitalidad; 
 } 
 
 public String getNombre() { 
  return nombre; 
 } 
 
 public void setNombre(String nombre) { 
  this.nombre = nombre; 
 } 
 
 public int getArmadura() { 
  return armadura; 
 } 
 
 public void setArmadura(int armadura) { 
  this.armadura = armadura; 
 } 
 
 public double getX() { 
  return x; 
 } 
 
 public void setX(double x) { 
  this.x = x; 
 } 
 
 public double getY() { 
  return y; 
 } 
 
 public void setY(double y) { 
  this.y = y; 
 } 
 
 public void mover(int x, int y) { 
  this.x = x; 
  this.y = y; 
 } 
 
 public void recibirDmg(int cantidad) { 
  if (this.armadura >= cantidad) 
   this.armadura -= cantidad; 
  else { 
   int aux = cantidad - this.armadura; 
   this.armadura = 0; 
   this.vitalidad -= aux; 
  } 
 } 
 
 public String toString() { 
  return "Nombre: " + this.nombre + " Armadura: " + this.armadura + " Vitalidad: " + this.vitalidad 
    + " Coordenadas: (" + this.x + ", " + this.y + ")"; 
 } 
}