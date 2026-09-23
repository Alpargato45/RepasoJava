
    //Escribir una aplicación que pida el año actual y el de nacimiento del usuario. Deber calcular
    //su edad; suponiendo que en el año en curso el usuario ya ha cumplido años.

public class Main {
    public static void main(String[] args) {

        int anioActual = 0;
        int anioNacimiento = 0;
        int edad = 0;

        anioActual = Escaner.pedirEntero("Introduzca el año actual: ");
        anioNacimiento = Escaner.pedirEntero("Introduzca su año de Nacimiento: ");

        if (anioNacimiento > anioActual) {
            System.out.println("No es posible calcular su edad.");
        }else {
            edad = anioActual - anioNacimiento;
            System.out.printf("Su edad es: " + edad + " años");
        }
    }
}