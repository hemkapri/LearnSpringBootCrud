package org.learn.service;

import org.learn.entity.Student;
import org.learn.repo.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    IStudentRepository IStudentRepo;

    public void addStudent(){

        Student s = new Student();
        s.setAddress("Pith");
        s.setFirstName("Hem");
        s.setLastName("kapri");

        IStudentRepo.save(s);
    }
}
