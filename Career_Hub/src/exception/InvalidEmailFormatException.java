package exception;


public class InvalidEmailFormatException extends Exception {
    public InvalidEmailFormatException(String errorMessage) {
        super(errorMessage);
    }
}

// class Applicant2 {
//    // Other attributes and methods...
//
//    public void createProfile(String email, String firstName, String lastName, String phone) {
//        try {
//            validateEmail(email);
//            // Proceed with applicant profile creation
//        } catch (InvalidEmailFormatException e) {
//            System.out.println("Error: Invalid email format - " + e.getMessage());
//        }
//    }
//
//    private void validateEmail(String email) throws InvalidEmailFormatException {
//        if (!email.contains("@")) {
//            throw new InvalidEmailFormatException("Email must contain @ symbol");
//        }
//      
//    }
//}
