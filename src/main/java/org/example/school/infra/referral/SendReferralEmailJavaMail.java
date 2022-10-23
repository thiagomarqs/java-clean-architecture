package org.example.school.infra.referral;

import org.example.school.domain.referral.SendReferralEmail;
import org.example.school.domain.student.Student;

public class SendReferralEmailJavaMail implements SendReferralEmail {

    @Override
    public void sendTo(Student referral) {
        // Lógica com Java Mail...
    }
}
