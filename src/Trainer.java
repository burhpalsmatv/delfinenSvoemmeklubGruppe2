import java.util.ArrayList;

public class Trainer {
    private String name;
    private int age;
    private String address;
    private String postalCode;
    private String phone;
    private String email;
    private Gender gender;
    private SwimmingCategory swimmingCategory;

    //
    private static ArrayList<Trainer> listOfTrainers = new ArrayList<>();
    //

    public Trainer(String name, SwimmingCategory swimmingCategory){
        this.name = name;
        this.swimmingCategory = swimmingCategory;

        //
        listOfTrainers.add(this);
        //
    }

    // DEFAULT SETTERS BELOW

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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

    public void setSwimmingCategory(SwimmingCategory swimmingCategory) {
        this.swimmingCategory = swimmingCategory;
    }
    // DEFAULT SETTERS ABOVE ^^^^^

    // Setters for specific trainers at index i

    public void setNameAt(int i, String name) {
        listOfTrainers.get(i).name = name;
    }

    public void setAgeAt(int i, int age) {
        listOfTrainers.get(i).age = age;
    }

    public void setAddressAt(int i, String address) {
        listOfTrainers.get(i).address = address;
    }

    public void setPostalCodeAt(int i, String postalCode) {
        listOfTrainers.get(i).postalCode = postalCode;
    }

    public void setPhoneAt(int i, String phone) {
        listOfTrainers.get(i).phone = phone;
    }

    public void setEmailAt(int i, String email) {
        listOfTrainers.get(i).email = email;
    }

    public void setGenderAt(int i, Gender gender) {
        listOfTrainers.get(i).gender = gender;
    }

    public void setSwimmingCategoryAt(int i, SwimmingCategory swimmingCategory) {
        listOfTrainers.get(i).swimmingCategory = swimmingCategory;
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

    public void deleteTrainer(int i) {
        // Delete member at index # of arraylist "listOfMembers"

        listOfTrainers.remove(i);
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

    public void setSwimmingCategory(SwimmingCategory swimmingCategory) {
        this.swimmingCategory = swimmingCategory;
    }
}
