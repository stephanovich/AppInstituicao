package negocio;

public class Graduacao extends Curso {
	
	private boolean indicativoTecnologo;
	private Documentacao documentacao;
	
	public Graduacao(String nome,int cargaHoraria,float valor, boolean indicativoTecnologo) {
		super(nome,cargaHoraria,valor);
		this.indicativoTecnologo = indicativoTecnologo;
	}
	
	public void show() {
		System.out.println("#Graduação");
		super.show();
		System.out.printf("Tecnologo: %s\n",				
				indicativoTecnologo ? "sim" : "nao");
		System.out.println();
		documentacao.show();
	}
	


	public boolean isIndicativoTecnologo() {
		return indicativoTecnologo;
	}

	public void setIndicativoTecnologo(boolean indicativoTecnologo) {
		this.indicativoTecnologo = indicativoTecnologo;
	}

	public Documentacao getDocumentacao() {
		return documentacao;
	}

	public void setDocumentacao(Documentacao documentacao) {
		this.documentacao = documentacao;
	}



	
}

