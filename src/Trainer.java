import java.io.Serializable;
import java.util.ArrayList;

public class Trainer implements Serializable {
    private static final long serialVersionUID = 2L;

    private String name;
    private int age;
    private String address;
    private String postalCode;
    private String phone;
    private String email;
    private Gender gender;
    private SwimmingCategory swimmingCategory;

    //

    public Trainer(String name, int age, String address, String postalCode, String phone,
                   String email, Gender gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.postalCode = postalCode;
        this.phone = phone;
        this.email = email;
        this.gender = gender;

        //
        ArrayList<SwimmingCategory> thisSwimmingCategories = new ArrayList<>();
        Register.listOfTrainers.add(this);
    }

    // Setters for specific trainers at index i
    public void setNameAt(int i, String name) {
        Register.listOfTrainers.get(i).name = name;
    }

    public void setAgeAt(int i, int age) {
        Register.listOfTrainers.get(i).age = age;
    }

    public void setAddressAt(int i, String address) {
        Register.listOfTrainers.get(i).address = address;
    }

    public void setPostalCodeAt(int i, String postalCode) {
        Register.listOfTrainers.get(i).postalCode = postalCode;
    }

    public void setPhoneAt(int i, String phone) {
        Register.listOfTrainers.get(i).phone = phone;
    }

    public void setEmailAt(int i, String email) {
        Register.listOfTrainers.get(i).email = email;
    }

    public static void setGenderAt(int i, Gender gender) {
        Register.listOfTrainers.get(i).gender = gender;
    }

    public void setSwimmingCategoryAt(int i, SwimmingCategory swimmingCategory) {
        Register.listOfTrainers.get(i).swimmingCategory = swimmingCategory;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
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

    public SwimmingCategory getSwimmingCategory() {
        return swimmingCategory;
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
                Svømmekategori: %s
                """, this.getName(), this.getGender(), this.getAge(), this.getAddress(), this.getPostalCode(), this.getPhone(), this.getEmail(), this.getSwimmingCategory());
    return text;
    }
}
