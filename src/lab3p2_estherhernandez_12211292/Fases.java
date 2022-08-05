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
public class Fases extends cohetes {
    private int cfases;
    private int cmotores;
    private double altura;

    public Fases() {
        super();
    }

   

    public Fases(int cfases, int cmotores, double altura, double peso, String nombre, String serie, int potencia, double velocidad) {
        super(peso, nombre, serie, potencia, velocidad);
        this.cfases = cfases;
        this.cmotores = cmotores;
        this.altura = altura;
    }

    public int getCfases() {
        return cfases;
    }

    public void setCfases(int cfases) {
        this.cfases = cfases;
    }

    public int getCmotores() {
        return cmotores;
    }

    public void setCmotores(int cmotores) {
        this.cmotores = cmotores;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Cohete de fases{" + "cfases=" + cfases + ", cmotores=" + cmotores + ", altura=" + altura + '}'+super.toString();
    }

  
    
}

