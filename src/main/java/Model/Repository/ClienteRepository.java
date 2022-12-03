/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Repository;

import Model.Cliente;
import java.util.List;

/**
 *
 * @author ander
 */
public interface ClienteRepository {
    public boolean insert(Cliente cliente);
    public boolean update(Cliente cliente);
    public boolean delete(Cliente cliente);
    public List<Cliente> selectAll();
}
