public class ContactForm implements Form {
    private String title;
    private String emailField;

    public ContactForm(String title, String emailField) {
        this.title = title;
        this.emailField = emailField;
    }

    @Override
    public Form clone() {
        return new ContactForm(this.title, this.emailField);
    }

    @Override
    public void display() {
        System.out.println("Contact Form: " + title);
        System.out.println("Email Field: " + emailField);
    }
}
