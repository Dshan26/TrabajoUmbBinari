package binari;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BusquedaBinaria {

    public static void main(String[] args) {
        ClassTodo classTodo = new ClassTodo();
        Random random = new Random();
        Scanner Leer = new Scanner(System.in);
        System.out.print("Por favor ingrese el tamaño del arreglo: ");
        int tamanovector = Leer.nextInt();
        int[] Arreglo = new int[tamanovector];

        for(int j=0; j< Arreglo.length; j++){
            Arreglo[j]= 1 + random.nextInt(100000);

        }

        classTodo.seleccion(Arreglo);
        System.out.println("Números");
        for(int i=0; i< Arreglo.length; i++){
            System.out.println("["+ i +"]:"+Arreglo[i]);
        }

        System.out.print("\nElemento a buscar: ");
        int elemento = Leer.nextInt();
        long inicioEjecucion = System.nanoTime();
        int posicion = classTodo.busquedaBinaria(Arreglo, elemento);

        if (posicion == 1) {
            System.out.println("\nElemento no encontrado");
        } else {
            System.out.println("\nElemento " + elemento + " encontrado en la posición " + posicion);
        }
        long finEjecucion = System.nanoTime();
        System.out.println("tiempo en nanosegundos:" + (finEjecucion - inicioEjecucion));

    }
}
