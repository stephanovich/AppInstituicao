package negocio;

public class Documentacao {
	private String cpf;
	private String rg;
	private String titulo;
	private String ctps;
	
	public void show() {
		System.out.println("#Documentação");
		System.out.printf(
						  "Cpf: %s\n"
						+ "RG: %s\n"
						+ "Título: %s\n"
						+ "CTPS: %s\n",
						cpf,
						rg,
						titulo,
						ctps
						 );
	}
	
	

	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTítulo() {
		return titulo;
	}
	public void setTítulo(String título) {
		this.titulo = título;
	}
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	
	
}
