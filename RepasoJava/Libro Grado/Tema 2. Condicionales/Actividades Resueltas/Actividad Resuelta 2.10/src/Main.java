
    //Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4),
    //suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).

public class Main {
    public static void main(String[] args) {
        int nota;

        do {
            nota = Escaner.pedirEntero("Di una nota del 0 al 10: ");
            if (nota < 0 || nota > 10) {
                System.out.println("Por favor, elige una nota entre 0 y 10");
            }
        }while (nota < 0 || nota > 10);

        switch (nota) {
            case 0,1,2,3,4 -> {
                System.out.println("Insuficiente");
            }
            case 5 -> {
                System.out.println("Suficiente");
            }
            case 6 -> {
                System.out.println("Bien");
            }
            case 7,8 -> {
                System.out.println("Notable");
            }
            case 9,10 -> {
                System.out.println("Sobresaliente");
            }
        }
    }
}