package com.mycompany.sistemadepagos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaDePagos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Persona[] empleados = new Persona[3];
        
        System.out.println("**************************************");
        System.out.println("         SISTEMA DE EMPLEADOS");
        System.out.println("**************************************\n");
        
        for (int i = 0; i < empleados.length; i++) {
            try {
                System.out.println("INGRESO DE DATOS - EMPLEADO " + (i + 1));
                
                System.out.println("Seleccione el tipo de empleado:");
                System.out.println("1. Empleado Administrativo");
                System.out.println("2. Empleado de Servicio");
                System.out.println("3. Empleado Nocturno");
                System.out.print("Opcion: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); 
                
                if (opcion < 1 || opcion > 3) {
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    i--; 
                    continue;
                }
                
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                
                System.out.print("Apellido: ");
                String apellido = scanner.nextLine();
                
                System.out.print("DPI: ");
                String dpi = scanner.nextLine();
                
                double salarioBase;
                do {
                    System.out.print("Salario base (mayor a 0): ");
                    salarioBase = scanner.nextDouble();

                    if (salarioBase <= 0) {
                        System.out.println("Error: El salario base debe ser mayor a cero. Intente de nuevo.");
                    }
                } while (salarioBase <= 0);
                
                if (opcion == 1) {
                    System.out.print("Horas extras: ");
                    int horasExtras = scanner.nextInt();
                    System.out.print("Pago por hora extra: ");
                    double pagoHoraExtra = scanner.nextDouble();
                    
                    empleados[i] = new EmpleadoAdministrativo(nombre, apellido, dpi, salarioBase, horasExtras, pagoHoraExtra);
                    
                } else if (opcion == 2) {
                    System.out.print("Ventas realizadas: ");
                    double ventasRealizadas = scanner.nextDouble();
                    System.out.print("Porcentaje de comision (ejemplo 0.05): ");
                    double porcentajeComision = scanner.nextDouble();
                    
                    empleados[i] = new EmpleadoServicio(nombre, apellido, dpi, salarioBase, ventasRealizadas, porcentajeComision);
                    
                } else if (opcion == 3) {
                    System.out.print("Horas nocturnas: ");
                    int horasNocturnas = scanner.nextInt();
                    System.out.print("Pago por hora nocturna: ");
                    double pagoHoraNocturna = scanner.nextDouble();
                    
                    empleados[i] = new EmpleadoNocturno(nombre, apellido, dpi, salarioBase, horasNocturnas, pagoHoraNocturna);
                }
                
                scanner.nextLine(); 
                System.out.println();
                
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingreso un tipo de dato invalido. Intente de nuevo.\n");
                scanner.nextLine(); 
                i--; 
            }
        }
        
        System.out.println("**************************************");
        System.out.println("       RESUMEN DE EMPLEADOS");
        System.out.println("**************************************\n");
        
        for (Persona empleado : empleados) {
            empleado.mostrarInformacion();
            System.out.println();
        }
        
        scanner.close();
    }
}