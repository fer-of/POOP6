/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.unam.fi.poo;

/**
 * Programa que inicializa una persona e idica que esta comiendo
 * @author Fernanda ORsoñez
 */
public class POOP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        Persona persona = new  Persona("Emmanuel", 15, "verde");
        System.out.println(persona);
        System.out.println(persona.comer("platanos"));
    }
    
}
