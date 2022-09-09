import java.util.Scanner;

public class Exercicio_Tabuada {
	public static void main(String[] args) {
		String tabuada = null;

		System.out.println("Olá, bem vindo ao meu sistema de tabuada \n"
				+ "Digite Tabuada para prosseguir! ");
		Scanner leitor = new Scanner(System.in);
		tabuada = leitor.nextLine().toUpperCase();

		if (tabuada.equals("TABUADA")) {
			entradaDados();
			entradaDados2();

		} else {
			System.out.println("informação inválida! Digite tabuada.");
		}

	}

	public static int entradaDados() {
		int valor_inicial;

		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Favor digitar um valor inicial a ser calculado:");
		valor_inicial = entradaDados.nextInt();

		return valor_inicial;
	}

	public static int entradaDados2() {
		int valor_final;

		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Favor digitar um valor final a ser calculado:");
		valor_final = entradaDados.nextInt();

		return valor_final;
	}

	public static boolean calcularTabuada(int numero) {
		int cont = 0;
		int resultado;
		int valor_inicial = numero;
		boolean erro = false;

		if (valor_inicial >= 2 || valor_inicial <= 100) {
			while (cont <= 10) {
				resultado = valor_inicial * cont;
				System.out.println(valor_inicial + "x" + cont + "=" + resultado);
				cont += 1;
			}
		} else {
			erro = true;
		}

		if (erro)
			return false;
		else
			return true;
	}

	public static boolean calcularTabuada2(int numero2) {
		int cont = 2;
		int cont2 = 100;
		int resultado;
		int valor_final = numero2;
		boolean erro2 = false;

		if (valor_final <= 10 || cont <= cont2) {
			for (int num1 = 0; num1 <= numero2; num1++) {
				resultado = valor_final * num1;
				System.out.println(valor_final + "x" + num1 + "=" + resultado);

			}
		} else {
			erro2 = true;
		}

		if (erro2)
			return false;
		else
			return true;
	}
}