package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProdutosTeste {

	public static void main(String[] args) {
		Produtos p1 = new Produtos("Camisa", 50, 0, 5);
		Produtos p2 = new Produtos("Pendrive", 110, 0, 0);
		Produtos p3 = new Produtos("Carrinho", 40, 5, 20);
		Produtos p4 = new Produtos("Calça dins", 60, 0, 2);
		Produtos p5 = new Produtos("Camisa leg", 70, 0, 10);
		Produtos p6 = new Produtos("Chapeu", 55, 0, 10);
		Produtos p7 = new Produtos("Maquina de lavar", 500, 1, 15);
		Produtos p8 = new Produtos("Air fryer", 250, 0, 5);
		Produtos p9 = new Produtos("Fio", 120, 0, 5);

		List<Produtos> produsopromo = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);
		Predicate<Produtos> freteGratuito = a -> a.frete == 0;
		
		Predicate<Produtos> promo = a -> a.desconto >= 12;
		
		Function<Produtos, String> mensagePromoMaisFrete = p -> "O produto " 
		+ p.nome.toUpperCase() 
		+" está em promoção e frete gratuito valor do desconto " 
		+ p.desconto; 
		
		//produsopromo.stream().filter(freteGratuito).map(mensageGratuito).forEach(System.out::println);
		produsopromo.stream()
		.filter(promo)
		.filter(freteGratuito)
		.map(mensagePromoMaisFrete)
		.forEach(System.out::println);

	}

}
