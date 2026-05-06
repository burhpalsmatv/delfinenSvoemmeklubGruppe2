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

}
