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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    private String ID;
    private String ID_Medico;
    private String fecha;
    
         
    
}
//                    "peso": "80",
//                    "talla": "85",
//                    "pesoTalla": "0.9",
//                    "tension": {
//                      "maxima": "200",
//                      "minima": "180"