/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.Historia_Medica.CitaH;
import java.util.List;

/**
 *
 * @author Maximiliano
 */
public class HistoriaMedica {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<CitaH> getCitas() {
        return citas;
    }

    public void setCitas(List<CitaH> citas) {
        this.citas = citas;
    }
    private String id;
    private String nombre;
    private List<CitaH> citas;
}
