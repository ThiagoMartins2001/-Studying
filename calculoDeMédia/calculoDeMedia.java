package calculoDeMédia;

import java.util.Locale;
import java.util.Scanner;

public class calculoDeMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double pesoDois = sc.nextDouble();
            double pesoTres = sc.nextDouble();
            double pesoCinco = sc.nextDouble();

            double media = ((pesoDois * 2) + (pesoTres * 3) + (pesoCinco * 5)) / 10;
            System.out.printf("media: %.1f%n", media);
        }
        sc.close();
    }
}
