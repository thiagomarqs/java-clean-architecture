package org.example;

public class CPF {

    private String cpf;

    public CPF(String cpf) {
        if (!CPF.isValid(cpf)) {
            throw new IllegalArgumentException("The informed CPF is invalid.");
        }
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static boolean isValid(String cpf) {
        final String regex = "^\\d{3}[.]\\d{3}[.]\\d{3}-\\d{2}$";
        return cpf.matches(regex);
    }
}
