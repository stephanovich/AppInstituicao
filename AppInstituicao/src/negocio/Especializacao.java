package negocio;

public class Especializacao extends Curso {
	private int anoTerminoGraduação;
	
	public Especializacao(String nome, int cargaHoraria,float valor,int anoTerminoGraducao) {
		super(nome,cargaHoraria,valor);
		this.anoTerminoGraduação = anoTerminoGraducao;
	}
	
	
	public void show() {
		System.out.println("#Especialização");
		super.show();	
		System.out.printf("Termino da graduação: %d\n",
				anoTerminoGraduação);
		System.out.println();
		
	}
		
	

	public int getAnoTerminoGraduação() {
		return anoTerminoGraduação;
	}

	public void setAnoTerminoGraduação(int anoTerminoGraduação) {
		this.anoTerminoGraduação = anoTerminoGraduação;
	}

	


}
