public class Main {
    public static void main(String[] args) {
        // Crear instancias originales
        RegistrationForm registrationForm = new RegistrationForm("User Registration", "Please fill out your details.");
        ContactForm contactForm = new ContactForm("Contact Us", "Enter your email address.");

        // Clonar formularios
        RegistrationForm clonedRegistrationForm = (RegistrationForm) registrationForm.clone();
        ContactForm clonedContactForm = (ContactForm) contactForm.clone();

        // Mostrar información de los formularios originales
        System.out.println("Original Forms:");
        registrationForm.display();
        contactForm.display();

        // Mostrar información de los formularios clonados
        System.out.println("\nCloned Forms:");
        clonedRegistrationForm.display();
        clonedContactForm.display();
    }
}
