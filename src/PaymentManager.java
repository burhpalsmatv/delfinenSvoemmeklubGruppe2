import java.util.ArrayList;

public class PaymentManager {

    public static String showMembersPaymentStatus(ArrayList<Member> members) {
        StringBuilder builder = new StringBuilder();
        for (Member member : members) {
            builder.append(member.getName() + ": " + member.getPaymentStatusAsText() + "\n");
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


    public static int getExpectedQuota(ArrayList<Member> members) {
    int expectedQuota = 0;

        for (Member member: members) {

            if (member.hasSeniorDiscount() && member.getMembership() != Membership.PASSIVE) {
                int discount = 25;
                expectedQuota += ((member.getMembership().getPrice())/100) * (discount);
            }
            else expectedQuota += member.getMembership().getPrice();
        }

        return expectedQuota;
    }

    public static int getActualQuota(ArrayList<Member> members) {
        int actualQuota = 0;

        for (Member member: members) {

            if (member.hasSeniorDiscount() && member.getMembership() != Membership.PASSIVE &&
            member.isInArrear()) {
                int discount = 25;
                actualQuota += ((member.getMembership().getPrice())/(100)) * (discount);
            }
            else if (member.isInArrear()) {
                actualQuota += member.getMembership().getPrice();
            }
        }

        return actualQuota;
    }


}
