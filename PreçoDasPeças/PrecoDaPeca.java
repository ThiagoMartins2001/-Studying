import java.util.Locale;
import java.util.Scanner;

public class PrecoDaPeca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca1 = sc.nextInt();
        int Quantidade1 = sc.nextInt();
        double preco1 = sc.nextDouble();

        int peca2 = sc.nextInt();
        int Quantidade2 = sc.nextInt();
        double preco2 = sc.nextDouble();

        double valortotal = (Quantidade1 * preco1)+ (Quantidade2 * preco2);

        System.out.printf("Valor total: %.2f%n", valortotal);

        sc.close();

    }
}