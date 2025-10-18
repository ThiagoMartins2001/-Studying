package calculoIMC;

import java.util.Locale;
import java.util.Scanner;

public class calculoDoIMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double peso = sc.nextDouble();
            double altura = sc.nextDouble();
            double IMC = peso / (altura * altura);

            if (IMC <= 18.5) {
                System.out.printf("Aluno %d: IMC = %.2f (Abaixo do peso) %n", i + 1, IMC);
            } else if (IMC > 18.5 && IMC < 25) {
                System.out.printf("Aluno %d: IMC = %.2f (Peso normal) %n", i + 1, IMC);
            } else if (IMC >= 25 && IMC < 30) {
                System.out.printf("Aluno %d: IMC = %.2f (Sobrepeso) %n", i + 1, IMC);
            } else if (IMC >= 30) {
                System.out.printf("Aluno %d: IMC = %.2f (Obesidade) %n", i + 1, IMC);
            }

        }
        sc.close();
    }
}
