package excecao.personalizadoB;

import excecao.Aluno;

public class Validar {
	private Validar() {
	}

	public static void aluno(Aluno aluno) throws StringVaziaExecption, NumeroForaIntervaloExecption {
		if (aluno == null) {
			throw new IllegalArgumentException("O Luno está nulo");
		}
		if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaExecption("nome");
		}
		if (aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloExecption("nota");
		}
	}
}
