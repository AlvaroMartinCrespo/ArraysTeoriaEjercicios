package ejercicios;
import java.util.*;
public class ejercicio2 {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		int[] num=new int[10];
		
		System.out.println("Introduce 10 números");
		
		for(int i=0;i<10;i++) {
			System.out.println("Numero " + i + ":");
			numero=entrada.nextInt();
			num[i]=numero;
		}
		
		for(int j=9;j>=0;j--) {
			System.out.println(num[j]);
			
		}

	}

}
