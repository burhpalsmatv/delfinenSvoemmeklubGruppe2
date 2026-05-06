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
    private MemberType memberType;
    private boolean seniorDiscount;

    //

    static ArrayList<Member> listOfMembers = new ArrayList<>();

    public Member(String name, MemberType memberType, String phone){
        this.name = name;
        this.memberType = memberType;
        this.phone = phone;

        //

        listOfMembers.add(this);
    }

    public Member (){

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
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~
                """, this.name, this.age, this.address,this.postcode,this.phone,this.email,
                this.gender, this.isPaid, this.memberType);
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

    public void setPaid() {
        this.isPaid = true;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }

    public void setSeniorDiscount(boolean seniorDiscount) {
        this.seniorDiscount = seniorDiscount;
    }

    //GETTERS BELOW:


    public boolean isPaid() {
        return isPaid;
    }
    // DEFAULT SETTERS ABOVE ^^^^^

    // Setters for specific members at index i

    public void setNameAt(int i, String name) {
         listOfMembers.get(i).name = name;
    }

    public void setAgeAt(int i, int age) {
        listOfMembers.get(i).age = age;
    }

    public void setAddressAt(int i, String address) {
        listOfMembers.get(i).address = address;
    }

    public void setPostcodeAt(int i, String postcode) {
        listOfMembers.get(i).postcode = postcode;
    }

    public void setPhoneAt(int i, String phone) {
        listOfMembers.get(i).phone = phone;
    }

    public void setEmailAt(int i, String email) {
        listOfMembers.get(i).email = email;
    }

    public void setGenderAt(int i, Gender gender) {
        listOfMembers.get(i).gender = gender;
    }

    public void setPaidAt(int i, boolean isPaid) {
        listOfMembers.get(i).isPaid = isPaid;
    }

    public void setMedlemstypeAt(int i, MemberType memberType) {
        listOfMembers.get(i).memberType = memberType;
    }

    public void setSeniorRabatAt(int i, boolean seniorDiscount) {
        listOfMembers.get(i).seniorDiscount = seniorDiscount;
    }

    // Other methods
    public void deleteMember(int i) {
        // Delete member at index # of arraylist "listOfMembers"

        listOfMembers.remove(i);
    }

}
