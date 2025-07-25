package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
	//	List<String> aprovados = Arrays.asList("Lu", "gui", "Luca", "Ana");
		List<String> compras = Arrays.asList("Feijão","Macarrão","Leite","Farinha","Sabonete");
		
		/*
		for (int i=0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
				
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n Usando Iterator.....");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n usando Stream....");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // laço interno
		*/
		
		Stream<String> stream2 = compras.stream();
		stream2.forEach(System.out::println);
	}

}
