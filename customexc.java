class invalidAge extends Exception {
    public invalidAge(String str) {
        super(str);
    }
}

public class customexc {
    static void validate(int age) throws invalidAge {
        if (age < 18) {
            throw new invalidAge("age is not valide to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try {
            validate(17);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + e);
        }
        System.out.println("rest of the code...");

    }
}
