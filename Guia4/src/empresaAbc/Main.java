package empresaAbc;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpresaAbc cinamex = new EmpresaAbc();
        System.out.println("\n\t\tEmpresa de software ABC\n");

        int opcion = 0;

        do {
            System.out.println("""
                    Menu:
                    1.Imprimir informacion de empleados
                    2.imprimir mayor y menor sueldo
                    3.Buscar empleado por rut
                    4.Salir
                    Opcion:""");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer de entrada

            switch (opcion) {
                case 1 -> cinamex.imprimirEmpleados();
                case 2 -> cinamex.imprimirMayorYMenorSueldo();
                case 3 -> {
                    System.out.print("Ingrese el rut del empleado: ");
                    String rutBuscado = sc.nextLine();
                    cinamex.imprimirEmpleadoPorRut(rutBuscado);
                }
                case 4 -> System.out.println("Has salidos de la aplicacion");
            }
            opcion++;
        }while (true) ;

    }
}
