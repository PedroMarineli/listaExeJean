package vetores;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = read.nextInt();
        }
        int soma = 0;
        int i=0;
        for(int numero : numeros) {
            if (numero>0 && numeros[i]%2==0){
                soma = soma + numero;
            }
            i++;
        }
        System.out.println(soma);
    }
}
