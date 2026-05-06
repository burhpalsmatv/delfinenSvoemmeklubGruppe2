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

    public Member(String name, MedlemsType medlemsType, String phone){
        this.name = name;
        this.medlemstype = medlemsType;
        this.phone = phone;
    }

    public Member (){

    }

<<<<<<< Updated upstream
=======

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

    //GETTERS BELOW:

    public String getName() {
        return this.name;
    }
>>>>>>> Stashed changes
}
