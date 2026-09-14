package com.mycompany.sistemadepagos;

public abstract class Persona {
    public String nombre;
    public String apellido;
    public int dpi;
    public double salarioBase;
    
    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.dpi = 0;
        this.salarioBase = 0.0;
    }
    
    public Persona(String nombre, String apellido, int dpi, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.salarioBase = salarioBase;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getDpi() {
        return dpi;
    }
    
    public void setDpi(int dpi) {
        this.dpi = dpi;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract double pagarSalario();
    
    public abstract String puesto();
    
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + " " + apellido);
        System.out.println("DPI: " + dpi);
        System.out.println("Tipo: " + puesto());
        System.out.printf("Salario base: Q%.2f%n", salarioBase);
        System.out.printf("Salario final: Q%.2f%n", pagarSalario());
    }
    
    
    
    
    
}