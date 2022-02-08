package com.solidprinciples;

class accounts extends College {
    static int b;
    public void  accounts(int salaries,int fees,int maintanance_charges){
        b = fees -(salaries+maintanance_charges);
    }

}
