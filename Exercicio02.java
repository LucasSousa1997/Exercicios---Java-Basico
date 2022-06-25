import java.util.Scanner;

public class Exercicio02 {

   /*  2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
    Fazer um algoritmo que calcule e escreva:
        a. a maior e a menor altura do grupo;
        b. média de altura dos homens;
        c. o número de mulheres.*/

        public static void main(String[] args) {

            int sexo;
            int QtHomem = 0;
            int QtMulher = 0;
            float altura;
            float soma = 0;
            float mediaHomens;
            float maior = 0;
            float menor = 0;
            Scanner  entrada = new Scanner(System.in);


            int contador = 10;

            for (int i = 0; i <= contador; i++) {
                
                System.out.println("Por favor digite (1) Mulher e (2) Homem:  ");
                sexo = entrada.nextInt();
                System.out.println("Por favor digite a sua altura: ");
                altura = entrada.nextFloat();
                if( sexo == 1){
                    QtMulher++;

                }else if(sexo == 2){
                    QtHomem++;
                    soma = soma + altura;
                }else{
                    System.out.println("Opção invalida!");
                }

                if (altura > maior ) {
                    maior = altura;
                    
                }else if(altura < menor){
                    menor = altura;
                }
 
            }

            mediaHomens = soma / QtHomem;

            System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
            System.out.println("A média de altura dos homens é " + mediaHomens + " m");
            System.out.println("O número de mulheres é " + QtMulher);
            entrada.close();

        }

    
}
