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
public class Pgaseoso extends Planetas{
    private double presion;
    private int cantA;

    public Pgaseoso() {
        super();
    }
    
    

    public Pgaseoso(double presion, int cantA, String nombre, double masa, double radio, int temperatura, double velocidad) {
        super(nombre, masa, radio, temperatura, velocidad);
        this.presion = presion;
        this.cantA = cantA;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public int getCantA() {
        return cantA;
    }

    public void setCantA(int cantA) {
        this.cantA = cantA;
    }

    @Override
    public String toString() {
        return "Pgaseoso{" + "presion=" + presion + ", cantA=" + cantA + '}'+super.toString();
    }

    
}
