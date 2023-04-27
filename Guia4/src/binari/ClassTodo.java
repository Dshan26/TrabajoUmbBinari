package binari;

public class ClassTodo implements Implements{
    @Override
    public void seleccion(int[] tabla) {
        int menor;
        int aux;

        for (int i = tabla.length - 2; i >= 0; i--) {
            menor = tabla[i];
            for (int j = i + 1; j <= tabla.length - 1; j++)
                if (tabla[j] < menor) {
                    aux = tabla[j];
                    tabla[j] = menor;
                    menor = aux;
                }
            tabla[i] = menor;
        }
    }

    @Override
    public int busquedaBinaria(int[] Arreglo, int elemento) {
        int i = 0, centro=0, inferior = 0, superior = Arreglo.length - 1,posicion=0;
        while (inferior <= superior) {
            centro = (superior + inferior) / 2;
            if (Arreglo[centro] == elemento) {
                return centro;
            } else if (Arreglo[centro] > elemento) {
                superior = centro - 1;
            } else {
                inferior = centro + 1;
            }
        }
        return -1;
    }
}
