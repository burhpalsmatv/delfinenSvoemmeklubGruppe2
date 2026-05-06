public class Receipt {
    private int amount;
    private Member member;
    private String date;

    public Receipt(int amount, Member member, String date) {
        this.amount = amount;
        this.member = member;
        this.date = date;
    }
}
