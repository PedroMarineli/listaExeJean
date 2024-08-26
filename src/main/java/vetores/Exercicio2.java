package vetores;

public class Exercicio2 {
    public static void main(String[] args) {
        double[] numeros = {3.5, 9.5, 7.5, 4.5, 0.5, 6.5};
        double maior=0, menor=numeros[0], media = numeros[0];
        for(double numero : numeros) {
            media = media +numero;
            if (numero<menor){
                menor=numero;
            }
            if (numero>maior){
                maior=numero;
            }

        }
        System.out.printf("Media = %.2f\n", (media/numeros.length));
        System.out.printf("Maior = %.2f\n", maior);
        System.out.printf("Menor = %.2f\n", menor);
    }
}
