/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.TableModel;

import Model.Agendamento;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ander
 */
public class AgendaTableModel extends AbstractTableModel {

    private final List<Agendamento> agendamentos;
    private final String[] colunas = {"ID", "Usuario", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"};

    public AgendaTableModel(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return agendamentos.size();   
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 -> {
                return agendamentos.get(rowIndex).getId();
            }
            case 1 -> {
                return agendamentos.get(rowIndex).getUsuario();
            }
            case 2 -> {
                return agendamentos.get(rowIndex).getCliente();
            }
            case 3 -> {
                return agendamentos.get(rowIndex).getServico();
            }
            case 4 -> {
                return agendamentos.get(rowIndex).getValor();
            }
            case 5 -> {
                return agendamentos.get(rowIndex).getDataFormatada();
            }
            case 6 -> {
                return agendamentos.get(rowIndex).getHoraFormatada();
            }
            case 7 -> {
                return agendamentos.get(rowIndex).getObservacao();
            }
        }
        return null;
    }
}