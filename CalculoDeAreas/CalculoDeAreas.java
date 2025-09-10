import java.util.Locale;
import java.util.Scanner;

public class CalculoDeAreas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangle = (A * C) / 2.0;
        double circle = Math.PI * Math.pow(C, 2);
        double trapeze = (A + B) * C / 2.0;
        double square = Math.pow(B, 2);
        double retangle = A * B;


        System.out.printf("Triangle = %.3f\n", triangle);
        System.out.printf("Circle = %.3f\n", circle);
        System.out.printf("Trapeze = %.3f\n", trapeze);
        System.out.printf("Square = %.3f\n", square);
        System.out.printf("Retangle = %.3f\n", retangle);



        sc.close();
    }
}