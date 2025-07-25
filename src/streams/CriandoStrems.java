package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStrems {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "Js\n");
		langs.forEach(print);
		
		String[] maisLang = {"Python ", "Lisp ", "Perl ", "Go\n"};
		Stream.of(maisLang).forEach(print);
		Arrays.stream(maisLang).forEach(print);
		Arrays.stream(maisLang, 1, 3).forEach(print);
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "kotlin\n");
		outrasLangs.parallelStream().forEach(print);
		
	}

}
