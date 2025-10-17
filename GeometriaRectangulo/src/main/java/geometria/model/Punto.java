/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria.model;

/**
 *
 * @author tomi1
 */
public class Punto {
    public final double x;
    public final double y;
    public Punto(double x, double y) { this.x = x; this.y = y; }
    public Punto trasladar(double dx, double dy) { return new Punto(x + dx, y + dy); }
}
