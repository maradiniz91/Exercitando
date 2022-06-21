
import java.util.Scanner;


public class Exerc02 {
	public static void main(String [] args) {
		
		Scanner nota = new Scanner(System.in);
		double n1, n2, n3, media;
		
		System.out.println("DIGITE A PRIMEIRA NOTA: ");
		n1 = nota.nextDouble();
		
		System.out.println("DIGITE A SEGUNDA NOTA: ");
		n2 = nota.nextDouble();
		
		System.out.println("DIGITE A TERCEIRA NOTA: ");
		n3 = nota.nextDouble();
		
		media = (n1+n2+n3)/3;
		
		System.out.printf("%.1f", media);
	}
	
	
	

}
