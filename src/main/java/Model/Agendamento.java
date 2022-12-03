/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Model;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author ander
 */
public class Agendamento {
    private Usuario usuario;
    private final int id;
    private Cliente cliente;
    private Servico servico;
    private float valor;
    private LocalDateTime data;
    private String observacao;
    
    private static int contadorAgendamento = 0;

    public Agendamento(Usuario usuario, Cliente cliente, Servico servico, float valor, String data) {
        this.data = LocalDateTime.parse(data, dtf);
        this.usuario = usuario;
        this.id = ++contadorAgendamento;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;

    }

    public Agendamento(Usuario usuario, Cliente cliente, Servico servico, float valor, String data, String observacao) {
        this(usuario, cliente, servico, valor, data);
        this.observacao = observacao;
    }
    
    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    
    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public float getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }
    
    public String getDataFormatada() {
        return getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    public String getHoraFormatada() {
        return getData().format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public String getObservacao() {
        return observacao;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setData(String data) {
        this.data = LocalDateTime.parse(data, dtf);
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public static int getContadorAgendamento() {
        return contadorAgendamento;
    }
}