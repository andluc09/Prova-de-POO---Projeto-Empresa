
import java.util.Scanner;

public class Coordenador extends Contrato{
	
	private String nome;
	private int idade;
	private String formacao_academica;
	private int numero_subordinados;
	private String experiencia_anterior;
	
	public Coordenador(String nome, int idade, String regime_trabalhista, String formacao_academica, int numero_subordinados, String experiencia_anterior)
	{
		setNome(nome);
		setIdade(idade);
		setRegime_trabalhista(regime_trabalhista);
		setFormacao_academica(formacao_academica);
		setNumero_subordinados(numero_subordinados);
		setExperiencia_anterior(experiencia_anterior);
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

	public int getNumero_subordinados() {
		return numero_subordinados;
	}

	public void setNumero_subordinados(int numero_subordinados) {
		this.numero_subordinados = numero_subordinados;
	}

	public String getExperiencia_anterior() {
		return experiencia_anterior;
	}

	public void setExperiencia_anterior(String experiencia_anterior) {
		this.experiencia_anterior = experiencia_anterior;
	}
	
	@Override
	public String toString() {
		return "\nCoordenador [nome=" + nome + ", idade=" + idade + " anos" + ", getRegime_trabalhista()=" + getRegime_trabalhista() 
				+ ", formacao_academica=" + formacao_academica + ", numero_subordinados=" + numero_subordinados
				+ " funcionários" + ", experiencia_anterior=" + experiencia_anterior + "]";
	}
	
	public String getDados() {
		return this.toString();		
	}
}
