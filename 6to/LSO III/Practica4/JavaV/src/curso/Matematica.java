package curso;

public class Matematica {
	
	private int b;
	private int a;
	private float PI = 3.1416F;
	public Matematica(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
	} 


	public static void main(String[] args) {
		
		
		Matematica m = new Matematica(10, 20); 
		System.out.println("Valor a:" + m.a);
		System.out.println("Valor b:" + m.b);  
		System.out.println("El promedio es: " + m.promedio(m.a, m.b)); 
		System.out.println("El promedio 3 es: " + m.promedio3(m.a, m.b, 30)); 
		System.out.println("PI: " + m.PI); 
		System.out.println("Radio: " + m.area(30)); 
		
		

		
	}
	 public int promedio(int a, int b){  
		 return ((a+b)/2); 
	   }
	 
	 public int promedio3(int a, int b, int c){
		 return (a+b+c) / 3;
	 }
	 
	 public double area(int radio) {
		 double PI= 3.1416;
		 return  (PI*Math.pow(radio, 2));
	 }
	 
	 
	 

}
