
import java.util.Scanner;
import java.util.ArrayList;

public class Setor {

	private String funcao;
	private String cargos;
	private String impacto;
	private ArrayList<Funcionario> Lista_Funcionario;
	private Coordenador coord;
	
	public Setor(String funcao, String cargos, String impacto, ArrayList<Funcionario> lista_Funcionario, Coordenador coord)
	{
		setFuncao(funcao);
		setCargos(cargos);
		setImpacto(impacto);
		setLista_Funcionario(lista_Funcionario);
		setCoord(coord);
	}
	

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getCargos() {
		return cargos;
	}

	public void setCargos(String cargos) {
		this.cargos = cargos;
	}

	public String getImpacto() {
		return impacto;
	}

	public void setImpacto(String impacto) {
		this.impacto = impacto;
	}

	public ArrayList<Funcionario> getLista_Funcionario() {
		return Lista_Funcionario;
	}

	public void setLista_Funcionario(ArrayList<Funcionario> lista_Funcionario) {
		this.Lista_Funcionario = lista_Funcionario;
	}

	public Coordenador getCoord() {
		return coord;
	}

	public void setCoord(Coordenador coord) {
		this.coord = coord;
	}
	
	@Override
	public String toString() {
		return "\nSetor [funcao=" + funcao + ", cargos=" + cargos + ", impacto=" + impacto + ", \nLista_Funcionario="
				+ Lista_Funcionario + ", coord=" + coord + "]";
	}
	
	public String getInfo() {
		return this.toString();		
	}
}
