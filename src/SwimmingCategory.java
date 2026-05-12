public class SwimmingCategory {
    private String title;

    public SwimmingCategory(String title) {
        this.title = title;

        Register.listOfCategories.add(this);
    }

    public String getTitle() {
        return title;
    }
}
