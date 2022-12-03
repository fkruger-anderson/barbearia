/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Repository;

import Model.Usuario;
import java.util.List;

/**
 *
 * @author ander
 */
public interface UsuarioRepository {
    public boolean insert(Usuario usuario);
    public boolean update(Usuario usuario);
    public boolean delete(Usuario usuario);
    public List<Usuario> selectAll();
    public Usuario selectPorNome(String usuario);
}