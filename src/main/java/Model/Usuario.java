/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ander
 */
public class Usuario extends Pessoa implements Comparable<Usuario>, Autenticavel {
    private String senha;
    private String nivelAcesso;
    
    private static int contadorUsuario = 0;

    public Usuario(String nome, char sexo, String dataNascimento, String telefone, String email, String RG, String senha, String nivelAcesso) {
        super(++contadorUsuario, nome, sexo, dataNascimento, telefone, email, RG);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public static int getContadorUsuario() {
        return contadorUsuario;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    @Override
    public int compareTo(Usuario u) {
        return this.getNome().compareTo(u.getNome());
    }

    @Override
    public boolean realizarLogin(String login, String senha) {
        return getNome().equalsIgnoreCase(login) && getSenha().equalsIgnoreCase(senha);
    }
}