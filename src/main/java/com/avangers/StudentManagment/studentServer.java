package com.avangers.StudentManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class studentServer {
    @Autowired
    studentRepository StudentRepository;
//    add_Student
    public String addStudent(Student student){
        return StudentRepository.addStudent(student);
    }

//    get_Student
    public Student getStudent(int id)
    {
        return StudentRepository.getStudent(id);
    }

//    Update Student
    public String updateStudent(int id, int age){
        return StudentRepository.updatingStudent(id, age);
    }

//    delete Student
    public String deleteStudent(int id)
    {
        return StudentRepository.deleteStudent(id);
    }

}
