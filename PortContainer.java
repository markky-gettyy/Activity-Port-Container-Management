import java.util.ArrayDeque;
import java.util.Scanner;



class Container {
    private String id;
    private String description;
    private String weight;

    public Container(String id, String description, String weight) {
        this.id = id;
        this.description = description;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return id + " | " + description + " | " + weight;
    }
}


class Ship {
    private String name;
    private String captain;

    public Ship(String name, String captain) {
        this.name = name;
        this.captain = captain;
    }

    @Override
    public String toString() {
        return name + " | Capt. " + captain;
    }
}


public class PortContainerManagement {
    private static ArrayDeque<Container> containerStack = new ArrayDeque<>();
    private static ArrayDeque<Ship> shipQueue = new ArrayDeque<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Port Container Management System ===");
            System.out.println("[1] Store container (push)");
            System.out.println("[2] View port containers");
            System.out.println("[3] Register arriving ship (enqueue)");
            System.out.println("[4] View waiting ships");
            System.out.println("[5] Load next ship (pop container + poll ship)");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> storeContainer();
                case 2 -> viewContainers();
                case 3 -> registerShip();
                case 4 -> viewShips();
                case 5 -> loadNextShip();
                case 0 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
    }

    // [1] Store container
    private static void storeContainer() {
        System.out.print("Enter container ID: ");
        String id = sc.nextLine();
        System.out.print("Enter description: ");
        String desc = sc.nextLine();
        System.out.print("Enter weight (e.g., 500kg): ");
        String weight = sc.nextLine();

        Container c = new Container(id, desc, weight);
        containerStack.push(c);
        System.out.println("Stored: " + c);
    }

    // [2] View containers
    private static void viewContainers() {
        if (containerStack.isEmpty()) {
            System.out.println("No containers at port.");
            return;
        }
        System.out.println("TOP →");
        for (Container c : containerStack) {
            System.out.println(c);
        }
        System.out.println("← BOTTOM");
    }

    // [3] Register ship
    private static void registerShip() {
        System.out.print("Enter ship name: ");
        String name = sc.nextLine();
        System.out.print("Enter captain name: ");
        String captain = sc.nextLine();

        Ship s = new Ship(name, captain);
        shipQueue.add(s);
        System.out.println("Registered: " + s);
    }

    // [4] View ships
    private static void viewShips() {
        if (shipQueue.isEmpty()) {
            System.out.println("No ships waiting.");
            return;
        }
        System.out.println("FRONT →");
        for (Ship s : shipQueue) {
            System.out.println(s);
        }
        System.out.println("← REAR");
    }

    // [5] Load next ship
    private static void loadNextShip() {
        if (containerStack.isEmpty()) {
            System.out.println("No containers available to load.");
            return;
        }
        if (shipQueue.isEmpty()) {
            System.out.println("No ships waiting to be loaded.");
            return;
        }

        Container c = containerStack.pop();
        Ship s = shipQueue.poll();
        System.out.println("Loaded: " + c + " → " + s);
        System.out.println("Remaining containers: " + containerStack.size());
        System.out.println("Remaining ships waiting: " + shipQueue.size());
    }
}
