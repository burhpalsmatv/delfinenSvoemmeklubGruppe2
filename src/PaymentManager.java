import java.util.ArrayList;

public class PaymentManager {

    public static ArrayList<Member> getMembersInArrear(ArrayList<Member> members) {
        ArrayList<Member> membersInArrear = new ArrayList<Member>();

        for (Member member: members) {
            if (!member.isPaid()) {
                membersInArrear.add(member);
            }
        }
        return membersInArrear;
    }


    public static int getExpectedQuota(ArrayList<Member> members) {
    int expectedQuota = 0;

        for (Member member: members) {

            if (member.hasSeniorDiscount() && member.getMemberType() != Membership.PASSIVE) {
                int discount = member.getMemberType().getPrice()/100 * 25;
                expectedQuota += member.getMemberType().getPrice() - discount;
            }
            else expectedQuota += member.getMemberType().getPrice();
        }

        return expectedQuota;
    }

    public static int getQuota(ArrayList<Member> members) {
        int quota = 0;

        for (Member member: members) {

            if (member.hasSeniorDiscount() && member.getMemberType() != Membership.PASSIVE &&
            member.isPaid()) {
                int discount = member.getMemberType().getPrice()/100 * 25;
                quota += member.getMemberType().getPrice() - discount;
            }
            else if (member.isPaid()) {
                quota += member.getMemberType().getPrice();
            }
        }

        return quota;
    }

}
