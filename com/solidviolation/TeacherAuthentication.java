package com.solidviolation;

class TeacherAuthen implements College_Website{

    @Override
    public void login() {
        System.out.println("Teacher have logged in");
    }

    @Override
    public void modify_attendance() {
        System.out.println("Modified Attendance");
    }
}
