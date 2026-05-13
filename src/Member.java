import java.io.Serializable;

public abstract class Member implements Serializable {
    private static final long serialVersionUID = 1L; // Til serialization. Niks pille

    protected String memberID;
    protected Membership membership;
    protected boolean inArrear;

    // Stamoplysninger
    protected String name;
    protected int age;
    protected String phone;
    protected Gender gender;

    public Member() {}

    // GETTERS
    public String getName() {
        return this.name;
    }

    public String getMemberID() {
        return this.memberID;
    }

    public int getAge() {
        return this.age;
    }

    public String getPhone() {
        return this.phone;
    }

    public Gender getGender() {
        return this.gender;
    }

    public boolean isInArrear() {
        return this.inArrear;
    }

    public Membership getMemberType() {
        return membership;
    }

    public String getPaymentStatusAsText() {
        return this.inArrear ? "Betalt" : "Ikke betalt";
    }

    // Normal Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setInArrear(boolean inArrear) {
        this.inArrear = inArrear;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    // Extra
    public boolean hasSeniorDiscount() {
        if (age >= 60){
            return true;
        }
        else return false;
    }
}

