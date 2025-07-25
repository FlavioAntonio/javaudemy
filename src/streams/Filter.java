package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Igo", 9.8);
		Aluno a4 = new Aluno("Rebeca", 6.8);
		Aluno a5 = new Aluno("Pedro", 7.1);
		Aluno a6 = new Aluno("Ricardo", 7.8);
		Aluno a7 = new Aluno("Luan", 9.6);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
	//	Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovados = a -> a.nota <7;
//		Function<Aluno, String> saudacaoAprovado = a -> "Parabén " + a.nome + "! Você foi aprovado(a)! ";
		Function<Aluno, String> saudacaoReprovado = a -> "Infelismente " + a.nome + "! Você foi reprovado(a)! ";
		
		alunos.stream()
		//.filter(aprovado)
		.filter(reprovados)
		.map(saudacaoReprovado)	
		.forEach(System.out::println);
		
	}
}
