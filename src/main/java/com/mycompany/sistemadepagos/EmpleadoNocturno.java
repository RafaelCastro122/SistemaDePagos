package com.mycompany.sistemadepagos;

public class EmpleadoNocturno extends Persona {
        private int horasNocturnas;
        private double bonoHoraNocturna;
        
        public EmpleadoNocturno() {
        super();
        this.horasNocturnas = 0;
        this.bonoHoraNocturna = 0.0;
}
        
        public EmpleadoNocturno(String nombre, String apellido, String dpi, double salarioBase, int horasNocturnas, double bonoHoraNocturna) {
            super(nombre, apellido, dpi, salarioBase);
            this.horasNocturnas = horasNocturnas;
            this.bonoHoraNocturna = bonoHoraNocturna;
        }
        
        public int getHorasNocturnas() {
            return horasNocturnas;
        }
        
        public void setHorasNocturnas(int horasNocturnas) {
            this.horasNocturnas = horasNocturnas;
        }
        
        public double getBonoHoraNocturna() {
            return bonoHoraNocturna;
        }
        
        public void setBonoHoraNocturna(double bonoHoraNocturna) {
            this.bonoHoraNocturna = bonoHoraNocturna;
        }
        
        @Override
        public double pagarSalario() {
            double bono = horasNocturnas * bonoHoraNocturna;
            return salarioBase + bono;
        }
        
        @Override
        public String puesto() {
            return "Nocturno";
        }
    }
