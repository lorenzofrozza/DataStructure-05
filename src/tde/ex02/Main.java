package tde.ex02;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Pedro", 13200);
        Funcionario funcionario2 = new Funcionario("Gugu", 12000);
        Funcionario funcionario3 = new Funcionario("Maria", 11000);
        Funcionario funcionario4 = new Funcionario("Xuxa", 15200);
        Funcionario funcionario5 = new Funcionario("Salmo", 16000);

        Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3, funcionario4, funcionario5};

        //A)em ordem crescente de salário
        OrdenarSalario.ordemCrescente(funcionarios);
        OrdenarFuncionario.print(funcionarios);
        System.out.println();

        //B)em ordem decrescente de salário
        OrdenarSalario.ordemDecrescente(funcionarios);
        OrdenarFuncionario.print(funcionarios);
        System.out.println();

        //C)em ordem alfabética
        OrdenarFuncionario.ordemAlfabetica(funcionarios);
        OrdenarFuncionario.print(funcionarios);
        System.out.println();

    }
}
