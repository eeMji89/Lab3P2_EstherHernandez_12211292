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
public class Planetas {
     private String nombre;
    private double masa;
    private double radio;
    private int temperatura;
    private double velocidad;
    private ArrayList<lunas> Lunas = new ArrayList();
    

    public Planetas() {
    }

    public Planetas(String nombre, double masa, double radio, int temperatura, double velocidad) {
        this.nombre = nombre;
        this.masa = masa;
        this.radio = radio;
        this.temperatura = temperatura;
        this.velocidad = velocidad;
       
    }


    public String getNombre() {
        return nombre;
    }

    public double getMasa() {
        return masa;
    }

    public double getRadio() {
        return radio;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public ArrayList<lunas> getLunas() {
        return Lunas;
    }

   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setLunas(ArrayList<lunas> Lunas) {
        this.Lunas = Lunas;
    }

   
}
