package com.avangers.StudentManagment;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class studentRepository {
    Map<Integer,Student> db = new HashMap<>();

//    adding a student
//    And this is the function that adds my student into database
    public String addStudent(Student student){
        int id = student.getAdmnNo();
        db.put(id, student);
        return "Student Added Successfully";
    }

//    getting the student, with id
    public Student getStudent(int id){
        return db.get(id);
    }

//    Updating the student
    public String updatingStudent(int id, int age)
    {
        if(!db.containsKey(id)){
            return "Invalid ID";
        }
        db.get(id).setAge(20);
        return "Age Updated Successfully";
    }

//    deleting the student
    public String deleteStudent(int id){
        if(!db.containsKey(id))
        {
            return "Invalid ID";
        }
        db.remove(id);
        return "Student Removed Successfully";
    }
}
//here we can clearly see that here we didn't make any API's with Repository
//All we made here is , functions , which will interact with DataBase
//and here our DataBase is HashMap.