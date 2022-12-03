/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.TableModel;

import Model.Cliente;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ander
 */
public class ReClienteTableModel extends AbstractTableModel {
    
    private final Cliente[] relatorio;
    private final String[] colunas = {"Cliente", "Sexo", "Data de nascimento", "Telefone", "E-mail", "RG", "Endereço", "CEP"};

    public ReClienteTableModel(Set<Cliente> relatorio) {
        this.relatorio = relatorio.toArray(Cliente[]::new);
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return relatorio.length;   
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 -> {
                return relatorio[rowIndex].getNome();
            }
            case 1 -> {
                return relatorio[rowIndex].getSexo();
            }
            case 2 -> {
                return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(relatorio[rowIndex].getDataNascimento());
            }
            case 3 -> {
                return relatorio[rowIndex].getTelefone();
            }
            case 4 -> {
                return relatorio[rowIndex].getEmail();
            }
            case 5 -> {
                return relatorio[rowIndex].getRG();
            }
            case 6 -> {
                return relatorio[rowIndex].getEndereco();
            }
            case 7 -> {
                return relatorio[rowIndex].getCEP();
            }
        }
        return null;
    }
}