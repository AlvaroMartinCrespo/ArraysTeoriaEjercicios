package ejercicios;
import java.util.*;
public class ejercicio9 {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int longitud, fin;
		
		
		//Inicializamos
		System.out.println("Introduce la longitud: ");
		longitud=entrada.nextInt();
		int a[] =new int[longitud];
		
		System.out.println("Introdice el fin: " + " (Hasta que numeros quiere que llegue lus numeros de la array)");
		fin=entrada.nextInt();
		
		
		//Programa
		System.out.println("----Tabla----");
		
		a=rellenaPares(longitud, fin);
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		
		//for(int i=0;i<longitud;i++) {
		//	System.out.print(rellenaPares(longitud, fin)[0] + " ");
		//}
		
		//System.out.println(rellenaPares(longitud, fin));

	}
	
	static int[] rellenaPares(int longitud, int fin) {
		
		int[] numeros=new int[longitud];
		int aleatorio;
		
		
		
		for(int i=0;i<numeros.length;i++) {
			
			do {
				
				aleatorio=(int)(Math.random()*fin+2);
				
			}while(aleatorio%2==1);
			
			numeros[i]=aleatorio;
			
			
		}
		
		Arrays.sort(numeros);
		
		return numeros;
		
	}

}
