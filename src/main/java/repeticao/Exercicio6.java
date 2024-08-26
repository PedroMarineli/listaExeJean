package repeticao;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int n = read.nextByte();
        int a = n;

        for (int i = 1; i < a; i++) {
            n = n * (a-i);
        }
        System.out.println(n);
    }
}
