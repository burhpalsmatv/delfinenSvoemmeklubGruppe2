public enum MemberType {
    JUNIOR(1000), SENIOR(1600), PASSIVE(500);

    private int price;

    private MemberType(int price) {
        this.price = price;
    }

    //GETTERS:

    public int getPrice() {
        return price;
    }
}
