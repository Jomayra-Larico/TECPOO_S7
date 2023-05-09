/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitas;

import entidades.Cita;
import entidades.Medico;
import entidades.Paciente;
import gestordecitas.pantallas.JFrameGestorDeCitas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jomayra
 */
public class GestorDeCitas {

    public static List<Cita> citasEnElSistema;
    public static List<Paciente> listaDePacientes;
    public static List<Medico> listaDeMedicos;
    
    public static List<String> horasDisponibles = new ArrayList<>();
    public static List<String> fechasDisponibles = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        citasEnElSistema = new ArrayList<>();
        listaDePacientes = new ArrayList<>();
        listaDeMedicos = new ArrayList<>();
        
        horasDisponibles.add("9:00am");
        horasDisponibles.add("9:30am");
        horasDisponibles.add("10:00am");
        horasDisponibles.add("10:30am");
        horasDisponibles.add("11:00am");
        horasDisponibles.add("11:30am");
        
        fechasDisponibles.add("05/05/2023");
        fechasDisponibles.add("06/05/2023");
        fechasDisponibles.add("07/05/2023");
        fechasDisponibles.add("08/05/2023");
        fechasDisponibles.add("09/05/2023");
        
        JFrameGestorDeCitas framePrincipal = new JFrameGestorDeCitas();
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setVisible(true);
    }
    
}
