package SeletorDeItemEQuantidade;

import java.util.Scanner;

public class SeletorDeItemEQuantidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lista de itens:");
        System.out.println("1 - Cachorro Quente | 4,00");
        System.out.println("2 - X-Salada | 4,50");
        System.out.println("3 - X-Bacon | 5,00");
        System.out.println("4 - Torrada simples | 2,00");
        System.out.println("5 - Refrigerante | 1,50");

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        switch (codigo) {
            case 1:
                System.out.printf("Total: R$: %.2f%n", (quantidade * 4.00));
                break;
            case 2:
                System.out.printf("Total: R$: %.2f%n", (quantidade * 4.50));
                break;
            case 3:
                System.out.printf("Total: R$: %.2f%n", (quantidade * 5.00));
                break;
            case 4:
                System.out.printf("Total: R$: %.2f%n", (quantidade * 2.00));
                break;
            case 5:
                System.out.printf("Total: R$: %.2f%n", (quantidade * 1.50));
                break;
            default:
                System.out.printf("Código inválido");
                break;
        }

        sc.close();
    }
}
