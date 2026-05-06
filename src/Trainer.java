public class Trainer {
    private String name;
    private int age;
    private String adress;
    private String postalcode;
    private String phone;
    private String email;
    private Gender gender;
    private SwimmingCategory swimmingCategory;

    public Trainer(String name, SwimmingCategory swimmingCategory){
        this.name = name;
        this.swimmingCategory = swimmingCategory;
    }

}
