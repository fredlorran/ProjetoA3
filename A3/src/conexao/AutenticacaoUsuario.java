/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import usuario.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author fred
 */
public class AutenticacaoUsuario {

    Connection conexao;

    public  ResultSet autenticacaoUsuario(Usuario usuario) {

        conexao = Conexao.conectar();
        try {
            String sql = "select* from login where nome = ? ANd senha =  ?";
            PreparedStatement pstm = conexao.prepareStatement(sql);
            pstm.setString(1,usuario.getNome());
            pstm.setString(2,usuario.getSenha());
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConexaoUsuario" + e);
            return null;
        }
    }
}
