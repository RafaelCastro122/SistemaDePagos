package com.mycompany.sistemadepagos;
   
    public class EmpleadoServicio extends Persona {
        private double ventasRealizadas;
        private double porcentajeBono;
        
        public EmpleadoServicio() {
        super();
        this.ventasRealizadas = 0.0;
        this.porcentajeBono = 0.0;
        }
        
        
        
        public EmpleadoServicio(String nombre, String apellido, String dpi, double salarioBase, double ventasRealizadas, double porcentajeBono) {
            super(nombre, apellido, dpi, salarioBase);
            this.ventasRealizadas = ventasRealizadas;
            this.porcentajeBono = porcentajeBono;
        }
        
        public double getVentasRealizadas() {
            return ventasRealizadas;
        }
        
        public void setVentasRealizadas(double ventasRealizadas) {
            this.ventasRealizadas = ventasRealizadas;
        }
        
        public double getPorcentajeBono() {
            return porcentajeBono;
        }
        
        public void setPorcentajeBono(double porcentajeBono) {
            this.porcentajeBono = porcentajeBono;
        }
        
        @Override
        public double pagarSalario() {
            double bono = ventasRealizadas * porcentajeBono;
            return salarioBase + bono;
        }
        
        @Override
        public String puesto() {
            return "Servicio";
        }
    }
    


    
    

