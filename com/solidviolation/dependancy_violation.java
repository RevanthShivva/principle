package com.solidviolation;

class CollegeDatabase{
    private mysqlconnect m;
    public void connect(mysqlconnect my){
        this.m = my;
        System.out.println("Connected");
    }
}


