package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	private ReajusteService service;
	private Funcionario funcionario;

	@BeforeEach
	public void inicializar() {
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Arthur", LocalDate.now(), new BigDecimal("5000.00"));
		System.out.println("Abrindo método.");
	}
	
	@AfterEach
	public void finalizar() {
		System.out.println("Fechando método.");
	}
	
	@BeforeAll
	public static void antesDeTudo() {
		System.out.println("Antes de tudo.");
	}
	
	@AfterAll
	public static void depoisDeTudo() {
		System.out.println("No final de tudo.");
	}
	
	
	
	@Test
	public void reajusteDeveriaSerTresPorcentoComDesempenhoADesejar() {
				
		service.concederReajuste(funcionario, Desempenho.A_Desejar);
		
		assertEquals(new BigDecimal("5150.00"), funcionario.getSalario());	
	}
	
	@Test
	public void reajusteDeveriaSerQuinzePorcentoComDesempenhoBom() {
		service = new ReajusteService();
		funcionario = new Funcionario("Arthur", LocalDate.now(), new BigDecimal("5000.00"));
		
		service.concederReajuste(funcionario, Desempenho.Bom);
		
		assertEquals(new BigDecimal("5750.00"), funcionario.getSalario());	
	}
	
	@Test
	public void reajusteDeveriaSerVintePorcentoComDesempenhoBom() {
		service = new ReajusteService();
		funcionario = new Funcionario("Arthur", LocalDate.now(), new BigDecimal("5000.00"));
		
		service.concederReajuste(funcionario, Desempenho.Otimo);
		
		assertEquals(new BigDecimal("6000.00"), funcionario.getSalario());	
	}

}
