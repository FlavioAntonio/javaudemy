package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		Calculo calc = (x, y) -> {
			return x + y;
		};

		System.out.println(calc.executar(10, 15));
		// nessa linha abaixo faz a mesma coisa de codigo acima, pore uma forma mais
		// simples
		calc = (x, y) -> x * y/100;
		
		System.out.println(calc.executar(10, 1000));
	}
}
