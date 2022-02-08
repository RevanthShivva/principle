package com.solidprinciples;



class TeacherAuthen implements College_Website,principal {

    @Override
    public void login() {
        System.out.println("Teacher have logged in");
    }

    @Override
    public void modify_attendance() {
        System.out.println("Modified Attendance");
    }
}

