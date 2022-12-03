/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.TableModel.AgendaTableModel;
import Model.Usuario;
import View.TelaAgenda;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ander
 */
public class AgendaHelper implements IHelper {
    private final TelaAgenda view;

    public AgendaHelper(TelaAgenda view) {
        this.view = view;
    }
    
    public void preencherTabela(List<Agendamento> agendamentos) {
        view.getTaRelatorio().setModel(new AgendaTableModel(agendamentos));
        
//        DefaultTableModel tableModel = (DefaultTableModel) view.getTaRelatorio().getModel();
//        tableModel.setNumRows(0);
//        
//        for (Agendamento agendamento : agendamentos) {
//            tableModel.addRow(new Object[] {
//                agendamento.getId(),
//                agendamento.getUsuario(),
//                agendamento.getCliente().getNome(),
//                agendamento.getServico().getDescricao(),
//                agendamento.getValor(),
//                agendamento.getDataFormatada(),
//                agendamento.getHoraFormatada(),
//                agendamento.getObservacao()
//            });
//        }
    }
    
    public void preencherUsuarios(List<Usuario> usuarios) {
        usuarios.forEach(u -> view.getCbUsuario().addItem(u));
    }

    public void preencherClientes(List<Cliente> clientes) {
        clientes.forEach(c -> view.getCbCliente().addItem(c));
    }

    public void preencherServicos(List<Servico> servicos) {
        servicos.forEach(s -> view.getCbServico().addItem(s));
    }
    
    public Usuario obterUsuario() {
        return (Usuario) view.getCbUsuario().getSelectedItem();
    }
    
    public Servico obterServico() {
        return (Servico) view.getCbServico().getSelectedItem();
    }

    public Cliente obterCliente() {
        return (Cliente) view.getCbCliente().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getTfValor().setText(valor + "");
    }
    
    public void setarId(int id) {
        view.getTfID().setText(id + "");
    }

    @Override
    public Agendamento obterModelo() {
        Usuario usuario = obterUsuario();
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        float valor = Float.parseFloat(view.getTfValor().getText());
        String data = view.getTfData().getText();
        String hora = view.getTfHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getTaObservacao().getText();
        
        Agendamento agendamento = new Agendamento(usuario, cliente, servico, valor, dataHora, observacao);
        return agendamento;
    }

    @Override
    public void limparTela() {
        view.getTfID().setText("");
        view.getTfData().setText("");
        view.getTfHora().setText("");
        view.getTaObservacao().setText("");
    }
        
    @Override
    public void mostrarMensagem(String msg) {
        view.exibeMensagem(msg);
    }
}