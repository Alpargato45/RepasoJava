
    //Diseñar la función eco () a la que se le pasa como parámetro un número n, y muestra por
    //pantalla n veces el mensaje «Eco ... ».

public class Main {

    static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("ECO");
        }
    }

    public static void main(String[] args) {
        int n;
        n = Escaner.pedirEntero("Di el número de veces que quieres escribir eco: ");
        eco(n);
    }
}