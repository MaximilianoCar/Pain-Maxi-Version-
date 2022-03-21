package Modelo;

import java.util.List;

public class Paciente extends Persona {

    public List<Cita> citas;
    public List<HistoriaMedica> historia;

    public Paciente(List<Cita> citas,
            List<HistoriaMedica> historia,
            String nombre,
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
            String telefonoPeronsaRe) 
    {
        super(nombre, 
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
        this.citas = citas;
        this.historia = historia;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public List<HistoriaMedica> getHistoria() {
        return historia;
    }

    public void setHistoria(List<HistoriaMedica> historia) {
        this.historia = historia;
    }

}
