package defaulth;

import java.util.Scanner;

public class Media {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("--MÉDIA--:");

		float n1, n2, n3, n4, media;

		System.out.print("Digite 1ºnota:");
		n1 = entrada.nextInt();
		System.out.print("Digite 2ºnota:");
		n2 = entrada.nextInt();
		System.out.print("Digite 3ºnota:");
		n3 = entrada.nextInt();
		System.out.print("Digite 4ºnota:");
		n4 = entrada.nextInt();

		media = n1 + n2 + n3 + n4;
		System.out.println("Média:");

		if (media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}