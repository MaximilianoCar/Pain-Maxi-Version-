package Modelo;

public class Cita {

    private String ID;
    private String ID_Medico;
    private String fecha;
    private String Medico;

    public Cita(String ID, String ID_Medico, String fecha, String Medico) {
        this.ID = ID;
        this.ID_Medico = ID_Medico;
        this.fecha = fecha;
        this.Medico = Medico;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID_Medico() {
        return ID_Medico;
    }

    public void setID_Medico(String ID_Medico) {
        this.ID_Medico = ID_Medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getMedico() {
        return Medico;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }
      
}