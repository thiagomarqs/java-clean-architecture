package org.example.school.domain.referral;

import org.example.school.domain.student.Student;

public interface SendReferralEmail {

    void sendTo(Student referral);
}
