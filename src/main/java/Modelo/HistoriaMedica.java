package Modelo;

import Vista.Historia_Medica.CitaH;
import java.util.List;

public class HistoriaMedica {

    private String id;
    private String paciente;
    private List<CitaH> citas;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPacientee() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public List<CitaH> getCitas() {
        return citas;
    }

    public void setCitas(List<CitaH> citas) {
        this.citas = citas;
    }
}
