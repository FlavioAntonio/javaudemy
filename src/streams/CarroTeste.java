package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c1 = new Carro("Celta", "Branco", 8000);
		Carro c2 = new Carro("Fox", "Branco", 6000);
		Carro c3 = new Carro("Prisma", "Vermelho", 70000);
		Carro c4 = new Carro("Pajero", "Branco", 3000);
		Carro c5 = new Carro("Hilux", "Branco", 3000);
		Carro c6 = new Carro("L200", "Branco", 3000);
		Carro c7 = new Carro("Ford Ka", "Verde", 70000);
		Carro c8 = new Carro("Cobolt", "Branco", 9000);
		Carro c9 = new Carro("Fiorino", "Prata", 3000);
		Carro c10 = new Carro("Camaro", "Azul", 90000);
		Carro c11 = new Carro("Lamborguine", "Branco", 300000);
		Carro c12 = new Carro("ferrary", "Branco", 30000);
		Carro c13 = new Carro("Opala", "Branco", 90000);
		Carro c14 = new Carro("Chevete", "Branco", 3000);

		List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14);
		Predicate<Carro> popular = a -> a.valor <= 6000;
		Predicate<Carro> classeMedia = a -> a.valor > 6000 && a.valor <= 70000;
		Predicate<Carro> carroLuxo = a -> a.valor >= 90000;
		
		Function<Carro, String> mensagem = a -> "O Carro " + a.marca + " é um carro popular";
		Function<Carro, String> menssageClaseMedia = a -> "O Carro " + a.marca + " é um carro de Classe media";
		Function<Carro, String> menssageLuxo = a -> "O Carro " + a.marca + " é um carro de de luxo";

		carros.stream().filter(popular).map(mensagem).forEach(System.out::println);
		carros.stream().filter(classeMedia).map(menssageClaseMedia).forEach(System.out::println);
		carros.stream().filter(carroLuxo).map(menssageLuxo).forEach(System.out::println);
	}

}
