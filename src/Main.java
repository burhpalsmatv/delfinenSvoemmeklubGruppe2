import menus.Application;
import Register.File;

import java.io.IOException;

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
