package feature;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementosweb.ElementosWeb;
import metodos.MetodosSite;

public class FeatureAction {
	
	MetodosSite metodos = new MetodosSite();
	ElementosWeb elementos = new ElementosWeb();
	ElementosWeb elementos1 = new ElementosWeb();
	ElementosWeb elementos2 = new ElementosWeb();
	MetodosSite metodos1 = new MetodosSite();

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("CHROME", "https://www.amazon.com.br");
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		metodos.preencher(elementos.pesquisar, "Iphone");
		metodos.clicar(elementos.lupaPesquisa);
		metodos.premer(elementos1.elementoImagem);
		metodos.buscar(elementos2.elementoBuscar);
		metodos1.validar(elementos.textoValidado, "Apple iPhone 13 Pro (128 GB) - Azul Sierra");
		
	}

}
