
import java.util.Scanner;

public class Salario extends Contrato{

	private double salario_mensal;
	private double salario_anual;
	private double reajuste_anual;
	private int tempo_contratado;
		
	public Salario(double valor_hora, int duracao,double salario_mensal, double salario_anual, double reajuste_anual, int tempo_contratado)
	{
		setValor_hora(valor_hora);
		setDuracao(duracao);
		setSalario_mensal(salario_mensal);
		setSalario_anual(salario_anual);
		setReajuste_anual(reajuste_anual);
		setTempo_contratado(tempo_contratado);		
	}

	public double getSalario_mensal() {
		return salario_mensal;
	}

	public void setSalario_mensal(double salario_mensal) {
		this.salario_mensal = salario_mensal;
	}

	public double getSalario_anual() {
		return salario_anual;
	}

	public void setSalario_anual(double salario_anual) {
		this.salario_anual = salario_anual;
	}

	public double getReajuste_anual() {
		return reajuste_anual;
	}

	public void setReajuste_anual(double reajuste_anual) {
		this.reajuste_anual = reajuste_anual;
	}

	public int getTempo_contratado() {
		return tempo_contratado;
	}

	public void setTempo_contratado(int tempo_contratado) {
		this.tempo_contratado = tempo_contratado;
	}

	@Override
	public double empresa_contrato() {
		return = (this.getValor_hora()*this.getDuracao());
	}
	
	public double salario_mensal_calculado() {
		return = ((this.getValor_hora()*this.getDuracao())*22);

	}
	
	public double salario_anual_calculado() {
		return = (((this.getValor_hora()*this.getDuracao())*22)*12);	
	}
	
	public double reajuste_anual_calculado() {
		return = (((((this.getValor_hora()*this.getDuracao())*22)*12)*0.05) + (((this.getValor_hora()*this.getDuracao())*22)*12));	
	}
	
	@Override
	public String toString() {
		return "\nSalario [salario_mensal=R$ " + salario_mensal + ", salario_anual=R$ " + salario_anual + ", reajuste_anual=R$ "
				+ reajuste_anual + ", tempo_contratado=" + tempo_contratado + " anos" + ", getValor_hora=R$ " + getValor_hora() + ", getDuracao()=" + getDuracao()
				+ " horas" + ", empresa_contrato()=R$ " + (this.getValor_hora()*this.getDuracao()) + " por dia" + ", salario_mensal_calculado()=R$ " 
				+ ((this.getValor_hora()*this.getDuracao())*22) + ", salario_anual_calculado()=R$ " + (((this.getValor_hora()*this.getDuracao())*22)*12) 
				+ ", reajuste_anual_calculado()=R$ " + (((((this.getValor_hora()*this.getDuracao())*22)*12)*0.05) + (((this.getValor_hora()*this.getDuracao())*22)*12)) 
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}
	
	public String getDado() {
		return this.toString();		
	}	
}
