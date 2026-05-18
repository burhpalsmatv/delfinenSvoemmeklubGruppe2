import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        try {
            File.loadFiles();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Der er ingen gemt data endnu. \n");;
        }

        Application.mainApp();

        try {
            File.saveFiles();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
