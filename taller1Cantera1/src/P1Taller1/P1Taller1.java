package P1Taller1;

import java.util.Scanner;

public class P1Taller1 {
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		String nombre;
		System.out.println("Ingrese su nombre");
		nombre = entrada.nextLine();
		System.out.println("Bienvenido señor(a) " +nombre);
		
	
		String apellido;
		System.out.println("Ingrese su apellido");
		apellido = entrada.nextLine();
		System.out.println("Bienvenido señor(a) " + nombre +" "+ apellido);
		entrada.close();
		
	}

	
}
