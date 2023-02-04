package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email email = new Email("Rohan","Rai");
        System.out.println(email.showInfo());

//        email.setAlternateEmail("ps@gmail.com");
//        System.out.println(email.getAlternateEmail());
    }
}
