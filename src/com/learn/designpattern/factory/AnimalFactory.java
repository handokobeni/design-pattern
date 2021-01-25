package com.learn.designpattern.factory;

public class AnimalFactory {

    public static Animal create(String type) {
        if (type == "tiger") {
            return new TigerNew();
        }

        return new Cat();
    }
}
