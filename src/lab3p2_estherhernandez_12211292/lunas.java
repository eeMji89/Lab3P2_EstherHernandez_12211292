/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_estherhernandez_12211292;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class lunas {
    private String nombre;
    private int cantC;

    public lunas() {
    }

    public lunas(String nombre, int cantC) {
        this.nombre = nombre;
        this.cantC = cantC;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantC() {
        return cantC;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantC(int cantC) {
        this.cantC = cantC;
    }

    @Override
    public String toString() {
        return "lunas{" + "nombre=" + nombre + ", cantC=" + cantC + '}';
    }
    
}
