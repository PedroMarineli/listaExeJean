package repeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double before=0, price, maior = 0, soma = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.println("digite o codigo do produto " + i);
            int cod = read.nextInt();
            System.out.println("digite o preço do produto " + i);
            price = read.nextDouble();

            if (price > before){
                maior = price;
            }

            before = price;

            soma = soma + price;
        }
        System.out.printf("Maior = %.2f\n", maior);
        System.out.printf("Soma = %.2f", soma);
    }
}
