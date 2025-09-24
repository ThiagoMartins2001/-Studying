package idadePassagem;

import java.util.Scanner;

public class idadePassagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double value = sc.nextDouble();

        if (age >= 1 && age <= 5) {
            System.out.println("Valor a pagar: R$ 0.00");
        } else if (age <= 0) {
            System.out.println("Idade Invalida!");
        } else if (age >= 6 && age <= 17) {
            double meia = value / 2;
            System.out.printf("Valor a pagar: R$ %.2f%n", meia);
        } else if (age >= 18 && age <= 59) {
            System.out.printf("Valor a pagar: R$ %.2f%n", value);
        } else if (age >= 60) {
            double valordareducao = value * 0.30;
            double novovalor = value - valordareducao;
            System.out.printf("Valor a pagar: R$ %.2f%n", novovalor);
        }
        sc.close();
    }
}
