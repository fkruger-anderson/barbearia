/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Comparators.ServicoDesempComparator;
import View.Helper.ReServicoHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import Model.Servico;
import View.TelaReServico;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import Model.Repository.AgendamentoRepository;
import java.util.Comparator;

/**
 *
 * @author ander
 */
public class ReServicoController {
    private final ReServicoHelper helper;

    public ReServicoController(TelaReServico view) {
        this.helper = new ReServicoHelper(view);
    }
    
    private Map<Servico, Double> relatorio() {
        AgendamentoRepository agendamentoRepositorio = new AgendamentoDAO();
        List<Agendamento> agendamentos = agendamentoRepositorio.selectAll();

        return agendamentos.stream()
                           .collect(Collectors.groupingBy(Agendamento::getServico,
                                    Collectors.summingDouble(Agendamento::getValor)));        
    }

    public void relatorioAlfabetica() {        
        Map<Servico, Double> relatorioAlf = relatorio().entrySet()
                                                       .stream()
                                                       .sorted(new Comparator<Entry<Servico, Double>>(){
                                                           @Override
                                                           public int compare(Entry<Servico, Double> s1, Entry<Servico, Double> s2) {
                                                               return s1.getKey().getDescricao().compareTo(s2.getKey().getDescricao());
                                                           }
                                                       })
                                                       .collect(Collectors.toMap(Entry::getKey, 
                                                                                 Entry::getValue,
                                                                                 (e1,e2) -> e1, 
                                                                                 LinkedHashMap::new));
        helper.preencherTabela(relatorioAlf);
    }
    
    public void relatorioDesempenho() {        
        Map<Servico, Double> relatorioDes = relatorio().entrySet()
                                                       .stream()
                                                       .sorted(new ServicoDesempComparator())
                                                       .collect(Collectors.toMap(Entry::getKey, 
                                                                                 Entry::getValue,
                                                                                 (e1,e2) -> e1, 
                                                                                 LinkedHashMap::new));
        helper.preencherTabela(relatorioDes);
    }
}