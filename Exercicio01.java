public class Exercicio01 {

     /*  1. Escreva um programa que, com base em uma temperatura em graus celsius,
     a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
     seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67 
     */
    

    public static void main(String[] args) {

        double C = 2.43;
        double K = C + 273.15;
        double Re = C * 0.8;
        double Ra = (C * 1.8) + 32 + 459.67;
        double F = (C * 1.8) + 32;

        System.out.println(" Caso nossa temperatura em grau celsius seja 2.43, em Kelvin será: " + K);
        System.out.println(" Caso nossa temperatura em grau celsius seja 2.43, em Réaumur será: " + Re);
        System.out.println(" Caso nossa temperatura em grau celsius seja 2.43, em Rankine será: " + Ra);
        System.out.println(" Caso nossa temperatura em grau celsius seja 2.43, em Fahrenheit será: " + F);

    }
    
}
