/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria.model;

/**
 *
 * @author tomi1
 */
public class Rectangulo {
    private Punto a; // vértice fijo
    private Punto b; // vértice opuesto

    public Rectangulo(Punto a, Punto b) {
        this.a = a; this.b = b;
    }

    public Punto getA() { return a; }
    public Punto getB() { return b; }

    public double ancho() { return Math.abs(b.x - a.x); }
    public double alto()  { return Math.abs(b.y - a.y); }
    public double area()  { return ancho() * alto(); }

    /* Escala respecto a A: B' = A + factor(B - A) */
    public void escalarRespectoA(double factor) {
        double nx = a.x + factor * (b.x - a.x);
        double ny = a.y + factor * (b.y - a.y);
        b = new Punto(nx, ny);
    }

    /** ¿El punto p queda dentro (incluye el borde)? */
    public boolean contiene(Punto p) {
        double minX = Math.min(a.x, b.x), maxX = Math.max(a.x, b.x);
        double minY = Math.min(a.y, b.y), maxY = Math.max(a.y, b.y);
        return p.x >= minX && p.x <= maxX && p.y >= minY && p.y <= maxY;
    }

    /** Mover solo en X (horizontal). */
    public void mover(double unidades) {
        a = a.trasladar(unidades, 0);
        b = b.trasladar(unidades, 0);
    }

    /** Mover solo en Y (vertical). */
    public void moverVertical(double unidades) {
        a = a.trasladar(0, unidades);
        b = b.trasladar(0, unidades);
    }

    @Override
    public String toString() {
        return "Rect[" + a.x + "," + a.y + " -> " + b.x + "," + b.y + "]";
    }
}
