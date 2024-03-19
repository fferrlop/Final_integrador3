package Organismos;

public class Lagarto extends Organismo {
    public Lagarto (Posicion posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }
    @Override
    public void interactuar(Organismo otroOrganismo) {
        if (otroOrganismo instanceof Lagarto) {
            this.salud += 5;
        }
    }

    public int getSalud() {
        return this.salud;
    }
}