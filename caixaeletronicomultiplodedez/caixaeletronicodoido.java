package caixaeletronicomultiplodedez;

import java.util.Scanner;

public class caixaeletronicodoido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorTotal = 0;

        while (true) {
            int money = sc.nextInt();
            if (money == 0) {
                break;
            } else if (money % 10 != 0) {
                System.out.println("Valor inválido, tente novamente");
            } else {
                valorTotal += money;
            }
        }
        System.out.println("Encerrando operações");
        System.out.printf("Total acumulado: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
