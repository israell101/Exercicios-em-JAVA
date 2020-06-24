package defaulth;

import java.util.Scanner;

public class Tabuada {

	public static void main(String args[]) {
		Scanner n = new Scanner(System.in);
		
		int contagem, num, i;

		System.out.println("Digite um número:");
		num = n.nextInt();
		
		System.out.println("Digite o limite da contagem:");
		contagem = n.nextInt();

		for (i = 1; i <= contagem; i++) {

			System.out.println(+num + "+" + i + "=" + (i + num));

		}
	}
}