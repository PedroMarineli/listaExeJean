package selecao;

import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe outro numero: "));

        if (n1!=n2){
            JOptionPane.showMessageDialog(null, "Os numeros sao diferentes");
        }else{
            JOptionPane.showMessageDialog(null, "Os numeros sao iguais");
        }
    }
}
