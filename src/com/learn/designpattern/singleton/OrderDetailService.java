package com.learn.designpattern.singleton;

public class OrderDetailService {

    public void save(String orderId, String product) {
        // Connection connection = new Connection("localhots", "root", "password");
        // connection.sql("INSERT INTO ORDER_DETAIL ....");
        DatabaseHelper.getConnection().sql("INSERT INTO ORDER_DETAIL ...");
    }
}
