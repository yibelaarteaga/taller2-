package principal;

import triangulo.PuntoUno;

public class principal {

	public static void main(String[] args) {
		
		
		PuntoUno sp = new PuntoUno();
		sp.calcularSuperficie();
		
		
		
		PuntoDos();
		System.out.println("\n\n PuntoDos");
		 double ecuacion;
		 double x = 2;
		 double y = 4;
		 double z = 5;
		 
		 ecuacion = (Math.sqrt(Math.pow(x,5)-6)) /(4);
		   System.out.println(ecuacion);
		   
		   ecuacion = (Math.pow(x,y)- Math.pow(6, x));
		   System.out.println(ecuacion);   
		   
		   ecuacion = (Math.pow(x,4)- Math.sqrt( 6 + x -Math.pow(y,3)));
		   System.out.println(ecuacion);   
		   
		   ecuacion = (1) / (y- (1)) / (x - Math.pow(2, y));
		   System.out.println(ecuacion);   
		   
		   ecuacion = (7 + (Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 + x -4))))));
		   System.out.println(ecuacion);   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void PuntoDos() {
		// TODO Auto-generated method stub
		
	}
	
	
   

	
}


