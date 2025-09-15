package DuracaoDoJogo;

import java.util.Scanner;

public class DuracaoDoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horarioinicial = sc.nextInt();
        int horariofinal = sc.nextInt();

        if (horarioinicial < horariofinal) {
            int duracao = horariofinal - horarioinicial;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else {
            int duracao = 24 - horarioinicial;
            duracao += horariofinal;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
            sc.close();
        }
    }
}
