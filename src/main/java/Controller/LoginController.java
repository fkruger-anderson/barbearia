/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Exception.LoginException;
import Model.Autenticavel;
import View.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Repository.UsuarioRepository;
import View.TelaLogin;
import View.TelaMenuPrincipal;
import java.util.Map;

/**
 *
 * @author ander
 */
public class LoginController {
    
    private final LoginHelper helper;

    public LoginController(TelaLogin view) {
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema() throws LoginException{
        //Pegar um Usuário da View
        Map<String, String> usuario = helper.obterModelo();
        
        //Pesquisa Usuario no Banco
        UsuarioRepository usuarioRepository = new UsuarioDAO();
        Autenticavel usuarioAutenticado = usuarioRepository.selectPorNome(usuario.get("usuario"));
        
        //Se o usuário da view tiver mesmo usuario e senha que o usuario vindo do banco, irei direcionar para menu principal
        if(usuarioAutenticado != null && usuarioAutenticado.realizarLogin(usuario.get("usuario"), usuario.get("senha"))) {
            helper.setarUsuarioAutenticado(usuarioAutenticado);
            TelaMenuPrincipal menu = new TelaMenuPrincipal();
            menu.setVisible(true);
            helper.fecharJanela();                
        } else {
            //se não vou mostrar uma mensagem ao usuário "Usuário ou senha inválidos"
            throw new LoginException("Usuário ou senha inválidos.");
        }
    }
}