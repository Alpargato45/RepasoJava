
//Pedir al usuario su edad y mostrar la que tendrá el próximo año

public class Main {

    public static void main(String[] args) {
        int edad = 0;

        System.out.println("Introduzca su edad: ");
        edad = Escaner.pedirEntero("Edad del usuario actualmente: ");
        edad = edad + 1;
        System.out.println("Su edad el próximo año será: " + edad + " años.");
    }
}