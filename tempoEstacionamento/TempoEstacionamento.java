package tempoEstacionamento;

import java.util.Scanner;

public class TempoEstacionamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas = sc.nextInt();
        double valorTotal;

        if (horas <= 0) {
            System.out.println("Tempo inválido");
        } else if (horas >= 1 && horas <= 2) {
            valorTotal = horas * 5;
            System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
        } else if (horas >= 3 && horas <= 5) {
            valorTotal = horas * 4;
            System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
        } else if (horas > 5 && horas <= 12) {
            valorTotal = horas * 3;
            System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
        } else if (horas > 12) {
            valorTotal = (horas * 3) + 20;
            System.out.printf("Valor a pagar: R$ %.2f%n", valorTotal);
        }

        sc.close();
    }
}
