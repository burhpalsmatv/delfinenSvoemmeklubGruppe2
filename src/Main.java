import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        ArrayList<Member> theGang = new ArrayList<Member>();
        Member mads = new Member("Mads", MemberType.SENIOR, "22334455");
        Member emma = new Member("Emma", MemberType.JUNIOR, "99999999");
        Member mattie = new Member("Mattie", MemberType.PASSIVE, "80081350");
        Member valdemar = new Member("Valdemar", MemberType.JUNIOR, "00000001");

        mads.setIsPaid();

        theGang.add(mads);
        theGang.add(emma);
        theGang.add(mattie);
        theGang.add(valdemar);

        System.out.println(PaymentManager.getMembersInArrear(theGang).toString());

        Competitor madsComp = new Competitor(mads);
        Competitor mattieComp = new Competitor(mattie);
        Competitor emmaComp = new Competitor(emma);
        Competitor valdemarComp = new Competitor(valdemar);

        SwimmingCategory crawl = new SwimmingCategory("crawl");
        Trainer svendBent = new Trainer("Svend Bent", crawl);
        madsComp.addTrainer(svendBent);
        mattieComp.addTrainer(svendBent);
        emmaComp.addTrainer(svendBent);
        valdemarComp.addTrainer(svendBent);


        Competition usopen = new Competition("Us Open", "10.07.26", madsComp, mattieComp, emmaComp, valdemarComp);


        Member.setNameAt(0, "Morten");
        System.out.println(Member.listOfMembers);

    }
}
