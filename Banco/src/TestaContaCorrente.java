import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestaContaCorrente {
	
	ContaCorrente cc;
	@Before
	public void inicializaConta() {
		cc = new ContaCorrente();
		cc.depositar(200);
	}

	@Test
	public void deposito() {		
		assertEquals(cc.getSaldo(), 200);
	}
	
	@Test
	public void sacar() {
		cc.sacar(150);
		
		assertEquals(cc.getSaldo(), 50);
	}
	
	@Test
	public void saqueMaiorQueSaldo() {
		int valorSacado = cc.sacar(201);
		
		assertEquals(cc.getSaldo(), 200);
		assertEquals(valorSacado, 0);
	}

}
