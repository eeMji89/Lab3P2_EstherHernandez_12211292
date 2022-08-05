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
public class Cliquido extends cohetes {
    private double litro;

    public Cliquido() {
        super();
    }

    public Cliquido(double litro) {
        this.litro = litro;
    }

    public Cliquido(double litro, double peso, String nombre, String serie, int potencia, double velocidad) {
        super(peso, nombre, serie, potencia, velocidad);
        this.litro = litro;
    }

    public double getLitro() {
        return litro;
    }

    public void setLitro(double litro) {
        this.litro = litro;
    }

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Cliquido{" + "litro=" + litro + '}';
    }

    
    
}
