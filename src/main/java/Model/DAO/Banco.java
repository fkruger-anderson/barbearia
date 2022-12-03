/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ander
 */
public class Banco {
    
    public static List<Usuario> usuario;
    public static List<Cliente> cliente;
    public static List<Servico> servico;
    public static List<Agendamento> agendamento;
    
    
    public static void inicia(){
        usuario = new ArrayList<>();
        cliente = new ArrayList<>();
        servico = new ArrayList<>();
        agendamento = new ArrayList<>();
             
        Usuario usuario1 = new Usuario("barbeiro", 'M', "09/05/1996", "30212121", "barbeiro@barberstrem.com", "521454123", "barbeiro", "Administrador");
        Usuario usuario2 = new Usuario("estagiario", 'M', "09/05/1996", "30212122", "estagiario@barberstrem.com", "451244123", "estagiario", "Funcionario");

        usuario.add(usuario1);
        usuario.add(usuario2);
         
        Cliente cliente1 = new Cliente("Alan" , 'M', "30/01/1995", "30212126", "alan@gmail.com", "5142487", "Rua 1",  "89140000");
        Cliente cliente2 = new Cliente("Judite", 'F', "30/08/1994", "30212127", "judite@gmail.com", "5142487745", "Rua 2",  "89140000");
        Cliente cliente3 = new Cliente("Paulo", 'M', "24/04/1997", "30212128", "paulo@gmail.com", "78451458", "Rua 3",  "89140000");
        Cliente cliente4 = new Cliente("Neymar", 'M', "20/08/1995", "30212130", "neymar@gmail.com", "2745487", "Rua 4",  "89140000");
        Cliente cliente5 = new Cliente("Anderson", 'M', "13/09/1992", "30212131", "anderson@gmail.com", "4742487", "Rua 5",  "89140000");
        Cliente cliente6 = new Cliente("Ricardo", 'M', "17/08/1994", "302122324", "ricardo@gmail.com", "78512457", "Rua 6",  "89140000");
        Cliente cliente7 = new Cliente("Erica", 'F', "25/03/1993", "302121292", "erica@gmail.com", "4658237314", "Rua 7",  "89140000");
        Cliente cliente8 = new Cliente("Aline", 'F', "04/03/1990", "302121451", "aline@gmail.com", "8475123687", "Rua 8",  "89140000");
        Cliente cliente9 = new Cliente("Samuel", 'M', "09/02/1998", "302121189", "samuel@gmail.com", "74595142487", "Rua 9",  "89140000");
        Cliente cliente10 = new Cliente("Felipe", 'M', "12/06/1999", "3021212478", "felipe@gmail.com", "845713647", "Rua 10",  "89140000");
        
        Servico servico1 = new Servico("Corte Simples", 18);
        Servico servico2 = new Servico("Corte Degrade", 30);
        Servico servico3 = new Servico("Barba Simples", 15);
        Servico servico4 = new Servico("Barba Desenhada", 25);
        Servico servico5 = new Servico("Sobrancelhas", 10);
        Servico servico6 = new Servico("Penteados", 3);

        Agendamento agendamento1 = new Agendamento(usuario1, cliente1, servico2, 30, "14/10/2022 09:30");
        Agendamento agendamento2 = new Agendamento(usuario1, cliente3, servico4, 40, "14/10/2022 10:00");
        Agendamento agendamento3 = new Agendamento(usuario1, cliente4, servico1, 18, "14/10/2022 10:30");
        Agendamento agendamento4 = new Agendamento(usuario1, cliente4, servico1, 18, "14/10/2022 11:30");
        Agendamento agendamento5 = new Agendamento(usuario1, cliente4, servico1, 18, "14/10/2022 12:30");
        Agendamento agendamento6 = new Agendamento(usuario1, cliente4, servico1, 18, "14/10/2022 13:30");
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        agendamento.add(agendamento4);
        agendamento.add(agendamento5);
        agendamento.add(agendamento6);
    }
}