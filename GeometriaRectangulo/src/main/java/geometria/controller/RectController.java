/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria.controller;

/**
 *
 * @author tomi1
 */

import geometria.model.Punto;
import geometria.model.Rectangulo;
import geometria.view.ConsolaView;

public class RectController {
    private final ConsolaView view;

    public RectController(ConsolaView view) { this.view = view; }

    public void demo() {
        Rectangulo r = new Rectangulo(new Punto(0,0), new Punto(4,3));
        view.imprimir(r + " area=" + r.area());

        r.escalarRespectoA(1.5);
        view.imprimir("Escalado: " + r + " area=" + r.area());

        view.imprimir("Contiene (3,2)? " + r.contiene(new Punto(3,2)));

        r.mover(2);
        view.imprimir("Movido +2 en X: " + r);

        r.moverVertical(-1);
        view.imprimir("Movido -1 en Y: " + r);
    }
}
