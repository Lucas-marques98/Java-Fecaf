//tenho que adicionar o valor final que o úsuario digitar
import java.util.Scanner;

public class exercicioTabFun {

	public static class Exercicio_Tabuada {
		public static void main(String[] args) {
				String tabuada = null;
				int valor_inicial;
			int valor_final;
			int cont = 0;
			int resultado;
			System.out.println("Olá, bem vindo ao meu sistema de tabuada \n"
					+ "Digite Tabuada para prosseguir! ");
			Scanner leitor = new Scanner(System.in);
			tabuada = leitor.nextLine().toUpperCase();

			if (tabuada.equals("TABUADA")) {
				System.out.println("Favor digitar um valor inicial a ser calculado:");
				valor_inicial = leitor.nextInt();

				if (valor_inicial >= 2 && valor_inicial <= 100) {
					while (cont <= valor_inicial) {
						resultado = valor_inicial * cont;
						System.out.println(valor_inicial + "x" + cont + "=" + resultado);
						cont += 1;
					}
				} else {
					System.out.println("informação inválida! Digite de 2 a 100");
					repeat();
				}

				System.out.println("Favor digitar um valor final a ser calculado:");
				valor_final = leitor.nextInt();

				if (valor_final >= 2 && valor_final <= 100) {
					for (int num1 = 0; num1 <= valor_final; num1++) {
						resultado = valor_final * num1;
						System.out.println(valor_final + "x" + num1 + "=" + resultado);

					}
				} else {
					System.out.println("informação inválida! Digite de 2 a 100");
					repeat();
					;
				}

			} else {
				System.out.println("informação inválida! Digite tabuada.");
				for (int i = 0; i <= 10; i++) {
					repeat();
				}
			}

		}
	}

		public static void repeat() {
			String tabuada = null;
			String erro = null;
			int valor_inicial;
			int valor_final;
			int cont = 0;
			int resultado;
			System.out.println("Olá, bem vindo ao meu sistema de tabuada \n"
					+ "Digite Tabuada para prosseguir! ");
			Scanner leitor = new Scanner(System.in);
			tabuada = leitor.nextLine().toUpperCase();

			if (tabuada.equals("TABUADA")) {
				System.out.println("Favor digitar um valor inicial a ser calculado:");
				valor_inicial = leitor.nextInt();
				erro = leitor.nextLine();

				if (valor_inicial >= 2 && valor_inicial <= 100) {
					while (cont <= valor_inicial) {
						resultado = valor_inicial * cont;
						System.out.println(valor_inicial + "x" + cont + "=" + resultado);
						cont += 1;
					}
				} else {
					System.out.println("informação inválida! Digite de 2 a 100");
					repeat();
				}

				System.out.println("Favor digitar um valor final a ser calculado:");
				valor_final = leitor.nextInt();

				if (valor_final >= 2 && valor_final <= 100) {
					for (int num1 = 0; num1 <= valor_final; num1++) {
						resultado = valor_final * num1;
						System.out.println(valor_final + "x" + num1 + "=" + resultado);

					}
				} else {
					System.out.println("informação inválida! Digite de 2 a 100");
					repeat();
				}

			} else {
				System.out.println("informação inválida! Digite tabuada.");

			}

		}
	}
