import java.time.LocalDate;
import java.util.Calendar;

public class Aluno {
	//Atributos da classe (Sempre para ser acessado, precisa do this)
	private int id;
	private String ra;
	private String nome;
	private String sobreNome;
	private String nomeCompleto;
	private String sexo;
	private String descricaoSexo;
	private String dataNascimento;
	private int idade;
	private String tipoCurso;
	
	//Construtor
	public Aluno(String tipoCurso) {
		if(tipoCurso.toUpperCase().equals("G"))
			this.tipoCurso = "Graduação";
			else if(tipoCurso.toUpperCase().equals("C"))
			this.tipoCurso = "Colégio";
			else if(tipoCurso.toUpperCase().equals("P"))
			this.tipoCurso = "Pós-Graduação";
	}
	
	//Getters e Setters
	
	//Get id
	public int getId() {
		return this.id;
	}
	
	//Get ra
	public String getRa() {
		return this.ra;
	}
	
	//Set ra
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	//Get nome
	public String getNome() {
		return this.nome;
	}
		
	//Set nome
	public void setNome(String nome) {
		//o atributo nome está recebendo a váriavel nome
		this.nome = nome;
	}
	
	//Get sobreNome
	public String getSobreNome() {
		return this.sobreNome;
	}
			
	//Set sobreNome
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
		if (!this.nome.equals(null) && !this.sobreNome.equals(null))
			this.nomeCompleto = this.nome + " " + this.sobreNome;
		else
			System.out.println("Nome ou sobreNome não pode ser vazio!");
	}
	
	//Get nomeCompleto (Junção do nome e do sobreNome)
	public String getNomeCompleto() {
		return this.nomeCompleto;
	}

	//Get sexo
	public String getSexo() {
		return this.sexo;
	}
					
	//Set sexo
	public void setSexo(String sexo) {
		this.sexo = sexo.toUpperCase(); //Padroniza para MAIUSCULO a letra
		if (this.sexo.equals("M"))
			this.descricaoSexo = "Masculino";
		else if (this.sexo.equals("F"))
			this.descricaoSexo = "Feminino";
		else if (this.sexo.equals(" ") || (this.sexo.equals(null)))
			System.out.println("O sexo precisa ser informado corretamente");
	}
	
	//Get descricaoSexo (Esse item será criado no momento de gravar a letra correspondente
	//ao sexo do aluno M/F
	public String getDescricaoSexo() {
		return this.descricaoSexo;
	}
	
	//Get dataNascimento
	public String getDataNascimento() {
		return this.dataNascimento;
	}
							
	//Set dataNascimento
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
		
		//Retorna apenas a parte referente ao ano da data de nascimento do aluno
		int anoNascimento = Integer.parseInt(this.dataNascimento.substring(6,10));
		
		//Retorna a data atual
		LocalDate dataAtual = LocalDate.now();
		
		//Retorna somente o ano da data atual
		int anoAtual = dataAtual.getYear();
		
		//Guarda a idade atualizada do aluno
		this.idade = anoAtual - anoNascimento;
		
		//01/01/2000
	}
		
	//Get idade (Será calculado conforme o ano corrente e a data de nascimento do aluno)
	public int getIdade() {
		return this.idade;	
	}
	//get retorna o do Curso
	public String getTipoCurso() {
		return this.tipoCurso;
	}
	
	//set Guarda o tipo do curso
	//é boa pratica criar os argumentos dos métodos com o mesmo nome dos atributos, mas sempre lembrar que o argumento é local e o atributo é global
	private void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}
		
	//Metodos da classe
	//Retorna o print de todos os dados referente a um aluno
	public void getDadosAlunos() {
	System.out.println("############### Relatório de dados do aluno ##############");
	System.out.println("RA:" + this.getRa());
	System.out.println("NOME:" + this.getNomeCompleto());
	System.out.println("SEXO: [" + this.getSexo() + "]-" + this.getDescricaoSexo());
	System.out.println("DATA DE NASCIMENTO:" + this.getDataNascimento());
	System.out.println("O aluno(a) " + this.getNome() + " tem " + this.getIdade() + " anos.");
	System.out.println("Tipo do curso: " + this.getTipoCurso());
	}
}
