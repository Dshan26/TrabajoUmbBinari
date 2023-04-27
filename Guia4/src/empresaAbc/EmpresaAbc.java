package empresaAbc;

import java.util.HashMap;

public class EmpresaAbc {

    private final HashMap<String, Double> empleados;

    public EmpresaAbc() {
        empleados = new HashMap<String, Double>();
        for (int i = 0; i < 100; i++) {
            String rut = generarRutAleatorio();
            double sueldo = generarSueldoAleatorio();
            empleados.put(rut, sueldo);
        }
    }

    public void imprimirEmpleados() {
        System.out.println("Información de empleados:");
        for (String rut : empleados.keySet()) {
            double sueldo = empleados.get(rut);
            System.out.println("Rut: " + rut + ", Sueldo: " + sueldo);
        }
    }

    public void imprimirMayorYMenorSueldo() {
        double mayorSueldo = Double.MIN_VALUE;
        double menorSueldo = Double.MAX_VALUE;
        for (double sueldo : empleados.values()) {
            if (sueldo > mayorSueldo) {
                mayorSueldo = sueldo;
            }
            if (sueldo < menorSueldo) {
                menorSueldo = sueldo;
            }
        }
        System.out.println("Mayor sueldo: " + mayorSueldo);
        System.out.println("Menor sueldo: " + menorSueldo);
    }

    public void imprimirEmpleadoPorRut(String rutBuscado) {
        if (empleados.containsKey(rutBuscado)) {
            double sueldoBuscado = empleados.get(rutBuscado);
            System.out.println("Información del empleado con rut " + rutBuscado + ":");
            System.out.println("Sueldo: " + sueldoBuscado);
        } else {
            System.out.println("No se encontró ningún empleado con rut " + rutBuscado);
        }
    }

    private String generarRutAleatorio() {
        StringBuilder rut = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            rut.append((int) (Math.random() * 10));
            if (i == 1 || i == 4) {
                rut.append(".");
            }
        }
        rut.append("-");
        rut.append((int) (Math.random() * 10));
        return rut.toString();
    }

    private double generarSueldoAleatorio() {
        return 500000 + (Math.random() * 1500000);
    }
}
