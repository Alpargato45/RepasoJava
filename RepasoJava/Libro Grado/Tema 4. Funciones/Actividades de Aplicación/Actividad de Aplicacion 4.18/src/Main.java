
    //Crea una función que muestre por consola una serie de números aleatorios enteros. Los
    //parámetros de la función serán: la cantidad de números aleatorios que se mostrarán y los
    //valores mínimos y máximos que estos pueden tomar.

public class Main {

    static void numAleatorio(int cant, int min, int max) {
        int n;
        for (int i = 0; i < cant; i++) {
            n = (int) (Math.random() * (max-min + 1)) + min;
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int cantidad;
        int num1;
        int num2;

        cantidad = Escaner.pedirEntero("Cantidad de números aleatorios: ");
        num1 = Escaner.pedirEntero("Número aleatorio mínimo: ");
        do {
            num2 = Escaner.pedirEntero("Número aleatorio máximo: ");
            if (num1>num2) {
                System.out.println("El número máximo no puede ser igual o más pequeño que el mínimo.");
            }
        }while (num1>=num2);

        numAleatorio(cantidad,num1,num2);
    }
}