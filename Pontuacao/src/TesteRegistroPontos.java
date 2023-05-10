import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroPontos {

	@Test
	void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Khaled";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		
		assertEquals(5, u.pontos);
	}

	@Test
	void pontosCriarTopicoVip() {
		Usuario u = new Usuario();
		u.nome = "Khaled";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		
		assertEquals(25, u.pontos);
	}
	
	@Test
	void pontosCriarTopicoBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Khaled";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		
		assertEquals(15, u.pontos);
	}
	
	@Test
	void pontosCriarTopicoVipBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Khaled";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		
		assertEquals(50, u.pontos);
	}
}
