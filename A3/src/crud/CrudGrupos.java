/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.sql.PreparedStatement;
import java.sql.Connection;
import conexao.Conexao;
import dados.Grupos;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author fred
 */
public class CrudGrupos {

    public void create(Grupos g) {

        Connection con = Conexao.conectar();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO grupos (membros,modalidade,data,horario,local)VALUES(?,?,?,?,?)");
            stmt.setString(1, g.getMembros());
            stmt.setString(2, g.getModalidade());
            stmt.setInt(3, g.getData());
            stmt.setInt(4, g.getHorario());
            stmt.setString(5, g.getLocal());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!" + ex);
            Logger.getLogger(CrudGrupos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.desconectar(con);
//        Conexao.desconectar((Connection) stmt);
        }
    }

    public List<Grupos> read() {

        Connection con = Conexao.conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Grupos> grp = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM grupos ");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Grupos grupos = new Grupos();
                grupos.setId(rs.getInt("id"));
                grupos.setMembros(rs.getString("membros"));
                grupos.setModalidade(rs.getString("modalidade"));
                grupos.setData(rs.getInt("data"));
                grupos.setHorario(rs.getInt("horario"));
                grupos.setLocal(rs.getString("local"));
                grp.add(grupos);

            }
        } catch (SQLException ex) {

            Logger.getLogger(CrudGrupos.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            Conexao.desconectar(con);
        }
        return (grp);
    
    }
    public List<Grupos> readForMembros(String membros) {

        Connection con = Conexao.conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Grupos> grp = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM grupos  WHERE membros LIKE ?");
            stmt.setString(1, "%"+membros+"%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Grupos grupos = new Grupos();
                grupos.setId(rs.getInt("id"));
                grupos.setMembros(rs.getString("membros"));
                grupos.setModalidade(rs.getString("modalidade"));
                grupos.setData(rs.getInt("data"));
                grupos.setHorario(rs.getInt("horario"));
                grupos.setLocal(rs.getString("local"));
                grp.add(grupos);

            }
        } catch (SQLException ex) {

            Logger.getLogger(CrudGrupos.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            Conexao.desconectar(con);
        }
        return (grp);
    }

    public void update(Grupos g) {

        Connection con = Conexao.conectar();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE grupos SET membros=?,modalidade=?,data=?,horario=?,local=? WHERE id=?");
            stmt.setString(1, g.getMembros());
            stmt.setString(2, g.getModalidade());
            stmt.setInt(3, g.getData());
            stmt.setInt(4, g.getHorario());
            stmt.setString(5, g.getLocal());
            stmt.setInt(6, g.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex);
            Logger.getLogger(CrudGrupos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.desconectar(con);
//        Conexao.desconectar((Connection) stmt);
        }
    }

    public void delete(Grupos g) {

        Connection con = Conexao.conectar();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM grupos WHERE id=?");

            stmt.setInt(1, g.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Ecluido  com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ecluir!" + ex);
            Logger.getLogger(CrudGrupos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.desconectar(con);
//        Conexao.desconectar((Connection) stmt);
        }
    }
}
