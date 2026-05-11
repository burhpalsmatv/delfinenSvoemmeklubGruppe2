import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        // LoadFiles siger "something went wrong" første gange man kører program
        // Det er fordi der ikke er gemt nogen fil endnu
        // Ik tænk over det
        File.loadFiles();

        Member newMember = new Member(getName(), getAge());
        System.out.println(Register.listOfMembers);

        File.saveFiles();

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

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");

        String name = "";
        name += scanner.nextLine();
        return name;
    }

    public static int getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");

        int age = scanner.nextInt();
        return age;
    }
}
