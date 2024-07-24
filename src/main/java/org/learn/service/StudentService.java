package org.learn.service;

import org.learn.entity.Student;
import org.learn.pojo.StudentData;
import org.learn.pojo.studentDataUpdate;
import org.learn.repo.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepository IStudentRepo;

    public long addStudentData(StudentData data){
        Student object = new Student();
        object.setFirstName(data.getFirstName());
        object.setLastName(data.getLastName());
        object.setAddress(data.getAddress());
        Student savedStudent = IStudentRepo.save(object);
        return savedStudent.getStudentId();
    }

    public StudentData getStudentData(Long studentId){
        Optional<Student> optional = IStudentRepo.findById(studentId);
        Student entity = optional.orElse(null);

        if(entity != null){
            StudentData data = new StudentData();
            data.setFirstName(entity.getFirstName());
            data.setLastName(entity.getLastName());
            data.setAddress(entity.getAddress());
            return data;
        }
        return null;
    }

    public void deleteStudent(Long studentId){
        IStudentRepo.deleteById(studentId);
    }

    public Student updateStudent(studentDataUpdate updateData) {


        Optional<Student> data = IStudentRepo.findById(updateData.getStudentId());

        Student data1 = data.orElse(null);

        if (data1 != null) {

            data1.setStudentId(updateData.getStudentId());
            data1.setFirstName(updateData.getFirstName());
            data1.setLastName(updateData.getLastName());
            data1.setAddress(updateData.getAddress());
            IStudentRepo.save(data1);

        }
        else{
            Student object1 = new Student();
            object1.setStudentId(updateData.getStudentId());
            object1.setFirstName(updateData.getFirstName());
            object1.setLastName(updateData.getLastName());
            object1.setAddress(updateData.getAddress());
            IStudentRepo.save(object1);
        }
        return null;

    }

}
