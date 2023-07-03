package dominio;

public class Persona {
    private String nombre;
    private double salario;
    private boolean eliminado;

    public Persona(String nombre, double salario, boolean eliminado){
        this.nombre = nombre;
        this.salario = salario;
        this.eliminado = eliminado;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    public String toString() {
        return "Persona [ Nombre: " + this.nombre
                + ", Sueldo: "  + this.salario + ", Eliminado: "
                + this.eliminado + " ]";

    }
}
