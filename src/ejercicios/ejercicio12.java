package ejercicios;
import java.util.*;
public class ejercicio12 {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
				int numeroIntroducido;
				int[] numeros=new int[5];
				
				//Programa
				for(int i=0;i<numeros.length;i++) {
					
					System.out.println("Introduce el número " + (i+1) + ": ");
					numeroIntroducido=entrada.nextInt();
					numeros[i]=numeroIntroducido;
					
				}
				
				System.out.println("---Se mostrarán los números en el mismo orden que han sido introducido---");
				for(int j=0;j<numeros.length;j++) {
					System.out.print(numeros[j] + " ");
				}

	}

}
