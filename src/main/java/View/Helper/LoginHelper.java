/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import Model.Autenticavel;
import View.TelaLogin;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ander
 */
public class LoginHelper implements IHelper {
    private final TelaLogin view;

    public LoginHelper(TelaLogin view) {
        this.view = view;
    }
    
    @Override
    public Map<String, String> obterModelo() {
        Map<String, String> loginSenha = new HashMap<>();
        loginSenha.put("usuario", view.getTfUsuario().getText());
        loginSenha.put("senha", view.getTfSenha().getText());
        
        return loginSenha;
    }
    
    public void setarUsuarioAutenticado(Autenticavel usuarioLogado) {
        view.setUsuarioLogado(usuarioLogado);
    }
    
    @Override
    public void limparTela() {
        view.getTfUsuario().setText("");
        view.getTfSenha().setText("");
    }
    
    @Override
    public void mostrarMensagem(String msg) {
        view.exibeMensagem(msg);
    }

    public void fecharJanela() {
        view.dispose();
    }
}