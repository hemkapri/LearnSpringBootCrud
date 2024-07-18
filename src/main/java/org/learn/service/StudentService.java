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

//        Student s = new Student();
//        s.setAddress("Pith");
//        s.setFirstName("Hem");
//        s.setLastName("kapri");

        Student s1 = new Student(1L,"Mukesh", "Kapri","Khatima");
        Student s2 = new Student(2L,"Hwm", "Kapri","Pithoragarh");
        Student s3 = new Student(3L,"Manisha", "Kapri","Didihat");

        //IStudentRepo.save(s);
        IStudentRepo.save(s1);
        IStudentRepo.save(s2);
        IStudentRepo.save(s3);


    }
}
