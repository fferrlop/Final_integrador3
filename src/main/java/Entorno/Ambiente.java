package Entorno;

import Organismos.Organismo;
import java.util.ArrayList;
import java.util.List;

public class Ambiente {
    private List<Organismo> organismos;

    public Ambiente() {
        this.organismos = new ArrayList<>();
    }

    public void añadirOrganismo(Organismo organismo) {
        this.organismos.add(organismo);
    }

}