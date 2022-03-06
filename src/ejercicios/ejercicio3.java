package ejercicios;
import java.util.*;
public class ejercicio3 {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		int[] num=new int[8];
		
		System.out.println("Introduce 8 números");
		
		for(int i=0;i<8;i++) {
			System.out.println("Introduce el número " + i);
			numero=entrada.nextInt();
			num[i]=numero;
			//if(numero%2==0) {
			//	System.out.println("Número par: " + num[i]);
			//}else {
			//	System.out.println("Número impar: " + num[i]);
			//}
		}
		
		for(int j=0;j<8;j++) {
			if(num[j]%2==0) {
				System.out.println("Número par: " + num[j]);
			}else {
				System.out.println("Número impar: " + num[j]);
			}
		}
		


	}

}
