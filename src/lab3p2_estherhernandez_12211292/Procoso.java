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
public class Procoso extends Planetas{
   
    private double densidad;
    private String vida;

    public Procoso() {
        super();
    }

    public Procoso(double densidad, String vida, String nombre, double masa, double radio, int temperatura, double velocidad) {
        super(nombre, masa, radio, temperatura, velocidad);
        this.densidad = densidad;
        this.vida = vida;
    }
    
    
    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public String isVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Planeta rocoso{" + "densidad=" + densidad + ", vida=" + vida + '}'+ super.toString();
    }
    

    
    
}
