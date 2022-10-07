import java.util.Scanner;

public class ReajusteSalario {
  public static void main(String[] argS) {
    String nome_funcionario;
    int anos_empresa;
    double salario_funcionario = 0;
    double reajusteAnual = 0;

    Scanner entradaDados = new Scanner(System.in);

    System.out.println(" Favor digitar o nome do funcionário: ");
    nome_funcionario = entradaDados.nextLine();

    System.out.println("Favor digitar quantos anos o funcionário tem de empresa: ");
    anos_empresa = entradaDados.nextInt();

    System.out.println("Favor digitar o salário do funcionário: ");
    salario_funcionario = entradaDados.nextDouble();

    reajusteAnual = calcularAnos(anos_empresa, reajusteAnual);
    System.out.println("o reajuste do funcionário foi de: " + reajusteAnual + "%");
    System.out.println("Novo salário do funcionário  " + nome_funcionario + " foi de: "
        + calSalario(salario_funcionario, reajusteAnual));
  }

  public static double calcularAnos(int anos_empresa, double reajusteAnual) {

    if (anos_empresa <= 5) {
      reajusteAnual = 10;
    } else if (anos_empresa <= 8) {
      reajusteAnual = 20;
    } else if (anos_empresa <= 15) {
      reajusteAnual = 25;
    } else {
      reajusteAnual = 30;

    }
    return reajusteAnual;

  }

  public static double calSalario(double salario, double reajusteAnual) {
    double salario_reajustado = 0;
    double total_reajustado = 0;

    total_reajustado = salario * reajusteAnual;

    salario_reajustado = salario + total_reajustado / 100;
    return salario_reajustado;

  }
}