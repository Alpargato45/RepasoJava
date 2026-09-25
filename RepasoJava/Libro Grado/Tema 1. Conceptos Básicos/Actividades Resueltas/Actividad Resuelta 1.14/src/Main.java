
//Realizar un programa que pida como entrada un número decimal y lo muestre redondeado al entero más próximo

public class Main {
    public static void main(String[] args) {
        double numero;

        numero = Escaner.pedirDouble("Introduzca un número decimal");
        numero = (int) (numero + 0.5);
        System.out.println("Este es tu número redondeado: " + numero);
    }
}