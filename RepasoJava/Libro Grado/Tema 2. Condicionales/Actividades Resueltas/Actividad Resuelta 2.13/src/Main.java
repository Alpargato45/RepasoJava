
    //Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos.
    //El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
    //hora actual [10:41:59] -> hora actual +1 segundo: [10:42:00]

public class Main {
    public static void main(String[] args) {
        int hora;
        int min;
        int seg;

        hora = Escaner.pedirEntero("Introduzca la hora: ");
        min = Escaner.pedirEntero("Introduzca los minutos: ");
        seg = Escaner.pedirEntero("Introduzca los segundos: ");

        seg++;
        if (seg > 59) {
            seg = 0;
            min++;
        }
        if (min > 59) {
            min = 0;
            hora++;
        }
        if (hora > 23) {
            hora = 0;
        }
        System.out.println("La hora es: " + hora + ":" + min + ":" + seg);
    }
}