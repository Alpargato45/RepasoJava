package Empleado.Empleos;

import Empleado.Empleado;

public class Programador extends Empleado {

    private String lenguajePrincipal;
    private int proyectosCompletados;

    public Programador(String dni, String nombre, double salarioBase, String lenguajePrincipal, int proyectosCompletados) {
        super(dni, nombre, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
        this.proyectosCompletados = proyectosCompletados;
    }

    @Override
    public double calcularSalario() {
        return (super.calcularSalario()+this.proyectosCompletados*100);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "Proyectos completados: " + this.proyectosCompletados + "Lenguaje: " + this.lenguajePrincipal;
    }
}
