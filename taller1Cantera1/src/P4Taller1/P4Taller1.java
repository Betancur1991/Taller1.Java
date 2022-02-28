package P4Taller1;

import java.util.Scanner;

public class P4Taller1 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner (System.in);
		String capital,pais;
		System.out.println("Ingrese la ciudad capital");
		capital = entrada.nextLine();
		System.out.println("el pais del cual esta ciudad es capital es");
		pais = entrada.nextLine();
		

		
		System.out.println("La ciudad "+ capital +" "+", es la capital del pais "+pais+".");
		
		entrada.close();

	}
	
}
