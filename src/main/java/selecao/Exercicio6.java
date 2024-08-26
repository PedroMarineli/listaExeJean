package selecao;

import javax.swing.*;

public class Exercicio6 {
    public static void main(String[] args) {
        double type = Double.parseDouble(JOptionPane.showInputDialog("Digite a o tipo de combustivel: alcool(1), gasolina(2)"));
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de combustivel"));

        if (type ==1){
            if (amount<=20){
                amount = 2.90 * amount - (amount * 0.03);
            }else {
                amount = 2.90 * amount - (amount * 0.05);
            }
        }
        if (type == 2){
            double o = amount;
            if (amount<=20){
                amount = 3.30 * amount - (amount * 0.04);
            }else {
                amount = 3.30 * amount - (amount * 0.06);
            }
        }
        JOptionPane.showMessageDialog(null, "Valor: " + amount);
    }
}
