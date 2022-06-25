import java.util.Scanner;

public class Exercicio04 {

    /*4. Uma parede em formato retangular, 
    cuja altura é hp (altura da parede) e a largura lp (largura da parede) 
    precisa ser coberta por azulejos também retangulares. 
    O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). 
    Escreva um programa que leia as quatro medidas hp, lp, ha e la, 
    calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada. */
    
    public static void main(String[] args) {

        double hp = 0;
        double lp = 0;
        double ha = 0.50;
        double la = 0.25;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor informe a altura da sua parede: ");
        hp = entrada.nextDouble();
        System.out.println("Por favor informe a lagura da sua parede: ");
        lp = entrada.nextDouble();

        double QuantidadeAzulejos = (hp * lp) / (ha * la);

        System.out.println("A quantidade necessaria de azulejos para preecher a sua parede será: " + QuantidadeAzulejos);



        
    }
}
