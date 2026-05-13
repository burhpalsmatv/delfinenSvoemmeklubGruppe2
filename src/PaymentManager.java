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

            if (member.hasSeniorDiscount() && member.getMemberType() != Membership.PASSIVE) {
                int discount = 25;
                expectedQuota += ((member.getMemberType().getPrice())/100) * (discount);
            }
            else expectedQuota += member.getMemberType().getPrice();
        }

        return expectedQuota;
    }

    public static int getActualQuota(ArrayList<Member> members) {
        int actualQuota = 0;

        for (Member member: members) {

            if (member.hasSeniorDiscount() && member.getMemberType() != Membership.PASSIVE &&
            member.isInArrear()) {
                int discount = 25;
                actualQuota += ((member.getMemberType().getPrice())/(100)) * (discount);
            }
            else if (member.isInArrear()) {
                actualQuota += member.getMemberType().getPrice();
            }
        }

        return actualQuota;
    }


}
