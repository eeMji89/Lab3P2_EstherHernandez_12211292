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
public class CSolido extends cohetes {
    private double kilos;
    private String material;

    public CSolido() {
        super();
    }

    public CSolido(double kilos, String material) {
        this.kilos = kilos;
        this.material = material;
    }

    public CSolido(double kilos, String material, double peso, String nombre, String serie, int potencia, double velocidad) {
        super(peso, nombre, serie, potencia, velocidad);
        this.kilos = kilos;
        this.material = material;
    }
    

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    

    public double getKilos() {
        return kilos;
    }

    public String getMaterial() {
        return material;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cohete de Combustible Solido{" + "kilos=" + kilos + ", material=" + material + '}'+super.toString();
    }
    
}
