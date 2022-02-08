package com.solidviolation;


class stu implements StudentMarks{

    @Override
    public void display_marks() {
        System.out.println("Student marks displayed");
    }

    @Override
    public void modify_marks() {
        throw new UnsupportedOperationException("This is not supported");
    }

    @Override
    public void calculate_grades() {
        throw new UnsupportedOperationException("This is not supported");
    }

    @Override
    public void addMarks() {
        throw new UnsupportedOperationException("This is not supported");
    }
}

