package Organismos;

public class Abeja extends Organismo {
    public Abeja(Posicion posicion, int salud, int edad, boolean estadoReproductivo) {
        super(posicion, salud, edad, estadoReproductivo);
    }

    @Override
    public void interactuar(Organismo otroOrganismo) {
        if (otroOrganismo instanceof Flor) {
            System.out.println("La abeja ha polinizado a la flor");
            Flor nuevaFlor = (Flor) otroOrganismo.reproducirse();
            System.out.println("La flor se ha reproducido, creando una nueva flor");
        }
    }

    @Override
    public Organismo reproducirse() {
        System.out.println("La abeja se está reproduciendo");
        return new Abeja(new Posicion(0, 0), 100, 0, true);
    }
}