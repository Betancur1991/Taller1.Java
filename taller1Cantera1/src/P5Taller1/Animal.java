package P5Taller1;

import java.util.Scanner;

public class Animal {
	   public void Perro() {
	        Scanner teclado=new Scanner(System.in);
	        String PedName,PedOwner,PedType;
	        int PedAge;
	        System.out.println("Ingrese el Nombre del dueño de la mascota:");
	        PedOwner=teclado.nextLine();
	        System.out.println("Ingrese edad de la mascota en años:");
	        PedAge=teclado.nextInt();
	        System.out.println("Ingrese el nombre de la mascota:");
	        teclado.nextLine();
	        PedName=teclado.nextLine();
	        System.out.println("Ingrese el tipo de mascota:");
	        PedType=teclado.nextLine();
	        System.out.println(PedName+" una es un(a) "+PedType+", el cual, tiene "+PedAge+" años de edad y "+ PedOwner+" es su actual dueño");
	      
	        teclado.close();
		
	}
	

}
