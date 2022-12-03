/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Helper.UsuarioHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.TelaCadastroUsuario;
import Model.Repository.UsuarioRepository;

/**
 *
 * @author 07337354959
 */
public class UsuarioController {
    private final UsuarioHelper helper;

    public UsuarioController(TelaCadastroUsuario view) {
        this.helper = new UsuarioHelper(view);
    }
    
    public void proximoIdUsuario() {
        int proximoId = Usuario.getContadorUsuario() + 1;
        helper.setarId(proximoId);
    }
    
    public void cadastrarCliente() {
        Usuario usuario = helper.obterModelo();
        UsuarioRepository usuarioRepositorio = new UsuarioDAO();
        usuarioRepositorio.insert(usuario);
        helper.limparTela();
        proximoIdUsuario();
    }
}