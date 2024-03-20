package Simulación;

import Entorno.Ambiente;
import Organismos.Organismo;

import java.util.List;

public class Simulacion {
    private Ambiente ambiente;
    private List<Organismo> organismos;

    public Simulacion(Ambiente ambiente, List<Organismo> organismos) {
        this.ambiente = ambiente;
        this.organismos = organismos;
    }

}

