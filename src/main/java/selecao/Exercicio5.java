package selecao;

import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador"));

        if (age>17){
            JOptionPane.showMessageDialog(null, "adulto");
        } else if (age>13) {
            JOptionPane.showMessageDialog(null, "juvenil B");
        } else if (age>10) {
            JOptionPane.showMessageDialog(null, "juvenil A");
        } else if (age>7) {
            JOptionPane.showMessageDialog(null, "infantil B");
        }else {
            JOptionPane.showMessageDialog(null, "infantil A");
        }
    }
}
