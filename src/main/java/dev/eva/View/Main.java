package dev.eva.View;
import model.Ghost;
import controler.Controler;
import java.util.List;
import java.util.Scanner;
public class Main {

    private Controler controler;
    private Scanner scanner;

    public  void Console(Controler controler) {
        this.controler = controler;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("============================================");
            System.out.println("    Welcome to the Ghostbusters Asturias Base!");
            System.out.println("    Manage your captured ghosts and protect the region");
            System.out.println("============================================");
            System.out.println("Options:");
            System.out.println("1. Capture a new ghost");
            System.out.println("2. View list of captured ghosts");
            System.out.println("3. Release a ghost");
            System.out.println("4. Filter ghosts by class");
            System.out.println("5. View ghosts captured in a specific month");
            System.out.println("6. Exit");
            System.out.print("Please select an option (1-6): ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    captureGhost();
                    break;
                case 2:
                    viewCapturedGhosts();
                    break;
                case 3:
                    releaseGhost();
                    break;
                case 4:
                    filterGhostsByClass();
                    break;
                case 5:
                    viewGhostsCapturedInMonth();
                    break;
                case 6:
                    System.out.println("============================================");
                    System.out.println("    Thank you for protecting Asturias!");
                    System.out.println("    See you on the next paranormal hunt!");
                    System.out.println("============================================");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void captureGhost() {
        System.out.println("Capture a New Ghost");
        System.out.println("============================================");
        System.out.print("Enter the ghost's name: ");
        String name = scanner.nextLine();

        System.out.println("Select the ghost's class:");
        for (Ghost.GhostClass ghostClass : Ghost.GhostClass.values()) {
            System.out.println(ghostClass.ordinal() + 1 + ". " + ghostClass);
        }
        int classIndex = scanner.nextInt() - 1;
        Ghost.GhostClass ghostClass = Ghost.GhostClass.values()[classIndex];

        System.out.print("Danger level (Low, Medium, High, Critical): ");
        String dangerLevelStr = scanner.next().toUpperCase();
        Ghost.DangerLevel dangerLevel = Ghost.DangerLevel.valueOf(dangerLevelStr);

        scanner.nextLine(); 
        System.out.print("Ghost's special ability: ");
        String ability = scanner.nextLine();

        controler.captureGhost(name, ghostClass, dangerLevel, ability);
        System.out.println("Ghost \"" + name + "\" captured successfully.");
    }

    private void viewCapturedGhosts() {
        System.out.println("View List of Captured Ghosts");
        System.out.println("============================================");
        List<Ghost> ghosts = controler.getCapturedGhosts();
        if (ghosts.isEmpty()) {
            System.out.println("No ghosts captured.");
        } else {
            for (Ghost ghost : ghosts) {
                System.out.println(ghost);
            }
        }
    }

    private void releaseGhost() {
        System.out.println("Release a Ghost");
        System.out.println("============================================");
        viewCapturedGhosts();
        System.out.print("Enter the name of the ghost to release: ");
        String name = scanner.nextLine();

        List<Ghost> ghosts = controler.getCapturedGhosts();
        Ghost ghostToRelease = null;
        for (Ghost ghost : ghosts) {
            if (ghost.getName().equalsIgnoreCase(name)) {
                ghostToRelease = ghost;
                break;
            }
        }

        if (ghostToRelease != null) {
            controler.releaseGhost(ghostToRelease);
            System.out.println("Ghost \"" + name + "\" released successfully.");
        } else {
            System.out.println("Ghost not found.");
        }
    }

    private void filterGhostsByClass() {
        System.out.println("Filter Ghosts by Class");
        System.out.println("============================================");
        System.out.println("Select the ghost's class:");
        for (Ghost.GhostClass ghostClass : Ghost.GhostClass.values()) {
            System.out.println(ghostClass.ordinal() + 1 + ". " + ghostClass);
        }
        int classIndex = scanner.nextInt() - 1;
        Ghost.GhostClass ghostClass = Ghost.GhostClass.values()[classIndex];

        List<Ghost> filtered = controler.filterByClass(ghostClass);
        if (filtered.isEmpty()) {
            System.out.println("No ghosts of class " + ghostClass + " captured.");
        } else {
            for (Ghost ghost : filtered) {
                System.out.println(ghost);
            }
        }
    }

    private void viewGhostsCapturedInMonth() {
        System.out.println("View Ghosts Captured in a Specific Month");
        System.out.println("============================================");
        System.out.print("Enter the month (1-12): ");

       
    
    }

}
