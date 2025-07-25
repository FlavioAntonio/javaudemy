package lambdas;

import java.util.Arrays;
import java.util.List;

public class CaulculoTeste4 {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Banana", "Abacaxi", "Limão", "Melão");
		
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		aprovados.forEach(nome -> System.out.println(nome + "****"));
		aprovados.forEach(nome -> {System.out.println(nome + "#####");});
		aprovados.forEach(nome -> {System.out.println(nome + "-----");});
		aprovados.forEach(nome -> System.out.println(nome + "________"));
	}

}

