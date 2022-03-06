package ejercicios;
import java.util.*;
public class ejercicio8 {

	static Scanner entrada=new Scanner(System.in);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables 
		int[] numeros=new int[15];
		int numeroIntroducir;
		
		//Introducimos los numeros en la array
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Introduce el número " + (i+1) + " de 15:");
			numeroIntroducir=entrada.nextInt();
			numeros[i]=numeroIntroducir;
			
		}
		
		System.out.println("----Se estan ordenando los numeros----" + "\n" + "--------------------------------------");
		
		//Programa que ordena la array
		ordenarArray(numeros);	

	}
	
	static void ordenarArray(int numeros[]) {
		
		int[] arrayOrdenada=new int[15];
		
		for(int i=0;i<numeros.length;i++) {
			
			if(i<14) {
				arrayOrdenada[i+1]=numeros[i];
			}	
			
		}
		
		arrayOrdenada[0]=numeros[14];
		
		System.out.println("La lista ordenada es: ");
		for(int j=0;j<numeros.length;j++) {
			System.out.print(arrayOrdenada[j] + " ");
		}
	
	}

}
