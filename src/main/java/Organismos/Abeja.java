package Organismos;

public class Abeja extends Organismo {
    public Abeja(Posicion posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }

    @Override
    public void interactuar(Organismo otroOrganismo) {
        if (otroOrganismo instanceof Abeja || otroOrganismo instanceof Flor) {
            this.salud += 10;
        }
    }

    public int getSalud() {
        return this.salud;
    }
}
