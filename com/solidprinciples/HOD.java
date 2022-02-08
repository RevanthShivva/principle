package com.solidprinciples;

class HOD implements StudentMarks,Marks_change,Grades {

    @Override
    public void display_marks() {
        System.out.println("Marks Displayed");
    }

    @Override
    public void modify_marks() {
        System.out.println("Modified marks");
    }

    @Override
    public void calculate_grades() {
        System.out.println("Calculated grades");
    }

    @Override
    public void addMarks() {
        System.out.println("Added marks");
    }
}
