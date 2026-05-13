import java.io.Serializable;
import java.util.ArrayList;

public class Trainer implements Serializable {
    private static final long serialVersionUID = 2L;

    private String name;
    private int age;
    private String phone;
    private Gender gender;
    private ArrayList<SwimmingCategory> thisSwimmingCategories;

    public Trainer(String name, int age, String phone, Gender gender) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.thisSwimmingCategories = new ArrayList<>();
        //
        Register.listOfTrainers.add(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void addSwimmingCategory(SwimmingCategory swimmingCategory) {
        this.thisSwimmingCategories.add(swimmingCategory);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public Gender getGender() {
        return gender;
    }

    public ArrayList<SwimmingCategory> getSwimmingCategory() {
        return this.thisSwimmingCategories;
    }

    public String toString() {
        String text = "";

        text += String.format("""
                Navn: %s
                Køn: %s
                Alder: %s 
                Adresse: %s
                Postnummer: %s
                Telefon: %s
                Email: %s
                """, this.getName(), this.getGender(), this.getAge(), this.getPhone());
    return text;
    }

    public void simplePrintSwimmingCategory() {
        for (SwimmingCategory swimmingCategory : this.thisSwimmingCategories) {
        String text = "";
        text += String.format("""
                %s%n
                """);
        }
    }
}
