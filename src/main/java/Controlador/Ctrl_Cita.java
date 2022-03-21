package Controlador;

import static Controlador.Ctrl_Sucursal.buscarSucursal;
import static Controlador.Ctrl_Sucursal.getListaSucursales;
import static Controlador.Ctrl_Sucursal.saveListaSucursales;
import Modelo.Cita;
import Modelo.Paciente;
import Modelo.Sucursal;
import java.util.List;

public class Ctrl_Cita {

    // Valida que el paciente este registrado
    public static int buscarPaciente(String CI, List<Paciente> pacientes) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getCI().equals(CI)) {
                return i; // Se encontro el paciente
            }
        }
        return -1; // No se encontro el paciente
    }

    // Valida que la cita exista
    public static int buscarCita(String ID, List<Cita> citas) {
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getID().equals(ID)) {
                return i; // Se encontro la cita
            }
        }
        return -1; // No se encontro la cita
    }

    // Valida que la fecha exista
    public static int buscarFecha(String fecha, List<Cita> citas) {
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getFecha().equals(fecha)) {
                return i; // Se encontro la cita
            }
        }
        return -1; // No se encontro la cita
    }

    // Genera el ID de la Cita
    public static String generarIDCita() {
        char[] Arr3 = new char[8];
        for (int i = 0; i < 8; i++) {
            int n = (int) (Math.random() * 9);
            char c = (char) (n + '0');
            Arr3[i] = c;
        }

        String IDCita = String.valueOf(Arr3);
        return IDCita;
    }

    // Registrar un nuevo paciente y guardarlo al Json
    public static boolean RegistrarPaciente(String nombre,
            String apellido,
            String CI,
            String sexo,
            String fechaNacimiento,
            String lugarNacimiento,
            String estadoCivil,
            String direccion,
            String telefono,
            String profeson,
            String ocupacion,
            String telefonoPeronsaRe,
            String sucursal) {

        List<Sucursal> sucursales = getListaSucursales(); // Leer el Json para obtener la lista de sucursales
        int index = buscarSucursal(sucursal, sucursales);

        if (index != -1) {

            if (buscarPaciente(CI, sucursales.get(index).getPacientes()) == -1) // Validar que el paciente no exista en la lista de pacientes
            {
                Paciente NuevoPaciente = new Paciente(null,
                        null,
                        nombre,
                        apellido,
                        CI,
                        sexo,
                        fechaNacimiento,
                        lugarNacimiento,
                        estadoCivil,
                        direccion,
                        telefono,
                        profeson,
                        ocupacion,
                        telefonoPeronsaRe);

                sucursales.get(index).getPacientes().add(NuevoPaciente);
                saveListaSucursales(sucursales); // Escribir la lista de pacientes al Json
                return true;
            }
        }

        return false;
    }

    // Crea la Cita
    public static void CrearCita(String ID, String idMedico, String fecha, String medico, List<Cita> citas) {

        Cita NuevaCita = new Cita(ID, idMedico, fecha, medico);
        citas.add(NuevaCita);

    }

    // Modifica la Cita
    public static void ModificarCita(String ID, String fecha, List<Cita> citas) {
        int index = buscarCita(ID, citas);
        citas.get(index).setFecha(fecha);
    }

    //Cancela la Cita
    public static void CancelarCita(int pos, List<Cita> citas) {

        citas.remove(pos);

    }
}
