package GestionUsuario;

import java.util.Scanner;

public class UserInterface {
    private AuthenticationService authService;
    private SimulationLogger logger;

    public UserInterface(AuthenticationService authService, SimulationLogger logger) {
        this.authService = authService;
        this.logger = logger;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (authService.authenticate(username, password)) {
            System.out.println("Authenticated successfully.");
            // Here you can add code to allow the user to configure and control simulations.
            // After each simulation, you can log the results and configuration like this:
            // logger.log("Simulation results...");
        } else {
            System.out.println("Authentication failed.");
        }
    }
}