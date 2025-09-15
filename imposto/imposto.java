package imposto;

import java.util.Locale;
import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        if (salario <= 2000) {
            System.out.println("Isento");
        } else if (salario >= 2000.1 && salario <= 3000.00) {
            double imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            double imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (salario >= 4500.01) {
            double imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }
        sc.close();
    }
}
