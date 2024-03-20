package Organismos;

public class Halcón extends Organismo {
    public Halcón(Posicion posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }

    @Override
    public void interactuar(Organismo otroOrganismo) {
        if (otroOrganismo instanceof Abeja) {
            otroOrganismo.salud = 0;
            otroOrganismo.vivo = false; // La abeja "desaparece"
            System.out.println("El halcon ha cazado a la abeja");
        }
    }

    @Override
    public Organismo reproducirse() {
        System.out.println("El halcon se está reproduciendo");
        return new Halcón(new Posicion(0, 0), 100, 0, true);
    }
}