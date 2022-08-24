import java.util.Scanner;

public class Aula04{

	public static void main(String[] args) {
		//Declaração de variaveis
				float valor1, valor2;
				double resultado = 0;
				String operacao;
				boolean erro = false;
				
				//Instanciar as classes
				Scanner entradaDados = new Scanner(System.in);
				
				//Entrada de dados pelo usuário
				System.out.println("Digite o valor1:");
				valor1 = entradaDados.nextFloat();
				
				System.out.println("Digite o valor2:");
				valor2 = entradaDados.nextFloat();
				
				System.out.println("Escolha a operação a ser calculada: \n"
						+ " [somar | subtrair | multiplicar | dividir]:");
				operacao = entradaDados.next().toUpperCase();
				
				//toUpperCase() - converte uma String em MAIUSCULO
				//toLowerCase() - converte uma String em minusculo
				
					
				
				/* Operadores de comparação
				 * 
				 *  == (Comparação de igualdade)
				 *  != (Comparação de diferença)
				 *  <  (Comparação de valor menor)
				 *  >  (Comparação de valor maior)
				 *  <= (Comparação de valor menor ou igual)    
				 *  >= (Comparação de valor maior ou igual)
				 *  ===(Comparação de conteudo igual e tipo de dados igual das variaveis)
				 *  !==(Comparação de conteudo diferente e tipo de dados igual das variaveis)      
				 * 
				 * Obs Apenas no JAVA: Se a comparação for realizada por uma variavel do 
				 * tipo String não será permitido usar ==, deveremos utilizar o metodo equals()
				 * 
				 * */
				/*
				if (operacao.equals("SOMAR") || operacao.equals("+"))
					resultado = valor1 + valor2;
				 else if (operacao.equals("SUBTRAIR") || operacao.equals("-"))
					resultado = valor1 - valor2;
				else if (operacao.equals("MULTIPLICAR") || operacao.equals("*"))
					resultado = valor1 * valor2;
				else if (operacao.equals("DIVIDIR") || operacao.equals("/"))
					resultado = valor1 / valor2;
				else
				{
					System.out.println("Favor digitar uma operação válida");
					erro = true;
				}
				*/
				
				// switch (operacao) {
				// case "SOMAR", "+":
				// 	resultado = valor1 + valor2;
				// 	break;
				// case "SUBTRAIR", "-":
				// 	resultado = valor1 - valor2;
				// 	break;
				// case "MULTIPLICAR", "*":
				// 	resultado = valor1 * valor2;
				// 	break;
				// case "DIVIDIR", "/":
				// 	resultado = valor1 / valor2;
				// 	break;
					
				// default:
				// 	System.out.println("Favor digitar uma operação válida");
				// 	erro = true;
				// 	break;
				// }
				
				if(erro == false)
					System.out.println(resultado);

	}

}