import java.util.ArrayList;

public class Member {
    private String name;
    private int age;
    private String address;
    private String postcode;
    private String phone;
    private String email;
    private Gender gender;
    private boolean isPaid;
    private Membership membership;
    private boolean seniorDiscount;

    //

    static ArrayList<Member> listOfMembers = new ArrayList<>();

    public Member(String name, Membership membership, String phone){
        this.name = name;
        this.membership = membership;
        this.phone = phone;
        this.isPaid = false;

        //

        listOfMembers.add(this);
    }

    public Member (){}

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
    //SETTERS BELOW:

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

    public void setIsPaid() {
        this.isPaid = true;
    }

    public void setMemberType(Membership membership) {
        this.membership = membership;
    }

    public void setSeniorDiscount(boolean seniorDiscount) {
        this.seniorDiscount = seniorDiscount;
    }

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

    // DEFAULT SETTERS ABOVE ^^^^^

    // Setters for specific members at index i

    public static void setNameAt(int i, String name) {
         listOfMembers.get(i).name = name;
    }

    public static void setAgeAt(int i, int age) {
        listOfMembers.get(i).age = age;
    }

    public static void setAddressAt(int i, String address) {
        listOfMembers.get(i).address = address;
    }

    public static void setPostcodeAt(int i, String postcode) {
        listOfMembers.get(i).postcode = postcode;
    }

    public static void setPhoneAt(int i, String phone) {
        listOfMembers.get(i).phone = phone;
    }

    public static void setEmailAt(int i, String email) {
        listOfMembers.get(i).email = email;
    }

    public static void setGenderAt(int i, Gender gender) {
        listOfMembers.get(i).gender = gender;
    }

    public static void setPaidAt(int i, boolean isPaid) {
        listOfMembers.get(i).isPaid = isPaid;
    }

    public static void setMedlemstypeAt(int i, Membership membership) {
        listOfMembers.get(i).membership = membership;
    }

    public static void setSeniorRabatAt(int i, boolean seniorDiscount) {
        listOfMembers.get(i).seniorDiscount = seniorDiscount;
    }

    public boolean hasSeniorDiscount() {
        return seniorDiscount;
    }
}
