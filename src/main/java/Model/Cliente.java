/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ander
 */
public class Cliente extends Pessoa implements Comparable<Cliente> {
    private String endereco;
    private String CEP;
    
    private static int contadorCliente = 0;

    public Cliente(String nome, char sexo, String dataNascimento, String telefone, String email, String RG, String endereco, String CEP) {
        super(++contadorCliente, nome, sexo, dataNascimento, telefone, email, RG);
        this.endereco = endereco;
        this.CEP = CEP;
    }

    public Cliente(String nome, String endereco, String CEP) {
        super(++contadorCliente, nome);
        this.endereco = endereco;
        this.CEP = CEP;
    }    

    public String getEndereco() {
        return endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public int compareTo(Cliente c) {
        return this.getNome().compareTo(c.getNome());
    }   
}