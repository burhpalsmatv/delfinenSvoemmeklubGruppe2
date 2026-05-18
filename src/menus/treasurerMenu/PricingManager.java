package menus.treasurerMenu;

import enums.Membership;

public class PricingManager {

    public static void changeMembershipPrice(Membership membership, int newPrice) {
        membership.setPrice(newPrice);
    }

    public static String displayPrices() {
        StringBuilder string = new StringBuilder();

        for (Membership type : Membership.values()) {
            string.append("Prisen for " + type + " medlemskab: " + type.getPrice() + " kr.\n");
        }
        return string.toString();
    }
}
