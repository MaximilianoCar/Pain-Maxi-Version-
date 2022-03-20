/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cita;
import Modelo.Paciente;
import Modelo.Persona;

/**
 *
 * @author Maximiliano
 */
public class Ctrl_Cita {
    
    public static Boolean RegistrarPaciente (String nombre,
                                   String apellido,
                                   String CI,
                                   String sexo,
                                   String fechaNacimiento,
                                   String lugarNacimiento,
                                   String estadoCivil,
                                   String direccion,
                                   String telefono,
                                   String telefonoPeronsaRe,
                                   String profeson,
                                   String ocupacion)
    {
        
        if (true) // validacion de datos
        {
            Persona NuevoPaciente = new Persona();
            NuevoPaciente.setNombre(nombre);
            NuevoPaciente.setApellido(apellido);
            NuevoPaciente.setCI(CI);
            NuevoPaciente.setSexo(sexo);
            NuevoPaciente.setFecha_De_Nacimiento(fechaNacimiento);
            NuevoPaciente.setLugar_De_Nacimiento(lugarNacimiento);
            NuevoPaciente.setEstado_Civil(estadoCivil);
            NuevoPaciente.setDireccion_De_HAbitacion(direccion);
            NuevoPaciente.setTelefono(telefono);
            NuevoPaciente.setNumero_Familiar(lugarNacimiento);
            NuevoPaciente.setProfesion(profeson);
            NuevoPaciente.setOcupacion(ocupacion);
            
            Paciente NuevoPacienteToJson = new Paciente();
            NuevoPacienteToJson.setNombre(nombre);
            NuevoPacienteToJson.setCI(CI);
            //Ahora colocar el paciente ne el Json
        }else
        {
            return false;
        }
        
       
        
        
        return null;  
    }
    
    public static Boolean CrearCita(String fecha, String medico, String sucursal, String paciente)
    {
        
        if (true)
        {
            String idMedico = medico; //conseguir la id
            Cita NuevaCita = new Cita();
            NuevaCita.setFecha(fecha);
            NuevaCita.setID_Medico(idMedico); //revisar esto
            
            //pusehar la cita a la lista de cita del paciente
        }
        
        
        
        return null;
        
    }
    
    public static Boolean EncontrarCita(String cita)
    {
        if (true) // se encontro la cita yei yei yei
        {
            return true;
        }else
        {
            return false;
        }
    }
    
    public static Boolean ModificarCita(String cita)
    {
        if (true) // fecha valida
        {
            return true; //cambiar fecha xd
        }else
        {
            return false;
        }
    }
    
    public static Boolean CancelarCita(String cita)
    {
        if (true) // se encontro la cita yei yei yei
        {
            //eliminar cita, haciendo que la anterior cita apunte a null y borralo o si es primero pos eso hacer first = NULL
            return true;
        }else
        {
            return false;
        }
    }

//    public static void RegistrarPaciente() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

   
    
    
}
