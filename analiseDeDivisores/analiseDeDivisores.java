package analiseDeDivisores;

import java.util.Scanner;

public class analiseDeDivisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y != 0) {
                double resultado = x / y;
                System.out.printf("resporta: %.1f%n", resultado);
            } else {
                System.out.println("Divisão impossivel");
            }
        }

        sc.close();
    }
}
