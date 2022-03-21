package Vista.Historia_Medica;

public class CitaH {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public class Valores {

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

        public class Tension {

            private String maxima;
            private String minima;

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
        }

        private String pulso;

        public String getPulso() {
            return pulso;
        }

        public void setPulso(String pulso) {
            this.pulso = pulso;
        }
    }
}
