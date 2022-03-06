package teoria;
import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numero=new int[4];
		
		numero[0]=26;
		numero[1]=-30;
		numero[2]=0;
		numero[3]=100;

		System.out.println("Los valores de la array son los siguientes:");
		System.out.println(numero[0] + " " + numero[1] + " " + numero[2] + " " + numero[3]);
		
		int suma= numero[0] + numero[3];
		System.out.println("La suma es: " +suma);
	}

}
