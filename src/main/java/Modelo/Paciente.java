/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Maximiliano
 */
public class Paciente  {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
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
    private String nombre;
    private String CI;
    public List<Cita> citas;
    public List<HistoriaMedica> historia;
    
}
