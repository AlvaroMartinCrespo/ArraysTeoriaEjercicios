package ejercicios;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] aleatorio=new int[10];
		int numAleatorio;
		int suma=0;
		
		for(int i=0;i<aleatorio.length;i++) {
			
			numAleatorio=(int)(Math.random()*100+1);
			aleatorio[i]=numAleatorio;
			System.out.println("Número "+ (i+1) + ": "+aleatorio[i]);
			suma+=numAleatorio;
			
		}

		System.out.println("La suma de todo es: "+suma);
		
	}

}
