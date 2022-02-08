package com.solidviolation;
import java.util.*;
 class College{
    private String collegeName ;
    private String city;

    static int b;
    static ArrayList<String> f = new ArrayList<String>();
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }
    public void  accounts(int salaries,int fees,int maintanance_charges){
        b = fees -(salaries+maintanance_charges);
    }
    public void canteen(ArrayList<String> food)
    {
         f = food;
    }
}
