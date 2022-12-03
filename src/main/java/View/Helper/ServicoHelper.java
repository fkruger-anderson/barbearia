/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Servico;
import View.TelaCadastroServico;

/**
 *
 * @author ander
 */
public class ServicoHelper implements IHelper {
    private final TelaCadastroServico view;

    public ServicoHelper(TelaCadastroServico view) {
        this.view = view;
    }

    @Override
    public Servico obterModelo() {
        String descricao = view.getTfDescricao().getText();
        float valor = Float.valueOf(view.getTfValor().getText());
        
        Servico servico = new Servico(descricao, valor);
        return servico;
    }

    @Override
    public void limparTela() {
        view.getTfDescricao().setText("");
        view.getTfValor().setText("");
    }
    
    public void setarId(int proximoId) {
        view.getTfId().setText(proximoId + "");
    }
        
    @Override
    public void mostrarMensagem(String msg) {
        view.exibeMensagem(msg);
    }
}