package ejercicios;
import java.util.*;
public class ejercicio4 {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		int n;
		int contadorPositivo=0;
		int contAux=0;
		int contadorNegativos=0;
		int contAux2=0;
		int contadorCero=0;
		
		System.out.println("Introduce los n numeros que quieres introducir: ");
		n=entrada.nextInt();
	
		int[] num=new int[n];
		
		for(int j=0;j<n;j++) {
			System.out.println("Introduce un número:");
			numero=entrada.nextInt();
			num[j]=numero;
		}
		
		for(int i=0;i<n;i++) {
			if(num[i]==0) {
				contadorCero++;
			}else if(num[i]>0) {
				contadorPositivo+=num[i];
				contAux++;
			}else {
				contadorNegativos+=num[i];
				contAux2++;
			}
		}
		
		if(contAux==0) {
			contAux=1;
		}
		
		if(contAux2==0) {
			contAux2=1;
		}
		
		System.out.println("[+] Ceros: " + contadorCero);
		if(contadorPositivo==0) {
			System.out.println("[+] Media positivos: No se ha podido realizar la media. No ha introducido ningún número positivo ");
		}else {
			System.out.println("[+] Media positivos: " + contadorPositivo/contAux);
		}
		
		if(contadorNegativos==0) {
			System.out.println("[+] Media negativos: No se ha podido realizar la media. No ha introducido ningún número negativo ");
		}else {
			System.out.println("[+] Media negativos: " + contadorNegativos/contAux2);
		}

	}

}
