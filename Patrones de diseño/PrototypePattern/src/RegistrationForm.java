public class RegistrationForm implements Form {
    private String title;
    private String description;

    public RegistrationForm(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public Form clone() {
        return new RegistrationForm(this.title, this.description);
    }

    @Override
    public void display() {
        System.out.println("Registration Form: " + title);
        System.out.println("Description: " + description);
    }
}
