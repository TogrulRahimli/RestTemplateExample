package com.template.model;

public class TestClass {

    public static void main(String[] args) {
        User user = User.builder().id(1).age(25).name("Togrul").build();

        System.out.println(user);
    }
}
