package ejercicios;
import java.util.*;

import javax.swing.JOptionPane;
public class CombinacionSecreta {
	
	static Scanner entrada=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Reglas
		JOptionPane.showMessageDialog(null, "---Reglas---" + "\n" + "1.- Se generará una combinación de números aleatorios de la longitud que elija." 
		+ "\n" + "2.- Se le mostrarán algunas pistas sobre la combinación." + "\n" + "3.- Los numeros serán del 1 al 5." + "\n" 
				+ "------BUENA SUERTE------");
		
		//Variables
		int longitudCombinacion, aleatorio, digito, contador;
		boolean acierto;
		
		//Parametros a regular
		JOptionPane.showMessageDialog(null, "Pasaremos a regular algunos parametros en base a la dificultad");
		contador=Integer.parseInt(JOptionPane.showInputDialog("Elige la cantidad de intentos que quieres, para regular la dificultad"));
		longitudCombinacion=Integer.parseInt(JOptionPane.showInputDialog("Elige la longitud de la combinacion, a mas longitud más dificultad"));

		
		//Combinacion e intento
		
		int[] intento=new int[longitudCombinacion];
		
		int[] combinacion=new int[longitudCombinacion];
		
		for(int i=0;i<combinacion.length;i++) {
			aleatorio=(int)(Math.random()*6);
			combinacion[i]=aleatorio;
			
			//Muestra la combinacion
			//System.out.print(combinacion[i] + " ");
		}
		
		//Acertar la combinacion
		
		do {
			
			for(int j=0;j<combinacion.length;j++) {
				
				System.out.println("Introduce el intento dígito a dígito: (" + (j+1) + " de " + longitudCombinacion + ")");
				digito=entrada.nextInt();
				intento[j]=digito;
				
			}
			
			//Validacion de combinacion
			acierto=combinacionSecreta(combinacion, intento);
			contador--;
			if(!acierto) {
				System.out.println("Le quedan " + contador + " intentos" + "\n");
			}
			
			
			
		}while(!acierto && contador>0);
		
		if(acierto) {
			JOptionPane.showMessageDialog(null, "FELICIDADES HAS ENCONTRADO LA COMBINACION SECRETA");
		}else {
			JOptionPane.showMessageDialog(null, "LO SIENTO, PERO NO HAS ENCONTRADO LA COMBINACION SECRETA");
		}
		

	}
	
	static boolean combinacionSecreta(int[] combinacion, int[]intento) {
		
		//Variables
		boolean acierto=false;
		
		//Comprobar si ha acertado o no la combinacion
		
		if(Arrays.equals(intento, combinacion)) {
			
			acierto=true;
			
		}else {
			
			System.out.println("[+] PISTAS: ------------");
			
			for(int i=0;i<combinacion.length;i++) {
				if(intento[i]==combinacion[i]) {
					System.out.println("* El dígito " + (i+1) + " es igual al de la combinacion");
				}else if(intento[i]>combinacion[i]) {
					System.out.println("* El dígito " + (i+1) + " es mayor al de la combinacion");
				}else {
					System.out.println("* El dígito " + (i+1) + " es menor al de la combinacion");
				}
			}
			
			acierto=false;
			System.out.println("--Vuelva a introducir otro intento--" + "\n");
			
		}	
		
		return acierto;
		
	}

}
