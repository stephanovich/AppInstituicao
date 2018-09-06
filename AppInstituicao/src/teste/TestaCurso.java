package teste;

import negocio.Especializacao;
import negocio.Graduacao;

public class TestaCurso {
	public static void main(String[] args) {
		Graduacao g = new Graduacao("Maria",2,1200,false);
		g.show();
		Especializacao e = new Especializacao("joao",3,1500,2015);
		e.show();
		
	}
}
