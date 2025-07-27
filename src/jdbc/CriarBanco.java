package jdbc;

import javax.sql.StatementEvent;
import java.sql.*;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost";
        final String usuario = "root";
        final String senha = "rootpass";

        Connection conexao = DriverManager.getConnection(url,usuario,senha);
        System.out.println("Conexão efetuada com sucesso");

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
        System.out.println("Banco criado com sucesso");
        conexao.close();
    }
}
