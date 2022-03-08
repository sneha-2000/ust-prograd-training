package com.example.demoAPOApplication;

import org.springframework.stereotype.Component;

@Component
public class StudentMarks {
    private String name;
    private int marks;

    public StudentMarks(){
        System.out.println("Student marks object created");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name= name;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(){
        this.marks= marks;
    }

    // void display
   //public void show(){-----> earlier
//        Helper.log();
    public int show(){
        System.out.println("inside int show");
    return 2;
    }

    public void showMarks(){
        double sub1=90.0;
        double sub2=80.0;
        double sub3=95.0;
        double sum= sub1+sub2+sub3;
        double avg= sum/3;
        System.out.println(avg);
    }

}
