public class PricingManager {


    public static void getMembershipPrice(Membership membertype){
    }

    public static void changeMembershipPrice(Membership membership, int newPrice) {
        membership.setPrice(newPrice);

    }

    public static void displayPrices() {
        StringBuilder string = new StringBuilder();

        for (Membership type : Membership.values()) {
            string.append("Prisen for " + type + " medlemskab er: " + type.getPrice() + " kr.\n");
        }
        System.out.println(string);


    }
}
