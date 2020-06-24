package defaulth;
import java.util.Scanner;
public class Caso {
    public static void main(String[] args) {
        int x, y, op;
        Scanner s = new Scanner(System.in);
 
        System.out.println(" \n Digite o valor do primeiro operando: ");
        x = s.nextInt();
        System.out.println(" \n Digite o valor do segundo operando: ");
        y = s.nextInt();
 
        System.out.println(" \n Escolha uma as opções abaixo: ");
 
        System.out.println(" \n 1. Soma ");
        System.out.println(" \n 2. Subtração ");
        System.out.println(" \n 3. Multiplicação ");
        System.out.println(" \n 4. Divisão ");
 
        System.out.println(" \n Digite a opção desejada: ");
        op = s.nextInt();
 
        switch (op) {
            case 1:
                System.out.println(" \n Opção Selecionada: 1. Soma");
                System.out.printf(" \n A soma dos dois valores é: ", (x + y));
                break; 
 
            case 2:
                System.out.println(" \n Opção Selecionada: 1. Subtração");
                System.out.printf(" \n A subtração dos dois valores é: ", (x - y));
                break; 
 
            case 3:
                System.out.println(" \n Opção Selecionada: 1. Multiplicação");
                System.out.printf(" \n A multiplicação dos dois valores é: ", (x * y));
                break; 
 
            case 4:
                System.out.println(" \n Opção Selecionada: 1. Divisão");
                if (y == 0) {
                    System.out.println(" \n Não existe divisão por zero. ");
                } else {
                    System.out.printf(" \n A divisão dos dois valores é: ", (x / y));
                }
                break; 
            default:
                System.out.println(" \n Opção Inválida. ");
        }
    } 
}