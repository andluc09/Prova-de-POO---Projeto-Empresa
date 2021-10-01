
import java.util.Scanner;

public class Atividade extends Contrato{

	private String relevancia, descricao;
	private int quantidade_funcionarios;
	
	public Atividade(String empresa, String regime_trabalhista,int duracao,int quantidade_funcionarios, String relevancia, String descricao) 
	{
		setEmpresa(empresa);
		setRegime_trabalhista(regime_trabalhista);
		setDuracao(duracao);
		setQuantidade_funcionarios(quantidade_funcionarios);
		setRelevancia(relevancia);
		setDescricao(descricao);
	}
	
	public String getQuantidade_funcionarios() {
		return quantidade_funcionarios;
	}

	public void setQuantidade_funcionarios(int quantidade_funcionarios) {
		this.quantidade_funcionarios = quantidade_funcionarios;
	}

	public String getRelevancia() {
		return relevancia;
	}

	public void setRelevancia(String relevancia) {
		this.relevancia = relevancia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "\nAtividade [quantidade_funcionarios=" + quantidade_funcionarios + " funcionários" + ", relevancia=" + relevancia
				+ ", descricao=" + descricao + ", getEmpresa()=" + getEmpresa() + ", getRegime_trabalhista()=" + getRegime_trabalhista() + ", getDuracao()=" + getDuracao() + " horas" + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + "]";
	}
	
	@Override
	public float empresa_contratada() {
		return 
		System.out.println("\nEmpresa: " + this.getEmpresa());
		System.out.println("\nRegime Trabalhista: " + this.getRegime_trabalhista());
		System.out.println("\nHoras trabalhadas: " + this.getDuracao());
	}	
	public String getResultado() {
		return this.toString();		
	}		
}
