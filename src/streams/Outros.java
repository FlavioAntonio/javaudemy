package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luana", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 8.1);
		Aluno a5 = new Aluno("ana", 8.1);
		Aluno a6 = new Aluno("Pedro", 6);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a6, a7, a8);
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);

	}

}
