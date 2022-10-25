import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escolha o curso [G] | [C] | [P]");
		
		Aluno aluno1 = new Aluno(leitor.next());
		System.out.println("Olá, por favor digite o RA: ");
		aluno1.setRa(leitor.next());
		System.out.println("Por favor digite seu nome:");
		aluno1.setNome(leitor.next());
		//para resolver o bug do nextLine, deve instanciar um novo objeto Scanner.
		leitor = new Scanner(System.in);
		System.out.println("Por favor digite seu sobrenome:");
		aluno1.setSobreNome(leitor.nextLine());
		System.out.println("Por favor digite seu sexo [M] | [F]");
		aluno1.setSexo(leitor.next());
		System.out.println("Por favor digite a data de nascimento:");
		aluno1.setDataNascimento(leitor.next());
		
		
		System.out.println(aluno1.getNomeCompleto());		
		System.out.println(aluno1.getSexo());
		System.out.println(aluno1.getDescricaoSexo());
		System.out.println(aluno1.getIdade() + " anos ");
		
		aluno1.getDadosAlunos();
	}

}


