public class Trainer {
    private String name;
    private int age;
    private String address;
    private String postalCode;
    private String phone;
    private String email;
    private Gender gender;
    private SwimmingCategory swimmingCategory;


    public Trainer(String name, int age, String address, String postalCode, String phone, String email,
                   Gender gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.postalCode = postalCode;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
    }
}
