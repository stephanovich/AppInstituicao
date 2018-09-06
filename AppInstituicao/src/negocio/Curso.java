package negocio;

public class Curso {
	private String nome;
	private int cargaHoraria;
	private float valor;

	
	
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
}
