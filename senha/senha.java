package senha;

import java.util.Locale;
import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastre aqui sua senha: ");
        int cadastro = sc.nextInt();
        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();

        while (senha != cadastro) {
            System.out.println("Senha incorreta. Tente novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
