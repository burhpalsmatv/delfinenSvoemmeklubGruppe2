import java.util.Scanner;

public class Application {

    public static void mainApp() {

    Boolean applicationRunning = true;

    while (applicationRunning) {

        System.out.println("Vælg menu: 1 for admin login, 2 for træner, 3 for kassér, 0 for log ud");

        while (!scanner.hasNextInt()) {
            System.out.println("indtast et tal");
            scanner.next();
        }
        int input = scanner.nextInt();

        switch (input) {

            case 1:
                AdminScreen.adminScreen();
                break;

            case 2:
                TrainerScreen.trainerScreen();
                break;

            case 3:
                TreasurerScreen.treasurerScreen();
                break;

            case 0:
                applicationRunning = false;
            }

        }
    }

    //My best friend the scanner
    public static final Scanner scanner = new Scanner(System.in);
}
