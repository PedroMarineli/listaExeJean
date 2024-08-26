package repeticao;

public class Exercicio5 {
    public static void main(String[] args) {
        double chico = 1.50;
        double juca = 1.10;
        int i=0;
        while (chico>juca){
            chico=chico+0.02;
            juca=juca+0.03;
            i++;
        }
        System.out.println(i);
    }
}
