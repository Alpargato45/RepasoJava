
    //Escribir la función int [] rellenaPares (int longitud, int fin), que crea y devuelve
    //una tabla ordenada de la longitud especificada, que se encuentra rellena con números pa-
    //res aleatorios comprendidos en el rango desde 2 hasta fin (inclusive).

    import java.util.Arrays;

    public class Main {

    static int [] rellenaPares (int longitud, int fin) {
        int [] pares = new int[longitud];
        for (int i = 0; i < pares.length; i++) {
            int n;
            do {
                n = (int) (Math.random() *(fin-2)) +2;
            }while (n % 2 != 0);
            pares[i] = n;
        }
        Arrays.sort(pares);
        return pares;
    }

    public static void main(String[] args) {
        int [] lista;
        int longitud;
        int max;

        longitud = Escaner.pedirEntero("Longitud de la tabla: ");
        max = Escaner.pedirEntero("Valor máximo de la tabla: ");

        lista = rellenaPares(longitud,max);

        System.out.println(Arrays.toString(lista));

    }
}