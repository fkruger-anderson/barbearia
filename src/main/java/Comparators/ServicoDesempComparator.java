/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparators;

import Model.Servico;
import java.util.Comparator;
import java.util.Map;

/**
 *
 * @author ander
 */
public class ServicoDesempComparator implements Comparator <Map.Entry<Servico, Double>> {
    
    @Override
    public int compare(Map.Entry<Servico, Double> o1, Map.Entry<Servico, Double> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}