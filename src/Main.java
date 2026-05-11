import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Member mads = new Member("Mads", Membership.SENIOR, "22334455");
        Member valdemar = new Member("Valdemar", Membership.SENIOR, "33445566");
        Member mattie = new Member("Mattie", Membership.SENIOR, "44556677");
        Member jens = new Member("Jens", Membership.SENIOR, "11223344");

        Competitor mattieComp = new Competitor(mattie);
        Competitor madsComp = new Competitor(mads);
        Competitor valdemarComp = new Competitor(valdemar);
        Competitor jensComp = new Competitor(jens);
        mattieComp.setResult(123);
        madsComp.setResult(124);
        valdemarComp.setResult(122);
        jensComp.setResult(24);

        Competition cphSwim = new Competition("CPH Swim", "10.05.26",
                mattieComp, madsComp, valdemarComp, jensComp);

        cphSwim.sortCompetitors();
        System.out.println(cphSwim);
    }
}
