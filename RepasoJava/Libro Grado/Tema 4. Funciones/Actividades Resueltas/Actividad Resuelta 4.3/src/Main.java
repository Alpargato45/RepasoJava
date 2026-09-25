
    //Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se
    //especifique. Para distinguir un caso de otro se le pasará como opción un número: 1 (para
    //el área) o 2 (para el volumen). Además, hay que pasarle a la función el radio de la base
    //y la altura.
    //
    //Área = 2TT · radio · (altura + radio)
    //volumen = TT · radio2 · altura

public class Main {

    public static double pi = 3.14;

    static void areaVolumen(int opcion,int altura, int radio) {
        if (opcion == 1) {
            double area;
            area = 2*pi * radio * (altura*radio);
            System.out.println("Area del cilindro: " + area);
        }else if (opcion == 2){
            double volumen;
            volumen = pi * Math.pow(radio,2) * altura;
            System.out.println("Volumen del cilindro: " + volumen);
        }
    }

    public static void main(String[] args) {
        int opcion;
        int radio;
        int altura;
        do {
            opcion = Escaner.pedirEntero("1. Calcular área, 2.Calcular Volumen: ");
        }while (opcion < 1 || opcion > 2);
        radio = Escaner.pedirEntero("Altura del cilindro: ");
        altura = Escaner.pedirEntero("Radio del cilindro: ");

        areaVolumen(opcion,altura,radio);
    }
}