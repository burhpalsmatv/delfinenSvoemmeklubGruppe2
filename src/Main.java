import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        ArrayList<Member> theGang = new ArrayList<Member>();
        Member mads = new Member("Mads", Membership.SENIOR, "22334455");
        Member emma = new Member("Emma", Membership.JUNIOR, "99999999");
        Member mattie = new Member("Mattie", Membership.PASSIVE, "80081350");
        Member valdemar = new Member("Valdemar", Membership.JUNIOR, "00000001");

        theGang.add(mads);
        theGang.add(emma);
        theGang.add(mattie);
        theGang.add(valdemar);

        System.out.println(PaymentManager.getMembersInArrear(theGang).toString());

        System.out.println(PaymentManager.getExpectedQuota(theGang));
        System.out.println(PaymentManager.getQuota(theGang));




        Member.setNameAt(0, "Morten");
        Member.removeMemberAt(0);
        System.out.println(Member.listOfMembers);


    }
}
