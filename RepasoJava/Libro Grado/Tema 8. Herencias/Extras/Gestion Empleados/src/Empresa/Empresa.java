package Empresa;
import Empleado.Empleado;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public Empleado buscarEmpleado(String dni) {
        for (Empleado e: empleados) {
            if (e.getDni().equals(dni)) {
                return e;
            }
        }
        return null;
    }

    public void eliminarEmpleado(String dni) {
        int pos = 0;
        for (int i = 0; i < this.empleados.size(); i++) {
            if (empleados.get(i).getDni().equals(dni)) {
                pos = i;
            }
        }
        empleados.remove(pos);
    }

    public String mostrarEmpleados() {
        StringBuilder devolver = new StringBuilder();
        for (Empleado e: empleados) {
            devolver.append(e.mostrarInformacion()).append("\n");
        }
        return devolver.toString();
    }

    public double calcularCosteTotal() {
        double total = 0.0;
        for (Empleado e: empleados) {
            total += e.calcularSalario();
        }
        return total;
    }
}
