import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        // File.loadFiles();

        Member lars = new Member("Lars");
        Member morten = new Member("Morten");

        Competitor compMorten = new Competitor(morten);

        // Application.mainApp();

        System.out.println(Register.listOfMembers);
        System.out.println(Register.listOfCompetitors);


        // File.saveFiles();
    }
}
