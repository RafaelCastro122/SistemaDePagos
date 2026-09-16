package com.mycompany.sistemadepagos;

        public class EmpleadoAdministrativo extends Persona {
        private int horasExtra;
        private double valorHoraExtra;
        
        public EmpleadoAdministrativo() {
        super();
        this.horasExtra = 0;
        this.valorHoraExtra = 0.0;
}
        
        public EmpleadoAdministrativo(String nombre, String apellido, String dpi, double salarioBase, int horasExtra, double valorHoraExtra) {
            super(nombre, apellido, dpi, salarioBase);
            this.horasExtra = horasExtra;
            this.valorHoraExtra = valorHoraExtra;
        }
        
        public int getHorasExtra() {
            return horasExtra;
        }
        
        public void setHorasExtra(int horasExtra) {
            this.horasExtra = horasExtra;
        }
        
        public double getValorHoraExtra() {
            return valorHoraExtra;
        }
        
        public void setValorHoraExtra(double valorHoraExtra) {
            this.valorHoraExtra = valorHoraExtra;
        }
        
        @Override
        public double pagarSalario() {
            return salarioBase + (horasExtra * valorHoraExtra);
        }
        
        @Override
        public String puesto() {
            return "Administrativo";
        }
    }
 

    
    