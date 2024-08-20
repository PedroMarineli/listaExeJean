package sequencial;

import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {
        double input = Double.parseDouble(JOptionPane.showInputDialog("Digite uma medida em polegada: "));

        JOptionPane.showMessageDialog(null, "O valor em polegadas e " + (input*2.54));
    }
}
