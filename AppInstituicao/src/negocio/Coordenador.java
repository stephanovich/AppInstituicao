package negocio;

public class Coordenador {
	private String nome;
	private Contato contato;
	private Documentacao documentacao;
		
	public void show() {
		System.out.println("#Coordenador");
		System.out.printf("Nome: %s\n", nome);							   
		contato.show();
		documentacao.show();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
public Documentacao getDocumentacao() {
		return documentacao;
	}

	public void setDocumentacao(Documentacao documentacao) {
		this.documentacao = documentacao;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
