package models;

import java.util.ArrayList;
import java.util.List;

public class Student {
    public Student(String name){
        this.name = name;
    }
    String name;

    List<Integer> grades = new ArrayList<>();
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public float getAverageGrade(){
        if(this.grades.isEmpty()){
            System.err.println("ERROR: Grades list is Empty!");
            return 0;
        } else {
            int sum = 0;
            for(Integer Grade:this.grades){
                sum += Grade;
            }
            return (float) sum /this.grades.size();
        }
    }
}
