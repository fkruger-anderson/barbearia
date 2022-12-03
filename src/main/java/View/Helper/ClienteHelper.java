/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Cliente;
import View.TelaCadastroCliente;

/**
 *
 * @author ander
 */
public class ClienteHelper implements IHelper {
    private final TelaCadastroCliente view;

    public ClienteHelper(TelaCadastroCliente view) {
        this.view = view;
    }

    @Override
    public Cliente obterModelo() {
        String nome = view.getTfNome().getText();
        char sexo = 'M';
        if (view.getRbSexoMasculino().isSelected()) {
            sexo = 'M';
        } else if (view.getRbSexoFeminino().isSelected()) {
            sexo = 'F';
        }
        
        String dataNascimento = view.getTfDataNascimento().getText();
        String telefone = view.getTfTelefone().getText();
        String email = view.getTfEmail().getText();
        String rg = view.getTfRG().getText();
        String endereco = view.getTfEndereco().getText();
        String cep = view.getTfCep().getText();
        
        Cliente cliente = new Cliente(nome, sexo, dataNascimento, telefone, email, rg, endereco, cep);
        return cliente;
    }

    @Override
    public void limparTela() {
        view.getTfNome().setText("");
        view.getBgSexo().clearSelection();
        view.getTfDataNascimento().setText("");
        view.getTfTelefone().setText("");
        view.getTfEmail().setText("");
        view.getTfRG().setText("");
        view.getTfEndereco().setText("");
        view.getTfCep().setText("");
    }

    public void setarId(int proximoId) {
        view.getTfId().setText(proximoId + "");
    }
        
    @Override
    public void mostrarMensagem(String msg) {
        view.exibeMensagem(msg);
    }
}