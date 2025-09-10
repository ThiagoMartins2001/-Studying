import java.util.Locale;
import java.util.Scanner;

public class RaioDoCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo é %.4f%n: ", area);

        sc.close();
    }
}
