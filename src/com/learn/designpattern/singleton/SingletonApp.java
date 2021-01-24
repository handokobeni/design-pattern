package com.learn.designpattern.singleton;

public class SingletonApp {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.save("0001");

        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save("0001", "indomie");
        orderDetailService.save("0001", "sabun");
        orderDetailService.save("0001", "pasta");
    }
}
