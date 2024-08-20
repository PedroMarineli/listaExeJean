package selecao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o numero de macas compradas: ");
        double input = read.nextDouble();

        if (input>=12){
            System.out.printf("O custo total da compra e R$%.2f", input);
        }else{
            System.out.printf("O custo total da compra e R$%.2f", input*1.30);
        }
    }
}
