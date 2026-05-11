import java.io.Serializable;

public class Member implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String name;
    protected int age;
    protected String address;
    protected String postcode;
    protected String phone;
    protected String email;
    protected Gender gender;
    protected boolean isPaid;
    protected Membership membership;
    protected boolean seniorDiscount;

    public Member(String name, int age) { // Midlertidig constructor med kun name og age
        this.name = name;
        this.age = age;

        //
        Register.listOfMembers.add(this);
    }

    public Member(String name, Membership membership, int age) { // Midlertidig constructor med kun name og age og membership
        this.name = name;
        this.age = age;
        this.membership = membership;

        //
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

        Register.listOfMembers.add(this);
    }

    public Member () {}

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
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """, this.name, this.age, this.address,this.postcode,this.phone,this.email,
                this.gender, this.isPaid, this.membership);
    }

    //

    //GETTERS BELOW:

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public Membership getMemberType() {
        return membership;
    }

    public boolean isSeniorDiscount() {
        return seniorDiscount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getPaymentStatusAsText() {
        return isPaid ? "Betalt" : "ikke betalt";
    }
    // DEFAULT SETTERS ABOVE ^^^^^

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

    public static void removeMemberAt(int i) {
        Register.listOfMembers.remove(i);
    }

    public boolean hasSeniorDiscount() {
        if (age >= 60){
            return true;
        }
        else return false;
    }
}
