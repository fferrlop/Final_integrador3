package Simulación;

import Organismos.Organismo;

import java.util.List;

public class Estadisticas {
    private List<Organismo> organismos;

    public Estadisticas(List<Organismo> organismos) {
        this.organismos = organismos;
    }

    public int calcularPoblacionTotal() {
        return this.organismos.size();
    }
}
