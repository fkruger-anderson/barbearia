/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Usuario;
import View.TelaCadastroUsuario;

/**
 *
 * @author 07337354959
 */
public class UsuarioHelper implements IHelper {
    private final TelaCadastroUsuario view;

    public UsuarioHelper(TelaCadastroUsuario view) {
        this.view = view;
    }

    @Override
    public Usuario obterModelo() {
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
        String nivelAcesso = view.getTfNivelDeAcesso().getText();
        String senha = view.getTfSenha().getText();
        
        Usuario usuario = new Usuario(nome, sexo, dataNascimento, telefone, email, rg, nivelAcesso, senha);
        return usuario;
    }

    @Override
    public void limparTela() {
        view.getTfNome().setText("");
        view.getBgSexo().clearSelection();
        view.getTfDataNascimento().setText("");
        view.getTfTelefone().setText("");
        view.getTfEmail().setText("");
        view.getTfRG().setText("");
        view.getTfNivelDeAcesso().setText("");
        view.getTfSenha().setText("");
    }
    
    public void setarId(int proximoId) {
        view.getTfId().setText(proximoId + "");
    }
        
    @Override
    public void mostrarMensagem(String msg) {
        view.exibeMensagem(msg);
    }
}