package org.example.school.domain.student;

public class Phone {

    private String ddd;
    private String phone;

    public Phone(String ddd, String phone) {
        if(!Phone.isValid(ddd, phone)) {
            throw new IllegalArgumentException("The informed phone number is invalid. Its DDD must contain exactly 2 characters and the number must contain between 8 to 9 characters.");
        }
        this.ddd = ddd;
        this.phone = phone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static boolean isValid(String ddd, String phone) {
        return isDDDValid(ddd) && isPhoneValid(phone);
    }

    public static boolean isDDDValid(String ddd) {
        return ddd.matches("^\\d{2}$");
    }

    public static boolean isPhoneValid(String phone) {
        return phone.matches("^(\\d{8})|(\\d{9})$");
    }
}
