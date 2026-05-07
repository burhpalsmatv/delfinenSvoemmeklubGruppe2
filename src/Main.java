import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        ArrayList<Member> theGang = new ArrayList<Member>();
        Member mads = new Member("Mads", MemberType.SENIOR, "22334455");
        Member emma = new Member("Emma", MemberType.JUNIOR, "99999999");
        Member mattie = new Member("Mattie", MemberType.PASSIVE, "80081350");
        Member valdemar = new Member("Valdemar", MemberType.JUNIOR, "00000001");

        mads.setPaid();
        mads.setSeniorDiscount(true);

        theGang.add(mads);
        theGang.add(emma);
        theGang.add(mattie);
        theGang.add(valdemar);

        System.out.println(PaymentManager.getMembersInArrear(theGang).toString());

        System.out.println(PaymentManager.getExpectedQuota(theGang));
        System.out.println(PaymentManager.getQuota(theGang));

    }
}
