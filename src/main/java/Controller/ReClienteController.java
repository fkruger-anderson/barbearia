/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Exception.OrdemDataException;
import View.Helper.ReClienteHelper;
import View.TelaReCliente;
import java.time.LocalDate;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import Model.Repository.AgendamentoRepository;

/**
 *
 * @author ander
 */
public class ReClienteController {
    public final ReClienteHelper helper;

    public ReClienteController(TelaReCliente view) {
        this.helper = new ReClienteHelper(view);
    }
   
    public void filtrarDatas() throws OrdemDataException {
        Map<String, LocalDate> datas = helper.obterDatas();
        LocalDate dataInicio = datas.get("dataInicio");
        LocalDate dataFim = datas.get("dataFim");
        
        if (dataInicio.isAfter(dataFim)) {
            throw new OrdemDataException("Data de início deve ser anterior a data de fim.");
        }
        
        AgendamentoRepository agendamentoRepositorio = new AgendamentoDAO();
        Set<Cliente> clientesFiltrado = agendamentoRepositorio.selectAll()
                                                              .stream()
                                                              .filter(a -> a.getData().toLocalDate().isAfter(dataInicio) ||
                                                                           a.getData().toLocalDate().isEqual(dataInicio) &&
                                                                           a.getData().toLocalDate().isBefore(dataFim) ||
                                                                           a.getData().toLocalDate().isEqual(dataFim))
                                                              .map(Agendamento::getCliente)
                                                              .collect(Collectors.toSet());

        helper.preencherTabela(clientesFiltrado);
    }
}