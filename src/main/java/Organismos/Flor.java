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

    @Override
    public Organismo reproducirse() {
        System.out.println("La flor se está reproduciendo");
        return new Flor(new Posicion(0, 0), 100, 0, true);
    }
}