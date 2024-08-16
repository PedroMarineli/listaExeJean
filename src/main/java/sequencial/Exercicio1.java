package sequencial;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Escreva um numero: ");
        int input = read.nextInt();

        System.out.printf("O antecessor de %d e %d e o sucessor e %d", input, input-1, input+1);
    }
}