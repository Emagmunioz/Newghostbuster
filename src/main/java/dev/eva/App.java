package dev.eva;

import model.Ghost;
import controler.Controler;

import java.util.List;
import java.util.Scanner;


public class App {
    private Controler controler;
    private Scanner scanner;

    public App(Controler controler) {
        this.controler = controler;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n===== Ghostbusters Asturias Base =====");
            System.out.println("1. Capture a ghost");
            System.out.println("2. View captured ghosts");
            System.out.println("3. Release a ghost");
            System.out.println("4. Filter ghosts by class");
            System.out.println("5. Filter ghosts by month");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea

            switch (option) {
                case 1 -> captureGhost();
                case 2 -> viewCapturedGhosts();
                case 3 -> releaseGhost();
                case 4 -> filterGhostsByClass();
                case 5 -> filterGhostsByMonth();
                case 6 -> {
                    System.out.println("Thanks for protecting Asturias!");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void captureGhost() {
        System.out.print("Enter ghost name: ");
        String name = scanner.nextLine();

        System.out.println("Select ghost class:");
        for (Ghost.GhostClass ghostClass : Ghost.GhostClass.values()) {
            System.out.println(ghostClass.ordinal() + 1 + ". " + ghostClass);
        }
        int classIndex = scanner.nextInt() - 1;
        Ghost.GhostClass ghostClass = Ghost.GhostClass.values()[classIndex];

        System.out.print("Enter danger level (LOW, MEDIUM, HIGH, CRITICAL): ");
        Ghost.DangerLevel dangerLevel = Ghost.DangerLevel.valueOf(scanner.next().toUpperCase());
        scanner.nextLine();

        System.out.print("Enter ghost ability: ");
        String ability = scanner.nextLine();

        controler.captureGhost(name, ghostClass, dangerLevel, ability);
        System.out.println("Ghost captured!");
    }

    private void viewCapturedGhosts() {
        List<Ghost> ghosts = controler.getCapturedGhosts();
        if (ghosts.isEmpty()) {
            System.out.println("No ghosts captured.");
        } else {
            ghosts.forEach(System.out::println);
        }
    }

    private void releaseGhost() {
        System.out.print("Enter ghost name to release: ");
        String name = scanner.nextLine();

        for (Ghost ghost : controler.getCapturedGhosts()) {
            if (ghost.getName().equalsIgnoreCase(name)) {
                controler.releaseGhost(ghost);
                System.out.println("Ghost released!");
                return;
            }
        }
        System.out.println("Ghost not found.");
    }

    private void filterGhostsByClass() {
        System.out.print("Enter ghost class: ");
        Ghost.GhostClass ghostClass = Ghost.GhostClass.valueOf(scanner.next().toUpperCase());

        List<Ghost> ghosts = controler.filterByClass(ghostClass);
        ghosts.forEach(System.out::println);
    }

    private void filterGhostsByMonth() {
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        List<Ghost> ghosts = controler.filterByMonth(month);
        ghosts.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Controler controler = new Controler(null);
        App app = new App(controler);
        app.start();
    }
}