/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Repository;

import Model.Agendamento;
import java.util.List;

/**
 *
 * @author ander
 */
public interface AgendamentoRepository {
    public boolean insert(Agendamento agendamento);
    public boolean update(Agendamento agendamento);
    public boolean delete(Agendamento agendamento);
    public List<Agendamento> selectAll();
}
