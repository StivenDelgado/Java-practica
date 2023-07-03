package test;

import domain.Persona;
public class PruebaPersona2 { 
    private int contador = 10;
    public static void main(String[] args) {
        //Primer objeto
        Persona persona2 = new Persona("Stiven");
       // System.out.println("persona2 = " + persona2);

        //Segundo objeto
        Persona persona3 = new Persona("Alejopta");
       // System.out.println("persona3 = " + persona3);

        //Tercer objeto
        Persona persona4 = new Persona("Manuel");
       // System.out.println("persona4 = " + persona4);

        //Imprimir objetos con el metodo imprimir
        imprimir(persona2);
        imprimir(persona3);
        imprimir(persona4);
    }
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    public int getContador(){

        imprimir(new Persona("Carlos"));
       return this.contador= 20;
    }
}