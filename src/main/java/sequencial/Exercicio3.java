package sequencial;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o valor do veiculo: ");
        double custo = read.nextDouble();
        System.out.printf("O custo final do veiculo e %.2f", (custo+(custo*0.28)+(custo*0.45)));
    }
}
