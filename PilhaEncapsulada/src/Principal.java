
public class Principal {
	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		p.empilhar("Eduardo");
		p.empilhar("Maria");
		p.empilhar("José");
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		Object[] arrayElementos = p.getElementos();
		System.out.println("arrayElementos: " + arrayElementos.length);
		arrayElementos[1] = "Outro";
		
		// Desempilhando
		System.out.println("----------");
		System.out.println(p.desempilhar().toString().toUpperCase());
		System.out.println(p.topo().toString().toUpperCase());
		System.out.println(p.tamanho());
	}
}
