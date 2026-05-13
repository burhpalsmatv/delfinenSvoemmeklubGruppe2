import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        try {
            File.loadFiles();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        /*Member lars = new Member("Lars");
        Member morten = new Member("Morten");

        Competitor compMorten = new Competitor(morten);
*/
        //Application.mainApp();

        System.out.println(Register.listOfMembers);
        System.out.println(Register.listOfCompetitors);


        try {
            File.saveFiles();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
