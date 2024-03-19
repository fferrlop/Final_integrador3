package Organismos;

public abstract class Organismo {
    protected Posicion posicion;
    protected int salud;
    protected int edad;
    protected boolean estadoReproductivo;

    public Organismo(Posicion posicion, int salud, int edad, boolean estadoReproductivo) {
        this.posicion = posicion;
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
    }

    public abstract void interactuar(Organismo otroOrganismo);
}


