import java.util.Scanner;

import javax.management.Query;

public class Exercicio05 {

    /*5. Escreva um programa para determinar 
    a quantidade de cavalos necessários para se 
    levantar uma massa de m quilogramas a uma altura de h metros em t segundos. 
    Considere cavalos = (m * h / t) / 745,6999 */

    public static void main(String[] args) {
        double m;
        double h;
        double t;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantos quilogramas será necessario carregar: ");
         m = entrada.nextDouble();
        System.out.println("Digite quantos metros teremos que percorrer: ");
        h = entrada.nextDouble();
        System.out.println("Digite o tempo que teremos para finalizar a atividade: ");
        t = entrada.nextDouble();

        double Qtcavalos = (m * h /t) / 745.699;

        System.out.println("Será necessario essa quantidade de cavalos para realziar a atividade: " + Qtcavalos);

        
    }
    
}
