/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author nicolas_ale.diaz
 */
public class Persona {

    private String nombre;

    private int edad;

    private String id;

    public Persona() {
    }

    public Persona(String nombre, String id, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + "," + id + "," + edad;
    }

}
