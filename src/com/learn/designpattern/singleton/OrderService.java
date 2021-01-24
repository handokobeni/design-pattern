package com.learn.designpattern.singleton;

public class OrderService {

    public void save(String orderId) {
        // Connection connection = new Connection("localhots", "root", "password");
        // connection.sql("INSERT INTO ORDER ....");
        DatabaseHelper.getConnection().sql("INSERT INTO ORDER ....");
    }
}
