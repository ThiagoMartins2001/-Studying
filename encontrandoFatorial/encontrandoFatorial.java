package encontrandoFatorial;

import java.util.Scanner;

public class encontrandoFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        System.err.println("Fatorail: " + fat);
        sc.close();
    }
}
