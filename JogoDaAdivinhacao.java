package controle;

import java.util.Scanner;

public class JogoDaAdivinhacao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numParaAdivinhar = 25;
		int totalTentativasIniciais = 10;
		int contadorTentativas = 10;
		int numInformado = 0;

		System.out.print("Tente adivinhar o numero de 0 a 100: ");

		while (numInformado != numParaAdivinhar && contadorTentativas > 0) {
			numInformado = entrada.nextInt();
			contadorTentativas--;
			if (numInformado == numParaAdivinhar) {
				System.out.printf("Parabens vc acertou na tentativa nº %d.",
						totalTentativasIniciais - contadorTentativas);
			} else if (contadorTentativas == 0) {
				System.out.println("Tentativas encerradas, vc perdeu.");
			} else if (numParaAdivinhar < numInformado) {
				System.out.printf("O numero é MENOR, restam %d tentativas: ", contadorTentativas);
			} else {
				System.out.printf("O numero é MAIOR, restam %d tentativas: ", contadorTentativas);
			}

		}
		entrada.close();
	}
}