package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		BinaryOperator<Double> calc = (x, y) -> {return x + y;};

		System.out.println(calc.apply(10.0, 15.0));
		// nessa linha abaixo faz a mesma coisa de codigo acima, pore uma forma mais
		// simples
		calc = (x, y) -> x * y / 100;

		System.out.println(calc.apply(10.0, 1000.0));
	}
}
