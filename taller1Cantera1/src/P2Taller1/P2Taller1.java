package P2Taller1;

import java.util.Scanner;

public class P2Taller1 {
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		String nombre;
		System.out.println("Ingrese su nombre completo");
		nombre = entrada.nextLine();
		System.out.println("Bienvenido se�or(a) " +nombre);
		entrada.close();
		
		Scanner nom=new Scanner (System.in);
		int edad;
		System.out.println("Ingrese su edad");
		edad = nom.nextInt();
		System.out.println("Bienvenido se�or(a) " + nombre +" su edad actual es de "+ edad+" a�os.");
		nom.close();
	}

	
}
