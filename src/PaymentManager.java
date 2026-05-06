import java.util.ArrayList;

public class PaymentManager {
    private ArrayList<Receipt> receipts;
    private ArrayList<Member> members;


    public static ArrayList<Member> getMembersInArrear(ArrayList<Member> members) {
        ArrayList<Member> membersInArrear = new ArrayList<Member>();

        for (Member member: members) {
            if (!member.isPaid()) {
                membersInArrear.add(member);
            }
        }
        return membersInArrear;
    }
}
