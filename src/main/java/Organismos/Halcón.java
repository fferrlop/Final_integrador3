package Organismos;

public class Halcón extends Organismo {
    public Halcón(Posicion posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }

    @Override
    public void interactuar(Organismo otroOrganismo) {
        if (!(otroOrganismo instanceof Halcón)) {
            this.salud += 20;
        }
    }

    public int getSalud() {
        return this.salud;
    }

}
