package exercicio4;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		char char1 = 'a';
		char char2 = 'e';
		char char3 = 'i';
		char char4 = 'o';
		char char5 = 'u';
		
		
		System.out.printf("Digite uma letra: ");
		char letra = sc.next().charAt(0);
		
		
		
		if(letra == char1 || letra == char2  || letra == char3  || letra== char4  || letra == char5 ) {
		   System.out.println("A letra " + letra  + " é vogal.");
		
		
		} else {
			System.out.println("A letra " + letra  + " é conssoante.");
		}
		
		
		
		
	sc.close();	
	}

}
