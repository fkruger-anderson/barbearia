/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Exception.AgendaException;
import View.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.DAO.UsuarioDAO;
import Model.Servico;
import Model.Usuario;
import View.TelaAgenda;
import java.time.LocalDateTime;
import java.util.List;
import Model.Repository.AgendamentoRepository;
import Model.Repository.ClienteRepository;
import Model.Repository.ServicoRepository;
import Model.Repository.UsuarioRepository;

/**
 *
 * @author ander
 */
public class AgendaController {
    private final AgendaHelper helper;

    public AgendaController(TelaAgenda view) {
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela() {
        //Buscar Lista com agendamentos de banco de dados
        AgendamentoRepository agendamentoRepository = new AgendamentoDAO();
        List<Agendamento> agendamentos = agendamentoRepository.selectAll();
        //exibir esta lista na view
        helper.preencherTabela(agendamentos);
    }
    
    public void atualizaValor() {
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
        
    public void proximoIdAgendamento() {
        int proximoId = Agendamento.getContadorAgendamento() + 1;
        helper.setarId(proximoId);
    }
    
    public void atualizaCliente() {
        //buscar clientes do banco de dados
        ClienteRepository clienteRepository = new ClienteDAO();
        List<Cliente> clientes = clienteRepository.selectAll();
        
        //exibir clientes no combobox cliente
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServico() {
        ServicoRepository servicoRepository = new ServicoDAO();
        List<Servico> servicos = servicoRepository.selectAll();
        
        helper.preencherServicos(servicos);
    }
    
    public void atualizarUsuario() {
        UsuarioRepository usuarioRepository = new UsuarioDAO();
        List<Usuario> usuarios = usuarioRepository.selectAll();
        
        helper.preencherUsuarios(usuarios);
    }
    
    public void agendar() throws AgendaException {
        //buscar objeto agendamento da tela
        Agendamento agendamento = helper.obterModelo();
        //salvar objeto no banco de dados
        conflitoHorario(agendamento);
        AgendamentoRepository agendamentoRepository = new AgendamentoDAO();
        agendamentoRepository.insert(agendamento);

        //atualizar tela
        atualizaTabela();
        helper.limparTela();
        proximoIdAgendamento();

        //exibe mensagem
        helper.mostrarMensagem("Agenda realizada.");
    }
    
    private void conflitoHorario(Agendamento agendamento) throws AgendaException {
        LocalDateTime horaAgenda = agendamento.getData();
        Usuario barbeiro = agendamento.getUsuario();
        
        boolean conflito = new AgendamentoDAO().selectAll()
                                               .stream()
                                               .anyMatch((a -> a.getData().isEqual(horaAgenda) &&
                                                               barbeiro.equals(a.getUsuario())));
        
        if (conflito) {
            throw new AgendaException ("Horário duplicado.");
        }
    }
}