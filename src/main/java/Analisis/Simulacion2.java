package Analisis;

import java.util.ArrayList;
import java.util.List;

public class Simulacion2 {
    private List<ModeloOrganismo> organismos;
    private List<Evento> eventos;

    public Simulacion2() {
        this.organismos = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public void añadirOrganismo(ModeloOrganismo organismo) {
        organismos.add(organismo);
    }

    public void añadirEvento(Evento evento) {
        eventos.add(evento);
    }

    // Resto de la clase...
}