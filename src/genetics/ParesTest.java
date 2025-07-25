package genetics;

public class ParesTest {

	public static void main(String[] args) {
		Pares<Integer, String> resultadodoConcurso = new Pares<>();
		resultadodoConcurso.adicionar(1, "Maria");
		resultadodoConcurso.adicionar(2, "Pedro");
		resultadodoConcurso.adicionar(3, "Gui");
		resultadodoConcurso.adicionar(4, "Ana");
		resultadodoConcurso.adicionar(2, "Rebeca");
		
		System.out.println(resultadodoConcurso.getValor(1));
		System.out.println(resultadodoConcurso.getValor(4));
		System.out.println(resultadodoConcurso.getValor(2));

	}

}
