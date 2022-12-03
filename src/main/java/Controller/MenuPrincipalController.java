/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.TelaAgenda;
import View.TelaCadastroCliente;
import View.TelaCadastroServico;
import View.TelaCadastroUsuario;
import View.Helper.MenuHelper;
import View.TelaLogin;
import View.TelaMenuPrincipal;
import View.TelaReCliente;
import View.TelaReServico;
import View.TelaReUsuario;

/**
 *
 * @author ander
 */
public class MenuPrincipalController {
    private final MenuHelper helper;

    public MenuPrincipalController(TelaMenuPrincipal view) {
        this.helper = new MenuHelper(view);
    }
    
    public void navegarParaAgenda() {
        TelaAgenda agenda = new TelaAgenda();
        agenda.setVisible(true);   
    }
    
    public void navegarParaCadastroCliente() {
        TelaCadastroCliente cadastroCliente = new TelaCadastroCliente();
        cadastroCliente.setVisible(true);
    }
    
    public void navegarParaCadastroServico() {
        TelaCadastroServico cadastroServico = new TelaCadastroServico();
        cadastroServico.setVisible(true);
    }    

    public void navegarParaCadastroUsuario() {
        TelaCadastroUsuario cadastroUsuario = new TelaCadastroUsuario();
        cadastroUsuario.setVisible(true);
    }
    
    public void navegarParaReServico() {
        TelaReServico relatorioServico = new TelaReServico();
        relatorioServico.setVisible(true);
    }
    
    public void navegarParaReUsuario() {
        TelaReUsuario relatorioUsuario = new TelaReUsuario();
        relatorioUsuario.setVisible(true);
    }

    public void navegarParaReCliente() {
        TelaReCliente relatorioCliente = new TelaReCliente();
        relatorioCliente.setVisible(true);
    }
    
    public void nivelAcesso() {
        boolean nivelAcesso = new TelaLogin().getUsuarioAutenticado().getNivelAcesso().equalsIgnoreCase("Administrador");
        
        if (nivelAcesso) {
            helper.permissaoAdministrador();
        } else {
            helper.permissaoBasica();
        }
    }
}
