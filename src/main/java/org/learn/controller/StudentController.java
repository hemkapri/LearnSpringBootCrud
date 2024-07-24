package org.learn.controller;

import org.learn.pojo.StudentData;
import org.learn.pojo.studentDataUpdate;
import org.learn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @RequestMapping(value = "/add-student", method = RequestMethod.POST)
    public String addStudent(@RequestBody StudentData data){
        long studentID = service.addStudentData(data);
        return "Student has been created with id :" + studentID;
    }

    @RequestMapping(value = "/get-student/{studentId}", method = RequestMethod.GET)
    public String getStudent(@PathVariable("studentId") long studentId){
        StudentData data = service.getStudentData(studentId);
        if(data != null){
            return "Student Data is:" + data;
        }
        else {
            return "Student does not exist with this Student ID:" + studentId;
        }

    }

    @RequestMapping(value = "/delete-student/{studentId}", method = RequestMethod.GET)
    public String deleteStudent(@PathVariable("studentId") long studentId){
        service.deleteStudent(studentId);
        return "Student Data Deleted successfully::" + studentId;
    }

    @RequestMapping(value = "/update-student", method = RequestMethod.POST)
    public String updateStudent(@RequestBody studentDataUpdate updateData){
       service.updateStudent(updateData);
      return "Student Data Updated Successfully.";
    }
}
