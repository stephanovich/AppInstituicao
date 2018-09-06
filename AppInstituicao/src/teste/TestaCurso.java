package teste;

import negocio.Contato;
import negocio.Coordenador;
import negocio.Documentacao;
import negocio.Especializacao;
import negocio.Graduacao;

public class TestaCurso {
	public static void main(String[] args) {
		Contato contCoordenador = new Contato();
		contCoordenador.setCelular("27987654321");
		contCoordenador.setEmail("acbdefg@jklmno.com");
		contCoordenador.setEndereco("Rua xyz, 300, niteroi - RJ");
		
		Documentacao docCoordenador = new Documentacao();
		docCoordenador.setCpf("2612614615361");
		docCoordenador.setRg("516865168518");
		docCoordenador.setTítulo("16889189");
		docCoordenador.setCtps("514681681681");
		
		Coordenador c = new Coordenador();
		c.setNome("Mario");
		c.setContato(contCoordenador);
		c.setDocumentacao(docCoordenador);
		
		Documentacao docGraduacao = new Documentacao();
		docGraduacao.setCpf("2612614615361");
		docGraduacao.setRg("516865168518");
		docGraduacao.setTítulo("16889189");
		docGraduacao.setCtps("514681681681");
				
		Graduacao g = new Graduacao("Graduação",2,1200,false);
		g.setDocumentacao(docGraduacao);
		g.setCoordenador(c);
		g.show();
						
		
		Especializacao e = new Especializacao("Especialização",3,1500,2015);
		e.setCoordenador(c);
		e.show();
		
		
		
	}
}
