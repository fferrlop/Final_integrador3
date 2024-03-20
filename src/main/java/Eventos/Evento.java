package Eventos;

import Organismos.Organismo;

import java.util.List;

public abstract class Evento {
    public abstract void ocurrir(List<Organismo> organismos);

}
