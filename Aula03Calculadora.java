import java.util.Scanner;

public class Aula03Calculadora {
  public static void main(String[] args){
    float valor1,valor2;      //Váriaveis para eu guardar o que o usuário digitar
    double resultado = 0;
    String operacao;


    Scanner leitor = new Scanner (System.in); //scaneia o que o usuário digitar na tela
    System.out.println("Digite um número:");
    valor1 = leitor.nextFloat();
    
    System.out.println("Digite um número:");
    valor2 = leitor.nextFloat();

    System.out.println("Escolha o que você quer fazer: [somar | subtrair | multiplicar | dividr]:");
    operacao = leitor.next();

    if(operacao.equals("somar")) //vai comparar se operação é igual ao que foi digitado pelo usuário e vai fazer a função de somar
    resultado = valor1 + valor2;

   else if(operacao.equals("subtrair"))//vai comparar se operação é igual ao que foi digitado pelo usuário e vai fazer a função de subtrair
    resultado = valor1 - valor2;

    else if(operacao.equals("multiplicar")) //vai comparar se operação é igual ao que foi digitado pelo usuário e vai fazer a função de multiplicar
    resultado = valor1 * valor2;

    else if(operacao.equals("dividir")) //vai comparar se operação é igual ao que foi digitado pelo usuário e vai fazer a função de dividr
    resultado = valor1 / valor2;

    System.out.println(resultado);

  }
}

// importante eu lembrar que quando eu tenho somente uma linha na condição eu não preciso abrir chaves de bloco, assim podendo economizar mais linhas no meu código.