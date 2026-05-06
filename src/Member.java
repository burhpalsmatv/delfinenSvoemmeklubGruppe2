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

    public Member(String name, MemberType memberType, String phone){
        this.name = name;
        this.memberType = memberType;
        this.phone = phone;
        this.isPaid = false;
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


    public MemberType getMemberType() {
        return memberType;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public boolean hasSeniorDiscount() {
        return seniorDiscount;
    }
}
