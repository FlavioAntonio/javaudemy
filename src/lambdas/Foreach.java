package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovadores = Arrays.asList("Ana", "Bia","Lia","Guia");
		
		System.out.println("Forma tradicional....");
		
		for(String nome: aprovadores) {
			System.out.println(nome);
		}
		
		System.out.println("\n usando lambda 01...");
		aprovadores.forEach(nome -> {System.out.println(nome + "!!!");});
		
		System.out.println("\nLambda #02...");
		aprovadores.forEach(nome -> meuImprimir(nome));
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é: " + nome);
	}

}
