
    //Código de ejemplo para un menú

public class Main {
    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Opción");
            System.out.println("2. Opción");
            System.out.println("3. Opción");
            System.out.println("4. Opción");
            System.out.println("0. Salir");

            opcion = Escaner.pedirEntero("Elige una opción: ");

            switch (opcion) {
                case 0 -> {
                    //Vacío
                }
                case 1-> {
                    System.out.println("Ha elegido opción 1");
                }
                case 2-> {
                    System.out.println("Ha elegido opción 2");
                }
                case 3-> {
                    System.out.println("Ha elegido opción 3");
                }
                case 4-> {
                    System.out.println("Ha elegido opción 4");
                }
                default -> {
                    System.out.println("Opción no disponible");
                }
            }
        }while (opcion != 0);
    }
}