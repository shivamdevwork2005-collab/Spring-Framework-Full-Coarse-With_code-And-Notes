package in.strikes.filterDemo.service;

import in.strikes.filterDemo.dto.Student;
import in.strikes.filterDemo.dto.StudentResponseDto;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public StudentResponseDto createStudent(Student student) {
        StudentResponseDto responseDto = new StudentResponseDto();
        responseDto.setName(student.getName());
        responseDto.setMessage("Student is saved successfully");

        return responseDto;
    }
}
