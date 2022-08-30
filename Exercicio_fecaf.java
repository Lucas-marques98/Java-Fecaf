

import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio_fecaf {

	public static void main(String[] args) {
		
		// declaração de váriaveis
		String name_aluno = null;
		String aluno = null;
		String professor = null;
		String sexo_professor = null;
		String name_curso = null;
		String name_disciplina = null;
		String aluno_aprovado = null;
		boolean aprovado = false;
		float nota1, nota2, nota3, nota4, nota_exame = 0;
		double media;
		double media_exame;
		
		// instanciando as classes Scanner e DecimalFormat
		Scanner leitor = new Scanner(System.in);
		DecimalFormat numFormat = new DecimalFormat("#.0");
		
		//informando ao usuário o que deve fazer
		System.out.println("Por favor, digite o nome do aluno:");
		name_aluno = leitor.nextLine();
		
		System.out.println("Por favor, digite o sexo do aluno [ 'Masculino' ou 'Feminino' ]:");
		aluno = leitor.nextLine().toUpperCase();
		
		System.out.println("Por favor, digite o nome do professor:");
		professor = leitor.nextLine();
		
		System.out.println("Por favor, digite o sexo do professor:");
		sexo_professor = leitor.nextLine().toUpperCase();
		
		System.out.println("Por favor, digite o nome do curso:");
		name_curso = leitor.nextLine();
		
		System.out.println("Por favor, digite o nome da disciplina:");
		name_disciplina = leitor.nextLine();
		
		System.out.println("Por favor, digite a primeira nota do aluno:");
		nota1 = leitor.nextFloat();
		
		// condição para o usuário digitar uma nota de 0 a 100
		if(nota1 < 0 || nota1 > 100) {
			System.out.println("Digite uma nota entre 0 e 100");
			return;
		}
		
		System.out.println("Por favor, digite a segunda nota do aluno:");
		nota2 = leitor.nextFloat();
		if(nota_exame < 60) {
			aprovado = false;
		}
		// condição para o usuário digitar uma nota de 0 a 100
		if(nota2 < 0 || nota2 > 100) {
			System.out.println("Digite uma nota entre 0 a 100");
			return;
		}
		
		System.out.println("Por favor, digite a terceira nota do aluno:");
		nota3 = leitor.nextFloat();
		
		// condição para o usuário digitar uma nota de 0 a 100
		if(nota3 < 0 || nota3 > 100) {
			System.out.println("Digite uma nota entre 0 e 100");
			return;
		}
		
		System.out.println("Por favor, digite a quarta nota do aluno:");
		nota4 = leitor.nextFloat();
		
		// condição para o usuário digitar uma nota de 0 a 100
		if(nota4 < 0 || nota4 > 100) {
			System.out.println("Digite uma nota entre 0 e 100");
			return;
		}
	
		//Calculando a média das notas digitada e dividindo pela quantidade de notas
		media = nota1 + nota2 + nota3 + nota4 / 4;
		System.out.println("A sua nota é: " + numFormat.format(media));
		
		if(media >= 70) {
			aprovado = true;
		} else if (media >= 50 && media <= 69) {
			System.out.println("Por favor, digite a nota do exame:");
			nota_exame = leitor.nextFloat();
			
			if(nota_exame < 0 || nota_exame > 100) {
				System.out.println("Digite uma nota entre 0 e 100");
				return;
			}
			
			
			media_exame = nota1 + nota2 + nota3 + nota4 + nota_exame / 5;
			System.out.println("A sua nota é: " + numFormat.format(media_exame));
			
			if(nota_exame < 60 || media_exame < 60) {
				aprovado = false;
			}
				
		}else {
			aprovado = false;
		}
		
		
		if(aprovado) {
			if(aluno.equals("Feminino")) 
				aluno_aprovado = "Aprovada";
			else {
				aluno_aprovado = "Aprovado";
			}
		}else {
			if(aluno.equals("Masculino")) 
				aluno_aprovado = "Reprovada";
			else {
				aluno_aprovado = "Reprovado";
			}
		}
		
		if(aluno.equals("F")) 
			System.out.println("A aluna " + name_aluno + " foi " + aluno_aprovado + " na disciplina");
		 else 
			System.out.println("O aluno "+ name_aluno + " foi " + aluno_aprovado + " na disciplina");	
		

		
		System.out.println("Curso: " + name_curso);
		
		if(sexo_professor.equals("F")) 
			System.out.println("Professora: " + professor);
		 else 
			System.out.println("Professor: " + professor);
		
		
		if(aluno.equals("F")) 
			System.out.println("Notas da aluna: " + nota1 + " " + nota2  + " " + nota3  + " " + nota4 + " " + nota_exame);
		else 
			System.out.println("Notas do aluno: " + nota1 + " " + nota2  + " " + nota3  + " " + nota4 + " " + nota_exame);
		
	
		System.out.println("Média final: " + media);
		System.out.println("Média final do exame: " + media_exame);
	}

}
