package verificacaoDeDoisNumeros;

import java.util.Scanner;

public class verificacaoDeDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x % 2 == 0) {
            if (x == 0) {
                System.out.println("Primeiro número: PAR e ZERO");
            } else if (x > 0) {
                System.out.println("Primeiro número: PAR e POSITIVO");
            } else {
                System.out.println("Primeiro número: PAR e NEGATIVO");
            }
        } else {
            if (x > 0) {
                System.out.println("Primeiro número: IMPAR e POSITIVO");
            } else {
                System.out.println("Primeiro número: IMPAR e NEGATIVO");
            }
        }

        if (y % 2 == 0) {
            if (y == 0) {
                System.out.println("Segundo número: PAR e ZERO");
            } else if (y > 0) {
                System.out.println("Segundo número: PAR e POSITIVO");
            } else {
                System.out.println("Segundo número: PAR e NEGATIVO");
            }
        } else {
            if (y > 0) {
                System.out.println("Segundo número: IMPAR e POSITIVO");
            } else {
                System.out.println("Segundo número: IMPAR e NEGATIVO");
            }
        }

        if (x > y) {
            System.out.println("Maior número: " + x);
        } else if (y > x) {
            System.out.println("Maior número: " + y);
        } else {
            System.out.println("Os números são iguais");
        }

        sc.close();
    }
}
