package repeticao;

import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));

        int i=0;
        int soma=0;
        for (n1 = n1; n1 <= n2; n1++) {
            i++;
            soma=soma+i;
        }
        System.out.println("soma = " + soma);

    }
}
