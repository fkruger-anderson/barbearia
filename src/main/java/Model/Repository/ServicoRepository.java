/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Repository;

import Model.Servico;
import java.util.List;

/**
 *
 * @author ander
 */
public interface ServicoRepository {
    public boolean insert(Servico servico);
    public boolean update(Servico servico);
    public boolean delete(Servico servico);
    public List<Servico> selectAll();
}
