package Organismos;

public abstract class Organismo {
    protected Posicion posicion;
    protected int salud;
    protected int edad;
    protected boolean estadoReproductivo;
    protected boolean vivo; // Nuevo campo

    public Organismo(Posicion posicion, int salud, int edad, boolean estadoReproductivo) {
        this.posicion = posicion;
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
        this.vivo = true; // Todos los organismos comienzan vivos
    }

    public abstract void interactuar(Organismo otroOrganismo);



    public int getSalud() {
        return this.salud;
    }

    public boolean estaVivo() { // Nuevo método
        return this.vivo;
    }

    public void crecer() {
        this.edad++;
        // Incrementar la salud si es necesario
    }

    public abstract Organismo reproducirse();
}


