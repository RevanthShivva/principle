package com.solidprinciples;

class payment {
    private databaseconnection d;
    public void connct(databaseconnection my){
        this.d = my;
        System.out.println("Connected");
    }
}
