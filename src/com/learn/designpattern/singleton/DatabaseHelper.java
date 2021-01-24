package com.learn.designpattern.singleton;

public class DatabaseHelper {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null){
            connection = new Connection("localhost", "root", "password");
        }

        return connection;
    }
}
