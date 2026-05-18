package enums;

public enum Membership {
    JUNIOR(1000), SENIOR(1600), PASSIVE(500);

    private int price;

    private Membership(int price) {
        this.price = price;
    }

    //GETTERS:

    public int getPrice() {
        return price;
    }

    //SETTERS:

    public void setPrice(int price) {
        this.price = price;
    }
}
