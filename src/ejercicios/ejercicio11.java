package ejercicios;
import java.util.*;
public class ejercicio11 {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int clave;
		int[] t= new int[10];
		
		System.out.println("Introduce lo que quieras buscar");
		clave=entrada.nextInt();
		
		//Programa
		System.out.println(buscar(t, clave));
		
		

	}
	
	 static int buscar (int t[ ], int clave) {
		 
		 //Variables
		 int numeroAleatorio;
		 int numero=0;
		 boolean bandera=false;
		 
		 //Cosas
		 for(int i=0;i<t.length;i++) {
			 
			 numeroAleatorio=(int)(Math.random()*100);
			 t[i]=numeroAleatorio;
			 System.out.println("El numero introducido es: " + t[i]);
			 
		 }
		 
		 for(int j=0;j<t.length;j++) {
			 
			 if(t[j]==clave) {
				 
				 numero=t[j];
				 bandera=true;
			 }
			 
		 }
		 
		 if(!bandera) {
			 numero=-1;
		 }
		 
		 return numero;
		 
	 }

}
