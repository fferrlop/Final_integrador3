package Organismos;

public class Flor extends Organismo {
    public Flor (Posicion posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }

    @Override
    public void interactuar(Organismo otroOrganismo) {
        if (otroOrganismo instanceof Abeja) {
            this.salud += 10;
        }
    }

    public int getSalud() {
        return this.salud;
    }
}