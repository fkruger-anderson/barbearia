/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Helper.ClienteHelper;
import Model.Cliente;
import Model.DAO.ClienteDAO;
import View.TelaCadastroCliente;
import Model.Repository.ClienteRepository;

/**
 *
 * @author ander
 */
public class ClienteController {
    private final ClienteHelper helper;

    public ClienteController(TelaCadastroCliente view) {
        this.helper = new ClienteHelper(view);
    }
    
    public void proximoIdCliente() {
        int proximoId = Cliente.getContadorCliente() + 1;
        helper.setarId(proximoId);
    }
    
    public void cadastrarCliente() { 
        Cliente cliente = helper.obterModelo();
        ClienteRepository clienteRepositorio = new ClienteDAO();
        clienteRepositorio.insert(cliente);
        helper.limparTela();
        proximoIdCliente();
    }
}