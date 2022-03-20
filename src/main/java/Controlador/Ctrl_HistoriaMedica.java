/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.HistoriaMedica;
import Vista.Historia_Medica.CitaH;
import Vista.Historia_Medica.CitaH.Tension;
import Vista.Historia_Medica.CitaH.Valores;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Maximiliano
 */
public class Ctrl_HistoriaMedica {
    
    public static Boolean CrearHistoria(
                                        String paciente,
                                        String cita,
                                        String peso,
                                        String talla,
                                        String idmc,
                                        String tensionMaxima,
                                        String tensionMinima,
                                        String pulso,
                                       String sucursal
    )
    {
        HistoriaMedica NuevaHistoria = new HistoriaMedica();
        //NuevaHistoria.setId(id);
        NuevaHistoria.setNombre(paciente);
        
        CitaH NuevaCita = new CitaH();
        Valores valores = NuevaCita.new Valores();
        Tension tension = NuevaCita.new Tension();
        
        NuevaCita.setCita(cita);
        valores.setPeso(peso);
        valores.setTalla(talla);
        valores.setPesoTalla(idmc);
        tension.setMaxima(tensionMaxima);
        tension.setMinima(tensionMinima);
        NuevaCita.setPulso(pulso);
        
        List<CitaH> citas = new ArrayList<CitaH>();
        citas.add(NuevaCita);
        NuevaHistoria.setCitas(citas);
         
        
        if (true) //validar datos cita y sucursal lo demas rela creo yo 
        {
            return true;
        }else
            return false;
    }
    
    public static Boolean ActualizarHistoria(
                                       
                                        String cita,
                                        String peso,
                                        String talla,
                                        String idmc,
                                        String tensionMaxima,
                                        String tensionMinima,
                                        String pulso,
                                       String sucursal
    )
    {
       
        
       
        
        CitaH NuevaCita = new CitaH();
        Valores valores = NuevaCita.new Valores();
        Tension tension = NuevaCita.new Tension();
        
        NuevaCita.setCita(cita);
        valores.setPeso(peso);
        valores.setTalla(talla);
        valores.setPesoTalla(idmc);
        tension.setMaxima(tensionMaxima);
        tension.setMinima(tensionMinima);
        NuevaCita.setPulso(pulso);
             
        
        if (true) //validar datos cita y sucursal lo demas rela creo yo 
        {
            return true;
        }else
            return false;
    }
}
