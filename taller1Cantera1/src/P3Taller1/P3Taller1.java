package P3Taller1;

import java.util.Scanner;

public class P3Taller1 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		String nombre,apellido,nombremama,apellidomama,nombrepapa,apellidopapa;
		System.out.println("Ingrese su nombre");
		nombre = entrada.nextLine();
		System.out.println("Ingrese su apellido");
		apellido = entrada.nextLine();
		System.out.println("Ingrese el nombre de su mam�");
		nombremama = entrada.nextLine();
		System.out.println("Ingrese el apellido de su mam�");
		apellidomama = entrada.nextLine();
		System.out.println("Ingrese el nombre de su pap�");
		nombrepapa = entrada.nextLine();
		System.out.println("Ingrese el apellido de su pap�");
		apellidopapa = entrada.nextLine();
		
		System.out.println("Yo "+ nombre+" "+apellido+", soy hijo de "+nombremama+" "+apellidomama+" y "+nombrepapa+" "+apellidopapa);
		entrada.close();
	}
	
}
