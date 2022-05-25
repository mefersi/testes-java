package test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.ContaCorrente;
import model.ValorInvalidoException;

public class ContaCorrenteTest {

	@Test
	public void saqueValorMaiorQueLimiteDeSaque() {
		ContaCorrente c1 = new ContaCorrente(0111, 111);
		c1.deposita(1000);
		c1.setLimiteSaque(500);

		assertThrows(ValorInvalidoException.class, () -> c1.saca(600));
	}

	@Test
	public void saqueValorMenorIgualZero() {
		ContaCorrente c1 = new ContaCorrente(0111, 111);
		c1.deposita(1000);
		c1.setLimiteSaque(500);

		assertThrows(ValorInvalidoException.class, () -> c1.saca(0));
	}

	@Test
	public void saqueValorValido() {
		ContaCorrente c1 = new ContaCorrente(0111, 111);
		c1.deposita(1000);
		c1.setLimiteSaque(500);

		assertEquals("Saque efetuado com sucesso!", c1.saca(300));
	}

	@Test
	public void depositaValorMenorIgualZero() {
		ContaCorrente c1 = new ContaCorrente(0111, 111);
		c1.deposita(1000);
		c1.setLimiteSaque(500);

		assertThrows(ValorInvalidoException.class, () -> c1.deposita(0));
	}
}
