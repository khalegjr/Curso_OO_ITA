
public class Principal {

	public static void main(String[] args) {
		Aluno khaled = new Aluno();
		
		khaled.bim1 = 70;
		khaled.bim2 = 60;
		khaled.bim3 = 80;
		khaled.bim4 = 70;

		System.out.println(khaled.media());
		System.out.println(khaled.passouDeAno());
	}

}
