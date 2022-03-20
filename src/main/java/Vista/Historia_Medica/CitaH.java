/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Historia_Medica;

/**
 *
 * @author Maximiliano
 */
public class CitaH {
    public class Valores
    {
        private String peso;
        private String talla;
        private String pesoTalla;

        public String getPeso() {
            return peso;
        }

        public void setPeso(String peso) {
            this.peso = peso;
        }

        public String getTalla() {
            return talla;
        }

        public void setTalla(String talla) {
            this.talla = talla;
        }

        public String getPesoTalla() {
            return pesoTalla;
        }

        public void setPesoTalla(String pesoTalla) {
            this.pesoTalla = pesoTalla;
        }
    }
    
    public class Tension 
    {

        public String getMaxima() {
            return maxima;
        }

        public void setMaxima(String maxima) {
            this.maxima = maxima;
        }

        public String getMinima() {
            return minima;
        }

        public void setMinima(String minima) {
            this.minima = minima;
        }
        private String maxima;
        private String minima;
    }

    public String getCita() {
        return Cita;
    }

    public void setCita(String Cita) {
        this.Cita = Cita;
    }

    public String getPulso() {
        return pulso;
    }

    public void setPulso(String pulso) {
        this.pulso = pulso;
    }
    
    private String Cita;
    private Valores Valores;
    private Tension Tension;
    private String pulso;
}
