
    //Crear una tabla de longitud 10 que se inicializará con números aleatorios comprendidos en-
    //tre 1 y 100. Mostrar la suma de todos los números aleatorios que se guardan en la tabla.

public class Main {
    public static void main(String[] args) {
        int[] lista = new int[10];
        int suma = 0;

        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 100) + 1;
            System.out.println("Valor de la posición " + i + ": " + lista[i]);
            suma = suma + lista[i];
        }
        System.out.println("Valor de la suma: " + suma);
    }
}