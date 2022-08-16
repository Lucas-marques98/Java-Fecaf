import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {

	    int n1 = 0, n2 = 0, res = 0; // criando variaveis na mesma linha
	    String nome = null; // inicializando uma String 

	    Scanner leitor = new Scanner(System.in); // cria um scanner para guardar o que o usuario digitar na tela.
	    
	    System.out.println("Digite seu Nome:");
	    nome = leitor.nextLine(); // vai guardar o valor de uma string digitada na tela.
	    System.out.println("Digite um numeral:");
	    n1 = leitor.nextInt(); // Recebe o valor do scanner digitado na tela e guarda na variavel n1
	    System.out.println("Digite outro numeral:");
	    n2 = leitor.nextInt(); // recebe o valor da soma e guarda na variavel n2

	    res = n1 * n2; // recebe a multiplicação de n1 * n2

	    System.out.printf(" %s a Multiplicação de %d com %d e igual a %d", nome, n1, n2, res); // mostra o resultado das somas junto
	                                                                                  // como Resultado
	}

}
