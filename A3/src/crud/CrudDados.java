/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dados.Dados;

/**
 *
 * @author fred
 */
public class CrudDados {
    public static void criarDados(Dados dados) {
        String sql = "INSERT INTO dados(membros,modalidade,data,horario,local) VALUES "+"(? ,?,?,?,?)";
        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(0, dados.getMembros());
            stmt.setString(1, dados.getModalidade());
            stmt.setInt(2, dados.getData());
            stmt.setInt(3, dados.getHorario());
            stmt.setString(4, dados.getLocal());
            stmt.executeUpdate();
            System.out.println("Dados criado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar Dados: " + e.getMessage());
          
        }
    }
}
