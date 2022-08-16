import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula02Media {
  public static void main(String[] args) {
    /*
     * Dados Primitivos
     * 
     * String - Representa a entrada de texto
     * Inteiro - Representa a entrada de números positivos e negativos
     * Float - Representa a entrada de números positivos e negativos com casas
     * decimais
     * Boolean - Representa a entrada de dados - True & False (Verdadeiro ou Falso)
     * Char - Representa a entrada de texto (Quantidade de caracteres menor)
     * Double / Decimal - Representa a entrada de números positivos e negativos com
     * casas decimais
     * (Quantidade de números muito maiores)
     */
    Scanner ler = new Scanner(System.in); // para guardar o que o usuário digita.
    DecimalFormat numeroFormat = new DecimalFormat("#.00"); // para formatar números decimais (#. e o número de casas
                                                            // decimais que eu quero)
    float nota1, nota2, nota3, nota4;
    float media;

    System.out.println("Favor digitar a Nota1 \n");
    nota1 = ler.nextFloat();
    System.out.println("Favor digitar a nota2 \n");
    nota2 = ler.nextFloat();
    System.out.println("Favor digitar a nota3 \n");
    nota3 = ler.nextFloat();
    System.out.println("Favor digitar a nota4 \n");
    nota4 = ler.nextFloat();

    // processamento da média do Aluno

    media = (nota1 + nota2 + nota3 + nota4) / 4; // calculo da média
    System.out.printf("A sua nota é : " + numeroFormat.format(media));
  }
}

// é possivel usar o var no Java , para deixar a própria Linguagem definir pra
// você o tipo de dados.
// Sysout para escrever rapido o System.out.println
// método next guarda uma string por padrão, mas para digitar mais de uma
// palavra é preciso usar o nextLine