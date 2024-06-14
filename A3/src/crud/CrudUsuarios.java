/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import usuario.Usuario;

/**
 *
 * @author fred
 */
public class CrudUsuarios 
{
 public static void criarUsuario(Usuario usuario) {
        String sql = "INSERT INTO login(nome, senha) VALUES "+"(?, ?)";
        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.executeUpdate();
            System.out.println("Usuário criado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar usuário: " + e.getMessage());
        }
    }

    public static void lerUsuarios() {
        String sql = "SELECT * FROM login";
        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Nome: " + rs.getString("name") +
                        ", Senha: " + rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao ler usuários: " + e.getMessage());
        }
    }

    public static void atualizarUsuario(Usuario usuario) {
        String sql = "UPDATE login SET name = ?, password = ? WHERE id = ?";
        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.setInt(3, usuario.getId());
            stmt.executeUpdate();
            System.out.println("Usuário atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar usuário: " + e.getMessage());
        }
    }

    public static void deletarUsuario(int id) {
        String sql = "DELETE FROM login WHERE id = ?";
        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Usuário deletado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar usuário: " + e.getMessage());
        }
    }   
}
