/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabprog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Paula Costa
 */
public class ConexaoBD {
    private static final String URL = "jdbc:mysql://localhost:3306/TransferFUT";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // Método para obter conexão com o banco
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Método para inserir jogador no banco
    public static void inserirJogador(String codJogador, String nomeJogador, String dataNascimento, 
                                      String sexo, double altura, String codPais, 
                                      String codAgente, String codPosicao) throws SQLException {
        String sql = "INSERT INTO Jogador (Cod_Jogador, Nome_Jogador, DataNascimento, Sexo, Altura, Cod_Pais, Cod_Agente, Cod_Posicao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, codJogador);
            stmt.setString(2, nomeJogador);
            stmt.setString(3, dataNascimento);
            stmt.setString(4, sexo);
            stmt.setDouble(5, altura);
            stmt.setString(6, codPais);
            stmt.setString(7, codAgente);
            stmt.setString(8, codPosicao);

            stmt.executeUpdate();
        }
    }
}
