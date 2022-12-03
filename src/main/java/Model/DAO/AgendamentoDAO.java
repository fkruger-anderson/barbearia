/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamento;
import java.util.List;
import Model.Repository.AgendamentoRepository;

/**
 *
 * @author ander
 */
public class AgendamentoDAO implements AgendamentoRepository {
    
    /**
     * Insere um agendamento dentro do banco de dados
     * @param agendamento exige que seja passado um objeto do tipo agendamento
     * @return 
     */
    @Override
    public boolean insert(Agendamento agendamento){
        return Banco.agendamento.add(agendamento);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param agendamento
     * @return 
     */
    @Override
    public boolean update(Agendamento agendamento){
        for (int i = 0; i < Banco.agendamento.size(); i++) {
            if(idSaoIguais(Banco.agendamento.get(i),agendamento)){
                Banco.agendamento.set(i, agendamento);
                return true;
            }
        }
        return false;    
    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param agendamento
     * @return 
     */
    @Override
    public boolean delete(Agendamento agendamento){
        return Banco.agendamento.removeIf(ag -> ag.getId() == agendamento.getId());
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    @Override
    public List<Agendamento> selectAll(){
        return Banco.agendamento;
    } 
    
    private boolean idSaoIguais(Agendamento agendamento, Agendamento agendamentoAComparar) {
        return agendamento.getId() ==  agendamentoAComparar.getId();
    }
}