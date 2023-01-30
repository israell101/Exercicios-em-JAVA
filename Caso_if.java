package defaulth;
//tste
import java.util.Scanner;

public class Caso_if {
	public static void main(String args[]) {
		Scanner cad = new Scanner(System.in);
		
		String nome = null, def = null, sexo = null;
		int idade =  0;

		System.out.println("Nome completo:");
		nome = cad.next();

		System.out.println("Idade:");
		idade = cad.nextInt();

		System.out.println("Sexo[m/f]:");
		sexo = cad.next();

		System.out.println("Possui alguma deficiência[s/n]:");
		def = cad.next();

		switch (sexo) {
		case "m":
			if (def == "s") {

				if (idade >= 18) {
					System.out.println("Já é preciso que faça seu alistamento:");
					System.out.printf("você já é maior de idade, ", idade, "anos");
				}

				else {
					System.out.println("Ainda não é tempo!");
				}
			} else {
				System.out.println("Como possui deficiência, então está insento!");
			}
			break;

		case "f":
			if (idade >= 18) {
				System.out.println("Já pode se alistar(Não é obrigatório):");
				System.out.printf("você já é maior de idade, ", idade, "anos");
			} else {
				System.out.println("Ainda não é tempo!");
			}
		}cad.close();
	}
}