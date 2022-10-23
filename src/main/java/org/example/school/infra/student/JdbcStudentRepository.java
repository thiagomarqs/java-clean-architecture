package org.example.school.infra.student;

import org.example.school.domain.student.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcStudentRepository implements StudentRepository {

    private final Connection connection;
    private final StudentBuilder builder = new StudentBuilder();

    public JdbcStudentRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void enroll(Student student) {
        try {
            String sql = "INSERT INTO STUDENT VALUES (?, ?, ?)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, student.getCpf());
            pst.setString(2, student.getName());
            pst.setString(3, student.getEmail());
            pst.execute();

            sql = "INSERT INTO PHONE VALUES (?,?,?)";
            pst = connection.prepareStatement(sql);

            for (Phone phone: student.getPhones()) {
                pst.setString(1, student.getCpf());
                pst.setString(2, phone.getDdd());
                pst.setString(3, phone.getPhone());
                pst.execute();
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Student findByCPF(CPF cpf) {
        try {
            String sql =
                    "SELECT S.CPF, S.NAME, S.EMAIL, P.DDD, P.PHONE " +
                    "FROM STUDENT S " +
                    "WHERE S.CPF = ? " +
                    "INNER JOIN PHONE P " +
                    "ON P.CPF = S.CPF";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, cpf.getCpf());
            ResultSet resultSet = pst.executeQuery();

            resultSet.next();

            String name = resultSet.getString("name");
            String CPF = resultSet.getString("cpf");
            String email = resultSet.getString("email");
            String ddd = resultSet.getString("ddd");
            String phone = resultSet.getString("phone");

            StudentBuilder studentBuilder = builder
                    .withNameCPFEmail(name, CPF, email)
                    .withPhone(ddd, phone);

            while(resultSet.next()) {
                ddd = resultSet.getString("ddd");
                phone = resultSet.getString("phone");
                studentBuilder.withPhone(ddd, phone);
            }

            return studentBuilder.build();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Student> findAllEnrolledStudents() {
        return null;
    }

}
