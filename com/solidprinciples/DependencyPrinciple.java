package com.solidprinciples;


class mysqlconnect1 implements databaseconnection {
    String database;
    @Override
    public void connectwiddata() {
        System.out.println("Connection is established");
    }
}

