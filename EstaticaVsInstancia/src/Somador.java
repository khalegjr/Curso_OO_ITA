
public class Somador {
	String nome;
	int valorInstancia = 0;
	static int valorEstatica = 0;
	
	public void soma() {
		valorInstancia++;
		valorEstatica++;
	}
	
	public void imprimir() {
		System.out.println("O somador " + nome + ": intância = " + valorInstancia + " e estatica = " + valorEstatica);
	}
}
