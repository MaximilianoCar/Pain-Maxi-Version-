package Modelo;

public class Medico extends Persona {

    private String id;
    private String especialidad;

    public Medico(String id,
            String especialidad,
            String nombre,
            String apellido,
            String CI,
            String sexo,
            String Fecha_De_Nacimiento,
            String Lugar_De_Nacimiento,
            String Estado_Civil,
            String Direccion_De_HAbitacion,
            String telefono) 
    {
        super(nombre,
                apellido,
                CI,
                sexo,
                Fecha_De_Nacimiento,
                Lugar_De_Nacimiento,
                Estado_Civil,
                Direccion_De_HAbitacion,
                telefono);
        this.id = id;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
