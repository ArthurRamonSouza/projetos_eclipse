package listaDuplamenteLigada;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {
	
	DoublyLinkedList<String> lista = new DoublyLinkedList<>();
	
	@BeforeEach 
	void setUp() {
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.add("4");
		System.out.println("setup");
	}
	
	@AfterEach
	void tierDown() {
		lista.clear();
		System.out.println("tierDown");
	}
	
	/**
	 * descricao do metodo
	 * parametros
	 * retornos
	 * exceptions
	 */
	@Test
	void pegaUltimoElementosDaLista() {
		Node<String> node = lista.getUltimoElemento();
		String resultado = node.value;
		assertEquals("4", resultado);
	}

	@Test
	void pegaElementoApartirDoIndexIndicadoMenos0() {
		Node<String> node = lista.getElementoIndex(2);
		String resultado = node.value;
		
		assertEquals("3", resultado);
	}
	
	@Test
	void pegaUltimoElementoApartirDoIndexIndicado() {
		Node<String> node = lista.getElementoIndex(3);
		String resultado = node.value;
		
		assertEquals("4", resultado);
	}
	
	@Test
	void pegElementoMaiorDoQueOIndexPossivel() {
		
		assertThrows(ParametroInvalidoException.class, () -> lista.getElementoIndex(4));
	}
	
	@Test
	void pegElementoMenorDoQueOIndexPossivel() {
		
		assertThrows(ParametroInvalidoException.class, () -> lista.getElementoIndex(-1));

	}
	@Test
	void removeElementoInexistentePeloValor() {
		try {
			lista.remove("5");
			fail();
		} catch (Exception e) {
			assertEquals(ParametroInvalidoException.MESSAGE, e.getMessage());
		}
		
	}
	
}
