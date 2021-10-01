import java.util.ArrayList;

public class TesteEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario F1=new Funcionario("Arthur", 23, "CLT", "Análise e Desenvolvimento de Sistemas", "Alimentação e Plano de Saúde");
		System.out.println(F1.getInformacao());
		
		Salario S1=new Salario(14.21, 8, 2500.96, 30011.52, 31512.096, 2);
		System.out.println(S1.getDado());
		
		Atividade A1=new Atividade("Amazon", "CLT", 8, 2, "Alta", "Desenvolver o Front-end");
		System.out.println(A1.getResultado());
		
		Funcionario F2=new Funcionario("Carol", 30, "CLT", "Recursos Humanos", "Alimentação e Plano de Saúde");
		System.out.println(F2.getInformacao());
		
		Salario S2=new Salario(8.527, 8, 1500.75, 18009.00, 18909.45, 3);
		System.out.println(S2.getDado());
		
		Atividade A2=new Atividade("Amazon", "CLT", 8, 2, "Média", "Atendimento ao cliente");
		System.out.println(A2.getResultado());
		
		Funcionario F3=new Funcionario("Miranda", 25, "CLT", "Administração", "Alimentação e Plano de Saúde");
		System.out.println(F3.getInformacao());
		
		Salario S3=new Salario(9.66, 8, 1700.16, 20401.92, 21422.016, 1);
		System.out.println(S3.getDado());
		
		Atividade A3=new Atividade("Amazon", "CLT", 8, 1, "Média", "Gestão | Financeiro");
		System.out.println(A3.getResultado());
		
		Funcionario F4=new Funcionario("Ryan", 27, "CLT", "Ciência da Computação", "Alimentação e Plano de Saúde");
		System.out.println(F4.getInformacao());
		
		Salario S4=new Salario(15.341, 8, 2700.016, 32400.19, 34020.20, 4);
		System.out.println(S4.getDado());
		
		Atividade A4=new Atividade("Amazon", "CLT", 8, 2, "Alta", "Desenvolver o Back-end");
		System.out.println(A4.getResultado());
		
		System.out.println("\n");
		
		Coordenador coord=new Coordenador("André", 35, "MEI", "Engenharia da Computação", 7, "Engenheiro de Software");
		System.out.println(coord.getDados());
	
		Salario Scoord=new Salario(19.89 , 8, 3500.64, 42007.68, 44108.064, 5);
		System.out.println(Scoord.getDado());
		
		Atividade Acoord=new Atividade("Amazon", "MEI", 8, 1, "Alta+", "Liderança | Responsabilidade pela equipe");
		System.out.println(Acoord.getResultado());
		
		System.out.println("\n");
		
		ArrayList<Funcionario> Lista_Funcionario =new ArrayList<Funcionario>();
		Lista_Funcionario.add(F1);
		Lista_Funcionario.add(F2);
		Lista_Funcionario.add(F3);
		Lista_Funcionario.add(F4);
		
		Setor ST=new Setor("Desenvolvimento de Sistemas", "Dev. Front-end, Dev. Back-end, Gerente de Projetos, Suporte ao cliente, Full Stack", "Significativo", Lista_Funcionario, coord);
	
		System.out.println(ST.getInfo());
	}
	
}
