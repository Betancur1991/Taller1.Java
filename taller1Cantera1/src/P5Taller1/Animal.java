package P5Taller1;

import java.util.Scanner;

public class Animal {
	   public void Perro() {
	        Scanner teclado=new Scanner(System.in);
	        String PedName,PedOwner,PedType;
	        int PedAge;
	        System.out.println("Ingrese el Nombre del due�o de la mascota:");
	        PedOwner=teclado.nextLine();
	        System.out.println("Ingrese edad de la mascota en a�os:");
	        PedAge=teclado.nextInt();
	        System.out.println("Ingrese el nombre de la mascota:");
	        teclado.nextLine();
	        PedName=teclado.nextLine();
	        System.out.println("Ingrese el tipo de mascota:");
	        PedType=teclado.nextLine();
	        System.out.println(PedName+" una es un(a) "+PedType+", el cual, tiene "+PedAge+" a�os de edad y "+ PedOwner+" es su actual due�o");
	      
	        teclado.close();
		
	}
	

}
