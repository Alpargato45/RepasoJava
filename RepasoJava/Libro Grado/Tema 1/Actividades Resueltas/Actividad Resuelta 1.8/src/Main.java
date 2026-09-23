
//Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad
//Mediante un literal booleano

public class Main {
    public static void main(String[] args) {
        boolean mayorEdad = false;
        int edad;

        edad = Escaner.pedirEntero("Introduzca su edad: ");

        if (edad>=18) {
            mayorEdad = true;
            System.out.println(mayorEdad);
        }else {
            System.out.println(mayorEdad);
        }
    }
}