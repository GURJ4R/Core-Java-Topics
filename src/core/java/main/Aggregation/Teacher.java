package core.java.main.Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    List<Student> students=new ArrayList<>();
    
    public Teacher(String name) {
    	this.name=name;
    }
    
    public void addStudent(Student student) {
    	students.add(student);
    }
}
