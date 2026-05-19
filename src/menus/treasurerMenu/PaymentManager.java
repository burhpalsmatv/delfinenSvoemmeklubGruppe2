package menus.treasurerMenu;

import enums.Membership;
import members.Member;

import java.util.ArrayList;

public class PaymentManager {

    public static String showMembersPaymentStatus(ArrayList<Member> members) {
        StringBuilder builder = new StringBuilder();
        for (Member member : members) {
            builder.append(
                    "Navn: " + member.getName() + "\n" +
                    "Medlems-ID: " + member.getMemberID() + ": \n" +
                            member.getPaymentStatusAsText() + "\n\n");
        }
        return builder.toString();
    }

    public static ArrayList<Member> getMembersInArrear(ArrayList<Member> members) {
        ArrayList<Member> membersInArrear = new ArrayList<Member>();

        for (Member member: members) {
            if (!member.isInArrear()) {
                membersInArrear.add(member);
            }
        }
        return membersInArrear;
    }


    public static double getExpectedQuota(ArrayList<Member> members) {
    double expectedQuota = 0;

        for (Member member: members) {

            if (member.hasSeniorDiscount() && member.getMembership() != Membership.PASSIVE) {
                double discount = 25;

                expectedQuota += member.getMembership().getPrice() * ( (100 - discount) / 100 );
            }
            else expectedQuota += member.getMembership().getPrice();
        }

        return expectedQuota;
    }

    public static double getActualQuota(ArrayList<Member> members) {
        double actualQuota = 0;

        for (Member member: members) {

            if (member.hasSeniorDiscount() && member.getMembership() != Membership.PASSIVE &&
            member.isInArrear()) {
                double discount = 25;
                actualQuota += member.getMembership().getPrice() * ( (100 - discount) / 100 );
            }
            else if (member.isInArrear()) {
                actualQuota += member.getMembership().getPrice();
            }
        }

        return actualQuota;
    }


}
