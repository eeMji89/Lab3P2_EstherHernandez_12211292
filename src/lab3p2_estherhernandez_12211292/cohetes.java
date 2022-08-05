/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_estherhernandez_12211292;

import java.util.ArrayList;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class cohetes {
    private double peso;
    private String nombre;
    private String serie;
    private int potencia;
    private double velocidad;
    ArrayList <Personas>personas = new ArrayList();


    public cohetes() {
    }

    public cohetes(double peso, String nombre, String serie, int potencia, double velocidad) {
        this.peso = peso;
        this.nombre = nombre;
        this.serie = serie;
        this.potencia = potencia;
        this.velocidad = velocidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "cohetes{" + "peso=" + peso + ", nombre=" + nombre + ", serie=" + serie + ", potencia=" + potencia + ", velocidad=" + velocidad + ", personas=" + personas + '}';
    }

    
    
}
