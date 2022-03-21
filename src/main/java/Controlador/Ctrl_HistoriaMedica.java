package Controlador;

import Modelo.HistoriaMedica;
import Modelo.Medico;
import Vista.Historia_Medica.CitaH;
import Vista.Historia_Medica.CitaH.Tension;
import Vista.Historia_Medica.CitaH.Valores;
import java.util.List;
import java.util.ArrayList;

public class Ctrl_HistoriaMedica {

    // Valida que el paciente este registrado
    public static int buscarMedico(String ID, List<Medico> medicos) {
        for (int i = 0; i < medicos.size(); i++) {
            if (medicos.get(i).getCI().equals(ID)) {
                return i; // Se encontro el medico
            }
        }
        return -1; // No se encontro el medico
    }    
    
    // Crear ID de la Historia Medica
    public static String generarIDHistoriaM(){
        char[] Arr2 = new char[8];
        Arr2[0] = 'H';
        for (int i =1; i<8; i++)
        {
            int n = (int)(Math.random()*9);
            char c  = (char) (n + '0');
            Arr2[i]=c;
        }

        String IDHistoria = String.valueOf(Arr2);
        return IDHistoria;        
    }
    
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
    ) {
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

        List<CitaH> citas = new ArrayList<>();
        citas.add(NuevaCita);
        NuevaHistoria.setCitas(citas);

        return true; //validar datos cita y sucursal lo demas rela creo yo
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
    ) {

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

        return true; //validar datos cita y sucursal lo demas rela creo yo
    }
}
