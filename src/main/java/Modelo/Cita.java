/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Maximiliano
 */
public class Cita {

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

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public float getPesoTalla() {
        return pesoTalla;
    }

    public void setPesoTalla(float pesoTalla) {
        this.pesoTalla = pesoTalla;
    }

    public int getTension_Maxima() {
        return tension_Maxima;
    }

    public void setTension_Maxima(int tension_Maxima) {
        this.tension_Maxima = tension_Maxima;
    }

    public int getTension_Minima() {
        return tension_Minima;
    }

    public void setTension_Minima(int tension_Minima) {
        this.tension_Minima = tension_Minima;
    }

    public int getPulso() {
        return pulso;
    }

    public void setPulso(int pulso) {
        this.pulso = pulso;
    }
    private String ID;
    private String ID_Medico;
    private int fecha;
    private int peso;
    private int talla;
    private float pesoTalla;
    private int tension_Maxima;
    private int tension_Minima;
    private int pulso;
         
    
}
//                    "peso": "80",
//                    "talla": "85",
//                    "pesoTalla": "0.9",
//                    "tension": {
//                      "maxima": "200",
//                      "minima": "180"