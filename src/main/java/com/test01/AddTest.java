package com.test01;

public class AddTest {

    public static void main(String[] args) {
        AddTest addTest = new AddTest();
        int result = addTest.add(3, 5);
        System.out.println(result);

    }

    public int add(int a, int b) {
        return a+b;
    }
}
