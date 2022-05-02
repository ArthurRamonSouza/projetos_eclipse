package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	A_Desejar {
		@Override
		public BigDecimal porcentagem() {
			return (new BigDecimal(0.03));
		}
	}, Bom {
		@Override
		public BigDecimal porcentagem() {
			return (new BigDecimal(0.15));
		}
	}, Otimo {
		@Override
		public BigDecimal porcentagem() {
			return (new BigDecimal(0.2));
		}
	};

	public abstract BigDecimal porcentagem();
	
}
