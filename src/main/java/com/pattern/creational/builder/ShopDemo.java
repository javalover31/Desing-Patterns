package com.pattern.creational.builder;

public class ShopDemo {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setRam("2 GB").setOs("Android").getPhone();
        System.out.println(p);
    }
}
