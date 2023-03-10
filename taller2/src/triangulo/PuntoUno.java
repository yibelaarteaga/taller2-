package triangulo;

import java.util.Scanner;

public class PuntoUno {
	
	public void calcularSuperficie() {
		double base;
		double altura;
		double superficie;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ingrese base:\t ");
		double b = sc.nextDouble();
		
		System.out.println("ingrese altura:\t ");
		double a =sc.nextDouble();
		
		superficie = ((b*a)/2);
		
		System.out.println("el area del triangulo es:\t" +superficie);
	
		
		
		
		
	}

}
