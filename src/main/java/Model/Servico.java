/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;


/**
 *
 * @author ander
 */
public class Servico implements Comparable<Servico> {
    private final int id;
    private String descricao;
    private float valor;
    
    private static int contadorServico = 0;

    public Servico(String descricao, float valor) {
        this.id = ++contadorServico;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public static int getContadorServico() {
        return contadorServico;
    }

    @Override
    public String toString() {
        return getDescricao();
    }

    @Override
    public int compareTo(Servico o) {
        return this.getDescricao().compareTo(o.getDescricao());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Servico other = (Servico) obj;
        if (Float.floatToIntBits(this.valor) != Float.floatToIntBits(other.valor)) {
            return false;
        }
        return Objects.equals(this.descricao, other.descricao);
    }
}