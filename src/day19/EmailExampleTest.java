package day19;

public class EmailExampleTest {
    private static CheckEmail checkEmail;
    public static final String[] validEmail = new String[]{"a@gamil.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        checkEmail = new CheckEmail();
        for (String email : validEmail) {
            boolean isvalid = checkEmail.validate(email);
            System.out.println("Email is " + email + " is valid " + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = checkEmail.validate(email);
            System.out.println("Email is " + email +     " is valid " + isvalid);
        }
    }
}
