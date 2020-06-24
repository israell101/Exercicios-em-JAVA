package defaulth;

import java.util.Scanner;

public class info_numerica {

	public static void main(String args[]) {
		Scanner n1 = new Scanner(System.in);

		int num, n = 0, C, cont10 = 0, divs = 0, simp = 0, simp2 = 0;

		System.out.println("Digite um número:");
		num = n1.nextInt();

		for (C = 1; C <= 5; C++) { // 2

			if (num >= 0) and (num <= 5);
			{
				cont10 = (cont10 + 1);
			}

			if ((num % 5) == 0) {
				divs = divs + 1;
			}

			if (num == 0) {
				n = n + 1;
			}
			if ((num % 2) == 0) {
				simp = simp + num;
			}
			else {
				simp2 = simp2 + num;
			}
		}
		
		System.out.println("A soma dos valores pares é: " +simp);
		System.out.println("A soma dos valores ímpares é: " +simp2);
	  //System.out.println("Soma deles: " +(cont10*num)); // 
		System.out.println("Nulos: " +n);
		System.out.println(divs +" números são divisiveis por 5");
	}

	private static void and(boolean b) {
		// TODO Auto-generated method stub
	}
}