/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Helper;

import View.TelaMenuPrincipal;

/**
 *
 * @author ander
 */
public class MenuHelper {
    private final TelaMenuPrincipal view;

    public MenuHelper(TelaMenuPrincipal view) {
        this.view = view;
    }
    
    public void permissaoBasica() {
        view.getMiUsuario().setEnabled(false);
        view.getMiServico().setEnabled(false);
    }

    public void permissaoAdministrador() {
        view.getMiUsuario().setEnabled(true);
        view.getMiServico().setEnabled(true);
    }
        
    public void mostrarMensagem(String msg) {
        view.exibeMensagem(msg);
    }
}