import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Member mads = new Member("Mads", MedlemsType.SENIOR, "22334455");

        Competitor madsComp = new Competitor(mads);
        SwimmingCategory crawl = new SwimmingCategory();
        Trainer mattie = new Trainer("Mattie", crawl);
        madsComp.addTrainer(mattie);

        System.out.println(madsComp);

    }
}
