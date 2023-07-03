package test;

import dominio.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        // toString
        System.out.println("persona1.toString() = " + persona1.toString());
        //cambio de nombre con set
        persona1.setNombre("Edilberto");
        //recolecta cada valor de cada una con el metodo get
        System.out.println("persona1.getNombre() con set = " + persona1.getNombre());
        System.out.println("persona1.getSalario() = " + persona1.getSalario());
        System.out.println("persona1.isEliminado() = " + persona1.isEliminado());

        // imprime todos los datos juntos con toString
        System.out.println("persona1.toString() = " + persona1.toString());
    }
}
