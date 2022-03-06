package ejercicios;
import java.util.*;
public class ejercicio7 {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array
		int[] t=new int[10];
		
		//Programa
		System.out.println("De todos los números, el mayor es: " + maximo(t));

	}
	
	static int maximo(int t[]) {
		
		int aleatorio, mayor, aux=0;
		int cont=0;
		
		//For para introducir números aleatorios en la array
		/*for(int i=0;i<t.length;i++) {
			
			System.out.println("Número " + (i+1) + ":");
			aleatorio=(int)(Math.random()*100);
			t[i]=aleatorio;
			System.out.println(t[i]);
			
		}*/
		
		//for-each	
		for(int num: t) {
			
			
			
			aleatorio=(int)(Math.random()*100);
			t[cont]=aleatorio;
			System.out.println(t[cont]);
			
			cont++;
			
		}
		
		//Ordenamos la array
		Arrays.sort(t);
		
		//El ultimo es el mayor ya que esta ordenado
		mayor=t[9];
			
			return mayor;
			
		}
		
		
	

}

