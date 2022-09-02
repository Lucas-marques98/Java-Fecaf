import java.util.Scanner;


public class AulaFunction {

	public static void main(String[] args) {
		
		try {
			//Codigo 

		
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
				resultado = calculoMatematico (valor1, valor2, operacao);
				System.out.println(resultado);
				
				
		} //Fechamento do try
		
		catch (Exception e) {
			System.out.println("O calculo não foi realizado com sucesso, devido a alguma valor incorreto!");
		}

	}

	//Função para realizar o calculo matematico
	    //public - significa que a função ou metodo será publica
		//dentro do projeto, ou seja, qualquer parte do projeto poderá 
		//utilizar
	
		//void - significa que a função ou metodo não RETORNARÁ 
		//nenhum valor
	
		//Toda função ou metodo que retorna algum valor, precisa
		//ser especificado no momento da assinatura (criação) da função
	public static double calculoMatematico(double numero1, double numero2, String tipoCalculo ) {
		//Declaração de variaveis no escopo local da function, que 
		//recebe os dados encaminhados nos argumentos da function
		double valor1 = numero1;
		double valor2 = numero2;
		double resultado = 0;
		String operacao = tipoCalculo;
		boolean erro = false;
		
		switch (operacao) {
		case "SOMAR", "+":
			resultado = valor1 + valor2;
			break;
		case "SUBTRAIR", "-":
			resultado = valor1 - valor2;
			break;
		case "MULTIPLICAR", "*":
			resultado = valor1 * valor2;
			break;
		case "DIVIDIR", "/":
			resultado = valor1 / valor2;
			break;
			
		default:
			System.out.println("Favor digitar uma operação válida");
			erro = true;
			break;
		}
		//Se acontecer algum erro dentro da função ela irá retornar
		//null, porém o null não é um tipo de dados compativel com o double,
		//portanto realizamos um processo de conversão de null para que o 
		//double possa aceitar *** (Double)
		if (erro)
			return (Double) null;
		else
			return resultado;
	}
	

}