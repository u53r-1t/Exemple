package teste_aula;

import java.util.Scanner;
public class tt {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, nota3 = 0, notaTotal = 0, frequencia = 0;
		double notaCorte = 50, fraqCorte = 60;
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = entrada.nextDouble();
		System.out.println("Digite a frequencia ");
		frequencia = entrada.nextDouble();
		
		notaTotal = nota1 = nota2 + nota3;
		if (notaTotal >= notaCorte && frequencia >= fraqCorte)
			System.out.println("Aprovado. ");
		else if(notaTotal >= (notaCorte - notaCorte * 0.20)&& frequencia >= fraqCorte)
			System.out.println("Prova especial. ");
		else if(notaTotal >= 80)
			System.out.println("aprovado direto. ");
		else
			System.out.println("reprovado. ");
		
	}
}
