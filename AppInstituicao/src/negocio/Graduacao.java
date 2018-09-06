package negocio;

public class Graduacao extends Curso {
	
	private boolean indicativoTecnologo;
	
	public Graduacao(String nome,int cargaHoraria,float valor, boolean indicativoTecnologo) {
		super(nome,cargaHoraria,valor);
		this.indicativoTecnologo = indicativoTecnologo;
	}
	
	public void show() {
		super.show();
		System.out.printf("Tecnologo: %s\n",				
				indicativoTecnologo ? "sim" : "nao");
	}
	


	public boolean isIndicativoTecnologo() {
		return indicativoTecnologo;
	}

	public void setIndicativoTecnologo(boolean indicativoTecnologo) {
		this.indicativoTecnologo = indicativoTecnologo;
	}


	
}

