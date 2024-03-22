/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.unam.fi.poo;

/**
 *
 * @author Fernanda ORdoñez
 * @version 21/03/2024
 */


public class Persona {
    private String nombre;
    private int edad;
    private String color;
    
    /**
     * Constructor vacio que inicializa en cero
     */
    public Persona(){
        
    }
    
    /**
     * Constructor lleno
     * @param nombre Nombre de la persona
     * @param edad Edad de la persona
     * @param color Color de ojos de la persona
     */
    public Persona(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    
    /**
     * Regresa el nombre de una persona
     * @return variable nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Regresa la edad de una persona
     * @return variable edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Regresa el color de ojos de una persona
     * @return 
     */
    public String getColor() {
        return color;
    }
    /**
     * 
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Metodo que indica que esta comiendo una persona
     * @param comida la comida que la persona esta comiendo
     * @return la cadena con la comida que la persona come
     */
    public String comer(String comida){
        return "Estoy comiendo" + comida;
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", color=" + color + '}';
    }
    
    
    
}
