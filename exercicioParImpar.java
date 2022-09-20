import java.util.Scanner;
import java.util.ArrayList;

public class exercicioParImpar {
  public static void main(String[] args) {
    int valorInicial;
		int valorFinal;
		int cont=0;
		
		Scanner entradaDados = new Scanner (System.in);
		
		System.out.println("Digite o número Inicial");
		valorInicial = entradaDados.nextInt();
		
		System.out.println("Digite o número Final");
		valorFinal = entradaDados.nextInt();
		
    System.out.println("\n Lista de numeros impares");
		ArrayList<Integer> impares = getImpares(valorInicial, valorFinal);
		//For each
		for (int itemImpar: impares)
		{
			System.out.printf("%d ", itemImpar);

	
		}

    System.out.println("\n\n Lista de numeros pares");
    ArrayList<Integer> pares = getPares(valorInicial, valorFinal);
    for (int itemPar : pares)
		{
			System.out.printf("%d ", itemPar);
	
		}

	}
	
	//Função que retorna os numeros pares utilizando array []
	public static ArrayList<Integer> getPares (int numeroInicial, int numeroFinal)
	{ int valorInicial = numeroInicial; 
    int valorFinal = numeroFinal;

    ArrayList<Integer> pares = new ArrayList<Integer>();
		while (valorInicial <= valorFinal)
		{
			if (valorInicial % 2 == 0)
				//Adiciona o numero impar no array (.add())
				pares.add(valorInicial);

			valorInicial++;
		}

		return pares;
	}
	

	
	public static ArrayList<Integer> getImpares (int numeroInicial, int numeroFinal) {
		
		int valorInicial = numeroInicial;
		int valorFinal = numeroFinal;
		
		//Instancia da classe ArrayList para criar um elemento do tipo array (inteiro)
		ArrayList<Integer> impares = new ArrayList<Integer>();
		// impares.add() - Adiciona um novo elemento no array
		// impares.remove() - Remover um elemento do array
		// impares.size() - Retorna a quantidade de elementos de um array
		// impares.get() - Retorna um valor baseado em um indice
		// impares.indexOf() - Busca um conteudo no array e retorna o seu indice
		//				Obs: (Se encontrar retorna o indice do elemento, sen�o encontrar ele retorna -1)
		//impares.contains() - Busca um conteudo no array e retorna true ou false
		//impares.set() - Atualizar um conteudo do array baseado no indice
		//impares.clear() ou .removeAll() - Apagar o conteudo do array 
		
		while (valorInicial <= valorFinal)
		{
			if (valorInicial % 2 != 0)
				//Adiciona o numero impar no array (.add())
				impares.add(valorInicial);

			valorInicial++;
		}

		return impares;
	}

}
