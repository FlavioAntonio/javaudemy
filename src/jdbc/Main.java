package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		String continuar = "sim";
		Scanner entrada = new Scanner(System.in);

		Connection conexao = FabricaConexao.getConnection();

		while (continuar.equalsIgnoreCase("sim")) {
			System.out.println("escolha uma das opçoes abaixo:\n" + "\nconsultar um dado 1[]\n"
					+ "atualizar um dado 2[]\n" + "registrar um dado 3[]");
			String executar = entrada.nextLine();
			
			switch (executar) {
			case "1":
				ConsultaPessoa1.consultar();
				break;
			case "2":
				AtualizarRegistro.atualizarPessoa();
				break;
			case "3":
				NovaPessoa.cadastrarPessoa();
				break;
				

			}

			System.out.println("\nDeseja continuar ?");
			continuar = entrada.nextLine().trim();
			
		}

		entrada.close();
		conexao.close();

	}

}
