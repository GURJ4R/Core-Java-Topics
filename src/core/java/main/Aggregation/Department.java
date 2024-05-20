package core.java.main.Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Department {
     private String name;
     private List<Teacher> teachers=new ArrayList<>();
     
     public Department(String name) {
    	 this.name=name;
     }
     
     public void addTeacher(Teacher teacher) {
    	 teachers.add(teacher);
     }
}
