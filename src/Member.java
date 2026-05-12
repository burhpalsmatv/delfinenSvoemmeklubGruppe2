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

    public Member(String name) {
        this.name = name;
        //
        this.memberID = memberIDgenerator.generateMemberID();
        Register.listOfMembers.add(this);
    }

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
                Navn: %s
                Alder: %d
                Addresse: %s
                Postkode: %s
                Telefon: %s
                Email: %s
                Køn: %s
                Betalingsstatus: %b
                Medlemstype: %s
                MemberID: %s
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """, this.name, this.age, this.address,this.postcode,this.phone,this.email,
                this.gender, this.isPaid, this.membership, this.memberID);
    }


    // GETTERS
    public String getName() {
        return name;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getPaymentStatusAsText() {
        return isPaid ? "Betalt" : "Ikke betalt";
    }

    public Membership getMemberType() {
        return membership;
    }

    // Setters for specific members at index i
    public static void setNameAt(int i, String name) {
         Register.listOfMembers.get(i).name = name;
    }

    public static void setAgeAt(int i, int age) {
        Register.listOfMembers.get(i).age = age;
    }

    public static void setAddressAt(int i, String address) {
        Register.listOfMembers.get(i).address = address;
    }

    public static void setPostcodeAt(int i, String postcode) {
        Register.listOfMembers.get(i).postcode = postcode;
    }

    public static void setPhoneAt(int i, String phone) {
        Register.listOfMembers.get(i).phone = phone;
    }

    public static void setEmailAt(int i, String email) {
        Register.listOfMembers.get(i).email = email;
    }

    public static void setGenderAt(int i, Gender gender) {
        Register.listOfMembers.get(i).gender = gender;
    }

    public static void setPaidAt(int i, boolean isPaid) {
        Register.listOfMembers.get(i).isPaid = isPaid;
    }

    public static void setMedlemstypeAt(int i, Membership membership) {
        Register.listOfMembers.get(i).membership = membership;
    }

    public static void setSeniorRabatAt(int i, boolean seniorDiscount) {
        Register.listOfMembers.get(i).seniorDiscount = seniorDiscount;
    }

    public boolean hasSeniorDiscount() {
        if (age >= 60){
            return true;
        }
        else return false;
    }
}

