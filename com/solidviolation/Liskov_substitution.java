package com.solidviolation;



class student_authen implements College_Website{

    @Override
    public void login() {
        System.out.println("Student have logged in");
    }

    @Override
    public void modify_attendance() {
        throw new UnsupportedOperationException("This is not supported");
    }
}
