
    //Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:
    //La cadena de caracteres tendrá una longitud máxima que se especifica en el cons-
    //tructor.
    //Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la
    //longitud máxima, es decir, exista espacio disponible.
    //Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y
    //cuando no se rebase el tamaño máximo establecido.
    //Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.
    //Cada objeto de tipo Texto tiene que conocer la fecha en la que se creó, así como la
    //fecha y hora de la última modificación efectuada.
    //Deberá existir un mét odo que muestre la información que gestiona cada texto.

public class Main {
    public static void main(String[] args) {
        int opcion;
        Texto t = null;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Crear String");
            System.out.println("2. Añadir caracter");
            System.out.println("3. Añadir String");
            System.out.println("4. Mostrar Información");
            System.out.println("5. Saber Vocales");
            System.out.println("0. Salir");

            opcion = Escaner.pedirEntero("Elige una opción: ");

            switch (opcion) {
                case 0 -> {
                    //Vacío
                }
                case 1-> {
                    t = new Texto(15,"aba");
                }
                case 2-> {
                    t.addCaracter('s',-1);
                }
                case 3-> {
                    t.addString("hola",1);
                }
                case 4-> {
                    System.out.println(t.toString());
                }
                case 5-> {
                    System.out.println("Número de vocales: " + t.saberVocales());
                }
                default -> {
                    System.out.println("Opción no disponible");
                }
            }
        }while (opcion != 0);
    }
}