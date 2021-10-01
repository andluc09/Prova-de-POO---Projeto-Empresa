
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Contrato{

	private String nome;
	private int idade;
	private String formacao_academica;
	private String beneficios;
	private ArrayList<Contrato> Lista_Contrato;
	
	public Funcionario(String nome, int idade, String regime_trabalhista, String formacao_academica, String beneficios) 
	{
		this.Lista_Contrato = new ArrayList<Contrato>();
		setNome(nome);
		setIdade(idade);
		setRegime_trabalhista(regime_trabalhista);
		setFormacao_academica(formacao_academica);
		setBeneficios(beneficios);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFormacao_academica() {
		return formacao_academica;
	}

	public void setFormacao_academica(String formacao_academica) {
		this.formacao_academica = formacao_academica;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	
	public ArrayList<Contrato> Lista_Contrato() {
		return Lista_Contrato;
	}
	public void setLista_Contrato(ArrayList<Contrato> lista_Contrato) {
		Lista_Contrato = lista_Contrato;
	}
	
	@Override
	public String toString() {
		return "\nFuncionario [nome=" + nome + ", idade=" + idade + " anos" + ",  getRegime_trabalhista()=" + getRegime_trabalhista() 
				+ ", formacao_academica=" + formacao_academica + ", beneficios=" + beneficios + "]";
	}

	public String getInformacao() {
		return this.toString();		
	}	
}
