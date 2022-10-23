package org.example.school.domain.referral;

import org.example.school.domain.student.Student;

import java.time.LocalDateTime;

public class Referral {

    private Student referral;
    private Student referred;
    private LocalDateTime referralDate;

    public Referral(Student referral, Student referred, LocalDateTime referralDate) {
        this.referral = referral;
        this.referred = referred;
        this.referralDate = referralDate;
    }

    public Student getReferral() {
        return referral;
    }

    public Student getReferred() {
        return referred;
    }

    public LocalDateTime getReferralDate() {
        return referralDate;
    }
}
