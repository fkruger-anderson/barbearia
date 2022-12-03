/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Helper.ServicoHelper;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.TelaCadastroServico;
import Model.Repository.ServicoRepository;

/**
 *
 * @author ander
 */
public class ServicoController {
    private final ServicoHelper helper;
    
    public ServicoController(TelaCadastroServico view) {
        this.helper = new ServicoHelper(view);
    }
    
    public void proximoIdServico() {
        int proximoId = Servico.getContadorServico() + 1;
        helper.setarId(proximoId);
    }
    
    public void cadastrarServico() {
        Servico servico = helper.obterModelo();
        ServicoRepository servicoRepositorio = new ServicoDAO();
        servicoRepositorio.insert(servico);
        helper.limparTela();
        proximoIdServico();            
    }
}