
    //Diseñar la función: int maximo (int t []), que devuelva el máximo valor contenido en
    //la tabla t.

public class Main {

    static int mayorLista(int[] lista) {
        int m = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > m) {
                m = lista[i];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int [] lista = new int[]{4, 3, 55, 23, 1};
        int max;

        max = mayorLista(lista);
        System.out.println("El número más grande de la tabla es: " + max);
    }
}