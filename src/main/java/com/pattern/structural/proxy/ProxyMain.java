package com.pattern.structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Image image = new ProxyImage("pap.image");
        image.display();

        image.display();

        String ss = "ankitpathak";
         String s = "ankit";
        String s2 = "pathak";
//        s2 = s.concat(s2);
        s2 = s+"pathak";
        System.out.println(ss==s2);
        System.out.println(ss.equals(s2));
    }
}
