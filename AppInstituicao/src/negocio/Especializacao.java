package negocio;

public class Especializacao extends Curso {
	private int anoTerminoGraduação;
	
	public Especializacao(String nome, int cargaHoraria,float valor,int anoTerminoGraducao) {
		super(nome,cargaHoraria,valor);
		this.anoTerminoGraduação = anoTerminoGraducao;
	}
	
	public void show() {
		System.out.println();
		super.show();	
		System.out.printf("Termino da graduação: %d",
				anoTerminoGraduação);
		
	}
		
	

	public int getAnoTerminoGraduação() {
		return anoTerminoGraduação;
	}

	public void setAnoTerminoGraduação(int anoTerminoGraduação) {
		this.anoTerminoGraduação = anoTerminoGraduação;
	}


}
