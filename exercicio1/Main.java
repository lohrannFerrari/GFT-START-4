package exercicio1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int quantidadePessoa = 5;
		int idade, contIdade = 0, contAltura = 0, contPeso = 0;
		double altura, peso = 0, somaAltura = 0;

		for (int i = 1; i <= quantidadePessoa; i++) {
			System.out.print("Digite a idade da " + i + "º " + "pessoa: ");
			idade = sc.nextInt();

			System.out.print("Digite a altura da " + i + "º " + "pessoa: ");
			altura = sc.nextDouble();

			System.out.print("Digite o peso da " + i + "º " + "pessoa: ");
			peso = sc.nextDouble();

			System.out.println();
			if (idade >= 10 && idade <= 20) {
				somaAltura += altura;
				contAltura++;
			} else if (idade > 50) {
				contIdade++;
			}

			if (peso < 40) {
				contPeso++;
			}

		}

		double porcentagemPessoa = (contPeso / quantidadePessoa) * 100;

		System.out.println("Pessoas com idade superior a 50 anos é: " + contIdade);
		System.out.println("A média da altura das pessoas com idade entre 10 e 20 anos é: " + (somaAltura / contAltura));
		System.out.println("A porcentagem das pessoas com peso inferior a 40 quilos é: " + porcentagemPessoa);

	
	sc.close();
	}

}
