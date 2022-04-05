package exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mercadinho do Ubiratan!");
		System.out.println();
		System.out.print("Por favor, insira o valor TOTAL dos produtos comprados: ");
		double valorDoProduto = sc.nextDouble();
		
		System.out.print("Por favor, agora insira o VALOR fornecido pelo o cliente: ");
        double valorPagoPeloCliente = sc.nextDouble();
        
        
        while(valorPagoPeloCliente < valorDoProduto) {
        	System.out.println("Valor abaixo do produto, favor aumentar a quantia.");
        	System.out.print("Por favor, insira um novo VALOR: ");
        	valorPagoPeloCliente = sc.nextDouble();
        }
        
       // double moedas = valorDoProduto - valorPagoPeloCliente;
        
        double atual = valorPagoPeloCliente - valorDoProduto;
        int notas100 = (int)atual / 100;
        atual -= notas100 * 100;
        int notas50 = (int) atual / 50;
        atual -= notas50 * 50;
        int notas20 = (int) atual / 20;
        atual -= notas20 * 20;
        int notas10 = (int) atual / 10;
        atual -= notas10 * 10;
        int notas5 = (int) atual / 5;
        atual -= notas5 * 5;
        int notas2 = (int) atual / 2;
        atual -= notas2 * 2;
        int notas1 = (int) atual;
        
        
        System.out.println();
        System.out.println("O valor do TROCO será: ");
        System.out.printf("%d nota(s) de R$ 100,00;\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00;\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00;\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00;\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00;\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00;\n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00;\n", notas1);
        
        sc.close();

	}

}