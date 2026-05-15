import java.util.Scanner;

public class Application {

    public static void mainApp() {

    Boolean applicationRunning = true;

    while (applicationRunning) {

        System.out.println("""
                1: Admin login 
                2: Træner
                3: Kassér
                0: Log ud - sluk system
                """);
        System.out.print("Vælg menu: ");

        while (!scanner.hasNextInt()) {
            System.out.println("indtast et tal");
            scanner.next();
        }
        int input = scanner.nextInt();

        switch (input) {

            case 1:
                AdminMenu.AdminMenu();
                break;

            case 2:
                TrainerMenu.trainerScreen();
                break;

            case 3:
                TreasurerMenu.treasurerScreen();
                break;

            case 0:
                applicationRunning = false;
            }

        }
    }

    // My best friend Bajs Woody the scanner
    public static final Scanner scanner = new Scanner(System.in);
}
