package org.example;

import Entorno.Ambiente;
import GestionUsuario.AuthenticationService;
import GestionUsuario.SimulationLogger;
import GestionUsuario.UserInterface;
import Organismos.*;
import Eventos.DesastreNatural;
import Simulación.*;
import Analisis.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AuthenticationService authService = new AuthenticationService();
        SimulationLogger logger = new SimulationLogger("simulation_log.txt");

        // Register a user
        authService.registerUser("username", "password");

        // Create an instance of the UserInterface and start it
        UserInterface ui = new UserInterface(authService, logger);
        ui.start();

        // Crear instancias de los organismos
        Abeja abeja1 = new Abeja(new Posicion(0, 0), 100, 1, true);
        Halcón halcon1 = new Halcón(new Posicion(1, 1), 100, 1, true);
        Lagarto lagarto1 = new Lagarto(new Posicion(2, 2), 100, 1, true);
        Flor flor1 = new Flor(new Posicion(3, 3), 100, 1, true);

        // Hacer que los organismos interactúen entre sí
        abeja1.interactuar(flor1); // La abeja poliniza la flor
        halcon1.interactuar(abeja1); // El halcón predice la abeja
        lagarto1.interactuar(lagarto1); // El lagarto compite con otro lagarto por recursos

        // Imprimir la salud de los organismos después de las interacciones
        System.out.println("Salud de la abeja: " + abeja1.getSalud());
        System.out.println("Salud del halcón: " + halcon1.getSalud());
        System.out.println("Salud del lagarto: " + lagarto1.getSalud());
        System.out.println("Salud de la flor: " + flor1.getSalud());

        // Crear un ambiente
        Ambiente ambiente = new Ambiente();

        // Crear algunos organismos
        Abeja abeja = new Abeja(new Posicion(0, 0), 100, 0, true);
        Flor flor = new Flor(new Posicion(1, 1), 100, 0, false);
        Lagarto lagarto = new Lagarto(new Posicion(2, 2), 100, 0, true);

        // Añadir los organismos al ambiente
        ambiente.añadirOrganismo(abeja);
        ambiente.añadirOrganismo(flor);
        ambiente.añadirOrganismo(lagarto);

        // Crear una simulación
        List<Organismo> organismos = new ArrayList<>();
        organismos.add(abeja);
        organismos.add(flor);
        organismos.add(lagarto);
        Simulacion simulacion = new Simulacion(ambiente, organismos);

        // Crear un usuario y añadir la simulación a su lista de simulaciones
        Usuario usuario = new Usuario();
        usuario.añadirSimulacion(simulacion);

        // Crear un evento de desastre natural
        DesastreNatural desastreNatural = new DesastreNatural();

        // Hacer que los organismos interactúen
        abeja.interactuar(flor); // La abeja poliniza la flor
        lagarto.interactuar(abeja); // El lagarto caza la abeja

        // Hacer que ocurra el desastre natural
        desastreNatural.ocurrir(organismos);

        // Calcular y mostrar las estadísticas
        Estadisticas estadisticas = new Estadisticas(organismos);
        System.out.println("Población total: " + estadisticas.calcularPoblacionTotal());

        // Crear una nueva simulación para Analisis
        Simulacion2 simulacion2 = new Simulacion2();

        // Crear un organismo y un evento para Analisis
        ModeloOrganismo organismo = new ModeloOrganismo() {
            @Override
            public void obtenerDatos() {

            }
        };
        Evento evento = new Evento() {
            @Override
            public void ejecutarEvento() {
                
            }
        };

        // Añadir el organismo y el evento a la simulación
        simulacion2.añadirOrganismo(organismo);
        simulacion2.añadirEvento(evento);

        // Verificar el equilibrio ecológico
        boolean equilibrio = AnalisisAvanzado.verificarEquilibrioEcológico(simulacion2);
        System.out.println("Equilibrio ecológico: " + equilibrio);

        // Evaluar una estrategia de conservación
        EstrategiaConservacion estrategia = new EstrategiaConservacion() {
            @Override
            public void aplicarEstrategia() {
                // Implementar lógica para aplicar la estrategia de conservación
            }
        };
        AnalisisAvanzado.evaluarEstrategiaConservacion(simulacion2, estrategia);
    }
}