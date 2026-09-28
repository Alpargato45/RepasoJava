import java.time.LocalDate;
import java.time.LocalDateTime;

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

public class Texto {

    private final int longMax;
    private String string;
    LocalDate creacion;
    LocalDateTime ultimaMod;

    public Texto(int longMax, String string) {
        this.longMax = longMax;
        this.string = string;
        this.creacion = LocalDate.now();
        this.ultimaMod = null;
    }

    public boolean addCaracter(char c,int pos) {
        boolean added;

        if (this.string.length()<longMax) {
            if (pos == -1) {
                this.string = c + this.string;
                added = true;
                this.ultimaMod = LocalDateTime.now();
            }else if (pos == 1) {
                this.string = this.string + c;
                added = true;
                this.ultimaMod = LocalDateTime.now();
            }else {
                added = false;
            }
        }else {
            added = false;
        }
        return added;
    }

    public boolean addString(String s,int pos) {
        boolean added;

        if ((this.string.length()+s.length())<=longMax) {
            if (pos == -1) {
                this.string = s + this.string;
                added = true;
                this.ultimaMod = LocalDateTime.now();
            }else if (pos == 1) {
                this.string = this.string + s;
                added = true;
                this.ultimaMod = LocalDateTime.now();
            }else {
                added = false;
            }
        }else {
            added = false;
        }
        return added;
    }

    public int saberVocales() {
        int cont = 0;
        String listaVocales = "aeiouáéíóú";

        for (int i = 0; i < this.string.length(); i++) {
            for (int j = 0; j < listaVocales.length(); j++) {
                if (this.string.charAt(i) == listaVocales.charAt(j) || this.string.charAt(i) == listaVocales.toUpperCase().charAt(j)) {
                    cont++;
                }
            }
        }
        return cont;
    }

    @Override
    public String toString() {
        return "Texto{" +
                "longMax=" + longMax +
                ", string='" + string + '\'' +
                ", Creación=" + creacion +
                ", Última Modificación=" + ultimaMod +
                '}';
    }
}
