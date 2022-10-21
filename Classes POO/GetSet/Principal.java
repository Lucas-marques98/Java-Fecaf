import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("José");
		aluno1.setSobreNome("da Silva");
		aluno1.setSexo("M");
		aluno1.setDataNascimento("18/07/1983");
		
		System.out.println(aluno1.getNomeCompleto());		
		System.out.println(aluno1.getSexo());
		System.out.println(aluno1.getDescricaoSexo());
		System.out.println(aluno1.getIdade() + " anos ");
		
		Scanner x = new Scanner(System.in);

	}

}
