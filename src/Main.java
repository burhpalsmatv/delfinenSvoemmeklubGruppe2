import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Member mads = new Member("Mads", MedlemsType.SENIOR, "22334455");
        Member emma = new Member("Emma", MedlemsType.JUNIOR, "99999999");
        Member mattie = new Member("Mattie", MedlemsType.PASSIVE, "80081350");
        Member valdemar = new Member("Valdemar", MedlemsType.JUNIOR, "00000001");

        Competitor madsComp = new Competitor(mads);
        SwimmingCategory crawl = new SwimmingCategory();
        Trainer mattie = new Trainer("Mattie", crawl);
        madsComp.addTrainer(mattie);

        System.out.println(madsComp);

    }
}
