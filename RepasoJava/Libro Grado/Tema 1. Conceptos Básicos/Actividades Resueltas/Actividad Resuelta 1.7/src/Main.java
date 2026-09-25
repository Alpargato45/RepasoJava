
    //Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello, el usuario
    //debe introducir el radio (que puede contener decimales).
    //Longitud =2pi * radio
    //Área = pi * radio*radio


    import static java.lang.Math.pow;

    public class Main {

    public static double pi = 3.14;

    public static void main(String[] args) {
       double radio;
       double longitud;
       double area;

       radio = Escaner.pedirDouble("Introduzca el radio de la circunferencia: ");

       longitud = (double) 2*pi*radio;
       area = pi * pow(radio,2);

        System.out.println("La longitud es: " + longitud + " y el area es: " + area);
    }
}