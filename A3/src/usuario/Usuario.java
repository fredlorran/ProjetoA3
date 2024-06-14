/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;

/**
 *
 * @author fred
 */
public class Usuario {

    private int id;
    private String nome;
    private String senha;

    // Construtor para novos usuários (sem ID)
    public void Usuario(String senha, String nome) {
        this.nome = nome;
        this.senha = senha;
    }

    // Construtor para usuários existentes (com ID)
    public void Usuario(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
