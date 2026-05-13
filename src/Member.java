import java.io.Serializable;
import java.util.Random;

public class Member implements Serializable {
    private static final long serialVersionUID = 1L; // Til serialization. Niks pille

    protected String name;
    protected String memberID;
    protected int age;
    protected String address;
    protected String postcode;
    protected String phone;
    protected String email;
    protected Gender gender;
    protected boolean isPaid;
    protected Membership membership;
    protected boolean seniorDiscount;

    public Member() {}

    public Member(String name, String phone) {
        this.memberID = memberIDgenerator.generateMemberID();

        this.name = name;
    }

    /* Custom MemberID for TESTING
    public Member(String name, String memberID) {
        this.name = name;
        //
        this.memberID = memberID;
        Register.listOfMembers.add(this);
    }
    */

    public Member(String name, int age, String address, String postcode, String phone,
                   String email, Gender gender, Membership membership) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.isPaid = false;
        this.membership = membership;
        this.seniorDiscount = hasSeniorDiscount();
        //
        this.memberID = memberIDgenerator.generateMemberID();
        Register.listOfMembers.add(this);
    }

    public String toString(){
        return String.format("""
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~
                MemberID: %s
                Navn: %s
                Alder: %d
                Addresse: %s
                Postkode: %s
                Telefon: %s
                Email: %s
                Køn: %s
                Betalingsstatus: %s
                Medlemstype: %s
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """, this.memberID, this.name, this.age, this.address,this.postcode,this.phone,this.email,
                this.gender, this.isPaid, this.membership);
    }


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

    public String getAddress() {
        return this.address;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public Gender getGender() {
        return this.gender;
    }

    public boolean isPaid() {
        return this.isPaid;
    }

    public Membership getMemberType() {
        return membership;
    }

    public boolean isSeniorDiscount() {
        return this.seniorDiscount;
    }

    public String getPaymentStatusAsText() {
        return this.isPaid ? "Betalt" : "Ikke betalt";
    }

    // Normal Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public void setSeniorDiscount(boolean seniorDiscount) {
        this.seniorDiscount = seniorDiscount;
    }

    // Extra
    public boolean hasSeniorDiscount() {
        if (age >= 60){
            return true;
        }
        else return false;
    }
}

