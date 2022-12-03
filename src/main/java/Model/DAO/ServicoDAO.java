/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Servico;
import java.util.List;
import Model.Repository.ServicoRepository;

/**
 *
 * @author ander
 */
public class ServicoDAO implements ServicoRepository {
    
    
    /**
     * Insere um servico dentro do banco de dados
     * @param servico exige que seja passado um objeto do tipo servico
     * @return 
     */
    @Override
    public boolean insert(Servico servico){
        return Banco.servico.add(servico);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param servico
     * @return 
     */
    @Override
    public boolean update(Servico servico){
        for (int i = 1; i <= Banco.servico.size(); i++) {
            if(idSaoIguais(Banco.servico.get(i), servico)){
                Banco.servico.set(i, servico);
                return true;
            }
        }
        return false;  
    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param servico
     * @return 
     */
    @Override
    public boolean delete(Servico servico){
        return Banco.servico.removeIf(s -> s.getId() == servico.getId());
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    @Override
    public List<Servico> selectAll(){
        return Banco.servico;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param servico
     * @param servicoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Servico servico, Servico servicoAComparar) {
        return servico.getId() ==  servicoAComparar.getId();
    }   
}