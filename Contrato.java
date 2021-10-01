
import java.util.Scanner;

public abstract class Contrato implements Empresa{

	private String empresa;
	private double valor_hora;
	private int duracao;
	private String regime_trabalhista;
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public double getValor_hora() {
		return valor_hora;
	}
	public void setValor_hora(double valor_hora) {
		this.valor_hora = valor_hora;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getRegime_trabalhista() {
		return regime_trabalhista;
	}
	public void setRegime_trabalhista(String regime_trabalhista) {
		this.regime_trabalhista = regime_trabalhista;
	}
	
	@Override
	public String toString() {
		return "Contrato [empresa=" + empresa + ", valor_hora=R$ " + valor_hora + ", duracao=" + duracao
				+ " horas" + ", regime_trabalhista=" + regime_trabalhista + "]";
	}
	
}
