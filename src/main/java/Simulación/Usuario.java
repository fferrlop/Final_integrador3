package Simulación;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Simulacion> simulaciones;

    public Usuario() {
        this.simulaciones = new ArrayList<>();
    }

    public void añadirSimulacion(Simulacion simulacion) {
        this.simulaciones.add(simulacion);
    }


}