public class CuentaCorriente {
    String dni;
    String nombre;
    int sueldo;

    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = 0;
    }

    public boolean sacarDinero(int cantidad) {
        boolean sacado = false;

        if (this.sueldo >= cantidad) {
            sueldo = sueldo - cantidad;
            sacado = true;
        }
        return sacado;
    }

    public void meterDinero(int cantidad) {
        this.sueldo = this.sueldo + cantidad;
    }



    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
