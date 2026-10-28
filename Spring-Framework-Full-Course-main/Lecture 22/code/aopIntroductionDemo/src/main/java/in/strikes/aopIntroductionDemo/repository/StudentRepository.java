package in.strikes.aopIntroductionDemo.repository;

import in.strikes.aopIntroductionDemo.dto.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public void save(Student student) {
        System.out.println("Student saved");

    }
}
