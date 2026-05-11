import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        // LoadFiles siger "something went wrong" første gange man kører program
        // Det er fordi der ikke er gemt nogen fil endnu
        // Ik tænk over det

        /* File.loadFiles(); // NIKS PILLE

//        Member newMember = new Member(getName(), getAge()); // NIKS PILLE
//        System.out.println(Register.listOfMembers); // NIKS PILLE

        // File.saveFiles(); // NIKS PILLE */

        Member mads = new Member("Mads", Membership.SENIOR, 20);
        Member valdemar = new Member("Valdemar", Membership.SENIOR, 10);
        Member mattie = new Member("Mattie", Membership.SENIOR, 9000);
        Member jens = new Member("Jens", Membership.SENIOR, 90);

        Trainer trænerMads = new Trainer("trænerMads");
        Trainer trænerLars = new Trainer("trænerLars");


        Competitor mattieComp = new Competitor(mattie);
        // Competitor madsComp = new Competitor(mads);
        // Competitor valdemarComp = new Competitor(valdemar);
        Competitor jensComp = new Competitor(jens);

        System.out.println(Register.listOfMembers);
        System.out.println(Register.listOfTrainers);

        Application.mainApp();
    }
}
