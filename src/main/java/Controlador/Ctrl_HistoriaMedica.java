package Controlador;

import Modelo.HistoriaMedica;
import Modelo.Medico;
import Vista.Historia_Medica.CitaH;
import Vista.Historia_Medica.CitaH.Valores;
import Vista.Historia_Medica.CitaH.Valores.Tension;
import java.util.List;

public class Ctrl_HistoriaMedica {

    // Valida que el medico este registrado
    public static int buscarMedico(String ID, List<Medico> medicos) {
        for (int i = 0; i < medicos.size(); i++) {
            if (medicos.get(i).getCI().equals(ID)) {
                return i; // Se encontro el medico
            }
        }
        return -1; // No se encontro el medico
    }

    // Valida que la cita exista
    public static int buscarCitaH(String ID, List<CitaH> citasH) {
        for (int i = 0; i < citasH.size(); i++) {
            if (citasH.get(i).getId().equals(ID)) {
                return i; // Se encontro la citaH
            }
        }
        return -1; // No se encontro la citaH
    }

    // Crear ID de la Historia Medica
    public static String generarIDHistoriaM() {
        char[] Arr2 = new char[8];
        Arr2[0] = 'H';
        for (int i = 1; i < 8; i++) {
            int n = (int) (Math.random() * 9);
            char c = (char) (n + '0');
            Arr2[i] = c;
        }

        String IDHistoria = String.valueOf(Arr2);
        return IDHistoria;
    }

    // Crear Cita de Historia
    public static void CrearCitaH(String idCita,
            String peso,
            String talla,
            String idmc,
            String tensionMaxima,
            String tensionMinima,
            String pulso,
            List<CitaH> citasH) 
    {
        // Creando Cita de Historia
        CitaH NuevaCitaH = new CitaH();
        NuevaCitaH.setId(idCita);

        Valores valores = NuevaCitaH.new Valores();
        valores.setPeso(peso);
        valores.setTalla(talla);
        valores.setPesoTalla(idmc);
        valores.setPulso(pulso);

        Tension tension = valores.new Tension();
        tension.setMaxima(tensionMaxima);
        tension.setMinima(tensionMinima);
        
        // Añadiendo CitasH a la Lista de CitasH
        citasH.add(NuevaCitaH);
    }

    public static void CrearHistoria(
            String idHistoria,
            String paciente,
            List<CitaH> citasH,
            List<HistoriaMedica> historias)
    {
        // Creando Historia Medica
        HistoriaMedica NuevaHistoriaM = new HistoriaMedica();
        NuevaHistoriaM.setId(idHistoria);
        NuevaHistoriaM.setPaciente(paciente);
        NuevaHistoriaM.setCitas(citasH);

        // Añadiendo nueva historia a la Lista de Historias Medicas
        historias.add(NuevaHistoriaM);

    }

    // Actualiza los datos de la Cita que contiene la Historia Medica del Paciente
    public static void ActualizarHistoria(
            String idCita,
            String peso,
            String talla,
            String imc,
            String tensionMaxima,
            String tensionMinima,
            String pulso,
            List<CitaH> citasH) 
    {
        // Buscando la cita a la que se va a modificar
        int index = buscarCitaH(idCita, citasH);
        
        Valores valores = citasH.get(index).new Valores();
        valores.setPeso(peso);
        valores.setTalla(talla);
        valores.setPesoTalla(imc);
        valores.setPulso(pulso);
        
        Tension tension = valores.new Tension();
        tension.setMaxima(tensionMaxima);
        tension.setMinima(tensionMinima);
        
    }
}
