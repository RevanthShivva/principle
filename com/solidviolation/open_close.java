package com.solidviolation;

class rec{
    public void show(Stu_Record str){
        if(str instanceof Studentmarksdisplay){
            Studentmarksdisplay studen1 = (Studentmarksdisplay) str;
            studen1.display_marks();
        } else if(str instanceof Student_attendance){
            Student_attendance studen1 = (Student_attendance) str;
            studen1.display_attendance();
        }
    }
}
