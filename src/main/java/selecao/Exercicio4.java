package selecao;

import javax.swing.*;

public class Exercicio4 {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe um segunda nota: "));

        double media = (n1+n2)/2;

        if (media>=6){
            JOptionPane.showMessageDialog(null, "aprovado");
        }else{
            JOptionPane.showMessageDialog(null, "reprovado");
        }
    }
}
