

public class Exercicio03 {

    /*3. Criar um programa que calcule a média de salários de uma empresa, 
    pedindo ao usuário a grade de funcionários e os salários, 
    e devolvendo a média salarial

    */
    public static void main(String[] args) {

        double mediaSalario = 0;
        int QtFuncionario = 0;

        ClasseFuncionarioEx03 pessoa1 = new ClasseFuncionarioEx03();
        pessoa1.setNome("Lucas");
        pessoa1.setSalario(2500.00);
        QtFuncionario++;

        ClasseFuncionarioEx03 pessoa2 = new ClasseFuncionarioEx03();
        pessoa2.setNome("Lucas2");
        pessoa2.setSalario(3500.00);
        QtFuncionario++;

        ClasseFuncionarioEx03 pessoa3 = new ClasseFuncionarioEx03();
        pessoa3.setNome("Lucas3");
        pessoa3.setSalario(4500.00);
        QtFuncionario++;

        ClasseFuncionarioEx03 pessoa4 = new ClasseFuncionarioEx03();
        pessoa4.setNome("Lucas4");
        pessoa4.setSalario(5500.00);
        QtFuncionario++;

        mediaSalario = (pessoa1.getSalario() + pessoa2.getSalario() + pessoa3.getSalario() + pessoa4.getSalario()) / QtFuncionario;

        System.out.println("Temos em nossa empresa o total de funcionarios : " + QtFuncionario);
        System.out.println("Que são: " + pessoa1.getNome() + ", " + pessoa2.getNome() + ", " + pessoa3.getNome() + " e " + pessoa4.getNome());
        System.out.println("Que tem a media salario de: " + mediaSalario);
        



    
    }
    
}
