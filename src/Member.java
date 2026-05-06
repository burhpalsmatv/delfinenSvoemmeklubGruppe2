import java.util.ArrayList;

public class Member {
    private String name;
    private int age;
    private String address;
    private String postcode;
    private String phone;
    private String email;
    private Gender gender;
    private boolean betalingsStatus;
    private MedlemsType medlemstype;
    private boolean seniorRabat;

    //

    static ArrayList<Member> listOfMembers = new ArrayList<>();

    public Member(String name, MedlemsType medlemsType, String phone){
        this.name = name;
        this.medlemstype = medlemsType;
        this.phone = phone;

        //

        listOfMembers.add(this);
    }

    public Member (){

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

    public void setBetalingsStatus(boolean betalingsStatus) {
        this.betalingsStatus = betalingsStatus;
    }

    public void setMedlemstype(MedlemsType medlemstype) {
        this.medlemstype = medlemstype;
    }

    public void setSeniorRabat(boolean seniorRabat) {
        this.seniorRabat = seniorRabat;
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

    public void setBetalingsStatusAt(int i, boolean betalingsStatus) {
        listOfMembers.get(i).betalingsStatus = betalingsStatus;
    }

    public void setMedlemstypeAt(int i, MedlemsType medlemstype) {
        listOfMembers.get(i).medlemstype = medlemstype;
    }

    public void setSeniorRabatAt(int i, boolean seniorRabat) {
        listOfMembers.get(i).seniorRabat = seniorRabat;
    }

    // Other methods
    public void deleteMember(int i) {
        // Delete member at index # of arraylist "listOfMembers"

        listOfMembers.remove(i);
    }

}
