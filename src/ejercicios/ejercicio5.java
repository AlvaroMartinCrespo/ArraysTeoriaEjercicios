package ejercicios;
import java.util.*;
public class ejercicio5 {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num=new int[10];
		int suma=0;
		
		for(int i=0;i<10;i++) {
			num[i]=(int) (Math.random()*100);
			
		}
		
		for(int j=0;j<10;j++) {
			suma+=num[j];
		}
		
		System.out.println("La suma de todos los numeros creados aleatoriamente es: " + suma);
		
		
		
		
		

	}

}
