package selecao;

import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        double value = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra:"));
        int input = Integer.parseInt(JOptionPane.showInputDialog("Voce é: cliente comum(1), funcionario(2), ou vip(3)"));
        if (input == 2){
            value = value - (value * 0.10);
        }
        if (input == 3){
            value = value - (value * 0.05);
        }
        JOptionPane.showMessageDialog(null, "Valor total: " + value);
    }
}
