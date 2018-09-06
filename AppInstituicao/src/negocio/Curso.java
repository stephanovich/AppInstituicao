package negocio;

public class Curso {
	private String nome;
	private int cargaHoraria;
	private float valor;
	private Coordenador coordenador;
	
	
	public Curso(String nome, int cargaHoraria, float valor) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}

	public void show() {
		System.out.printf("Nome: %s\nCarga horaria: %d\nValor: %.2f\n",
				nome,
				cargaHoraria,
				valor);	
		coordenador.show();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHorária() {
		return cargaHoraria;
	}

	public void setCargaHorária(int cargaHorária) {
		this.cargaHoraria = cargaHorária;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}
	
}
