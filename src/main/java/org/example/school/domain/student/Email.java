package org.example.school.domain.student;

public class Email {

    private String email;

    public Email(String email) {
        if (!Email.isValid(email)) {
            throw new IllegalArgumentException("The informed e-mail is invalid.");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static boolean isValid(String email) {
        final String regex = "^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(regex);
    }
}
