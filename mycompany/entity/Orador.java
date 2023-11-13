package com.mycompany.entity;

/**
 *
 * @author Nicolas
 */
public class Orador {
    
    //Definimos variables
    private Long id;
    private String nombre;
    private String apellido;
    private String tema;
    
    //Constructor
    public Orador(Long id, String nombre, String apellido, String tema) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tema = tema;
    }
    
    public Orador(String nom, String ape) {
        nombre = nom;
        apellido = ape;
    }
    
    public Orador(){}
    
    //Métodos
    public void exponerCharla() {
        System.out.println("Hola soy Bill Gates y voy a hablar del nuevo orden mundial.");
    }

    public String saludar() {
        String uno = "Hola";
        int numero = 2;
        
        return String.valueOf(numero);
    }
    
    public void inscribirseEnLaConferencia() {
        System.out.println("Datos Ingresados y validados.");
    }
    /*
    @Override
    public String toString() {
        return "Orador{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", tema=" + tema + '}';
    }
    
*/

    @Override
    public String toString() {
        return "Orador{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", tema=" + tema + '}';
    }

}
