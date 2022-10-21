import java.time.LocalDate;
import java.util.Calendar;

public class Aluno {
	//Atributos da classe 
	private int id;
	private String ra;
	private String nome;
	private String sobreNome;
	private String nomeCompleto;
	private String sexo;
	private String descricaoSexo;
	private String dataNascimento;
	private int idade;
	
	
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
	
		
	//Metodos da classe
	
}
