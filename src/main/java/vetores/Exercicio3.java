package vetores;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] numerosB = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = read.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            numerosB[(numeros.length-1) - i] = numeros[i];
        }
        System.out.println("\nA=");
        for(int numero : numeros) {
            System.out.printf("%d, ", numero);
        }
        System.out.println("\nB=");
        for(int numero : numerosB) {
            System.out.printf("%d, ", numero);
        }
    }
}
