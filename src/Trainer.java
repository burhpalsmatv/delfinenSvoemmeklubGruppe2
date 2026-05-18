import java.io.Serializable;
import java.util.ArrayList;

public class Trainer implements Serializable {
    private static final long serialVersionUID = 5L;

    private String name;
    private int age;
    private String phone;
    private Gender gender;
    private ArrayList<SwimmingCategory> assignedSwimmingCategories;
    String trainerID;

    public Trainer(String name, int age, String phone, Gender gender) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.gender = gender;
        this.assignedSwimmingCategories = new ArrayList<>();
        this.trainerID = IDgenerator.generateTrainerID();
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
        this.assignedSwimmingCategories.add(swimmingCategory);
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPhone() {
        return this.phone;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String getTrainerID() {
        return this.trainerID;
    }

    public ArrayList<SwimmingCategory> getSwimmingCategory() {
        return this.assignedSwimmingCategories;
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

    public void simplePrintSwimmingCategory() { // Find en måde at fleætte metoden ind i vores toString
        for (SwimmingCategory swimmingCategory : this.assignedSwimmingCategories) {
            String text = "";
            text += String.format("""
                %s%n
                """, swimmingCategory);
        }
    }


}
