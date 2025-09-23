package negativoOUpositivo;

import java.util.Scanner;

public class negativoOUpositivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Negativo");
        } else if (n > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }
}
