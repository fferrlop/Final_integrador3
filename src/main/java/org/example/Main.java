package org.example;

import Organismos.Abeja;
import Organismos.Flor;
import Organismos.Lagarto;
import Organismos.Posicion;
import Organismos.Halcón;


public class Main {
    public static void main(String[] args) {

        Abeja abeja = new Abeja(new Posicion(0, 0), 100, 1, true);
        Halcón halcon = new Halcón(new Posicion(1, 1), 100, 1, true);
        Lagarto lagarto = new Lagarto(new Posicion(2, 2), 100, 1, true);
        Flor flor = new Flor(new Posicion(3, 3), 100, 1, true);

        // Hacer que los organismos interactúen entre sí
        abeja.interactuar(flor);
        halcon.interactuar(abeja);
        lagarto.interactuar(lagarto);

        // Imprimir la salud de los organismos después de las interacciones
        System.out.println("Salud de la abeja: " + abeja.getSalud());
        System.out.println("Salud del halcón: " + halcon.getSalud());
        System.out.println("Salud del lagarto: " + lagarto.getSalud());
        System.out.println("Salud de la flor: " + flor.getSalud());
    }
}

