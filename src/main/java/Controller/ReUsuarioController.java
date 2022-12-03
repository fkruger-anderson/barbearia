/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Helper.ReUsuarioHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import Model.Usuario;
import View.TelaReUsuario;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import Model.Repository.AgendamentoRepository;

/**
 *
 * @author ander
 */
public class ReUsuarioController {
    private final ReUsuarioHelper helper;

    public ReUsuarioController(TelaReUsuario view) {
        this.helper = new ReUsuarioHelper(view);
    }
    
    private Map<Usuario, Double> relatorio() {
        AgendamentoRepository agendamentoRepositorio = new AgendamentoDAO();
        List<Agendamento> agendamentos = agendamentoRepositorio.selectAll();

        return agendamentos.stream()
                           .collect(Collectors.groupingBy(Agendamento::getUsuario,
                                    Collectors.summingDouble(Agendamento::getValor)));
    }
    
    public void relatorioAlfabetica() {
        Map<Usuario, Double> relatorioAlf = relatorio().entrySet()
                                                       .stream()
                                                       .sorted((s1, s2) -> s1.getKey().getNome().compareTo(s2.getKey().getNome()))
                                                       .collect(Collectors.toMap(Map.Entry::getKey, 
                                                                                 Map.Entry::getValue,
                                                                                 (e1,e2) -> e1, 
                                                                                 LinkedHashMap::new));
        helper.preencherTabela(relatorioAlf);
    }
    
    public void relatorioDesempenho() {
        Map<Usuario, Double> relatorioDes = relatorio().entrySet()
                                                       .stream()
                                                       .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                                                       .collect(Collectors.toMap(Map.Entry::getKey, 
                                                                                 Map.Entry::getValue,
                                                                                 (e1,e2) -> e1, 
                                                                                 LinkedHashMap::new));
        helper.preencherTabela(relatorioDes);
    }
}