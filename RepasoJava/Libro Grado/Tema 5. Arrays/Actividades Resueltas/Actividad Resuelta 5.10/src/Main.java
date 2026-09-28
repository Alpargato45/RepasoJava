
    //Escribir la función:
    //
    //int [] eliminarMayores (int t[], int valor)
    //
    //que crea y devuelve una copia de la tabla t donde se han eliminado todos los elemen-
    //tos que son mayores que valor.

    import java.util.Arrays;

    public class Main {

    static int [] eliminarMayores (int t[], int valor) {
        int[] copia = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            if (t[i] <= valor) {
                copia[i] = t[i];
            }
        }
        return copia;
    }

    public static void main(String[] args) {
        int [] lista = new int[]{3,1,5,4,7,3,532,2,55,2,8,76,27,13,342,12,21,54,73,3,1};
        int [] listaSinMayores;
        int mayor;

        mayor = Escaner.pedirEntero("Elige el número máximo: ");
        listaSinMayores = eliminarMayores(lista,mayor);

        System.out.println(Arrays.toString(listaSinMayores));

    }
}