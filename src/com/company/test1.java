package com.company;

public class test1 {
    public static void main(String[] args) {
        User u = new User();
        u.addr = new Address();
        u.addr.city = "wuhan";
        System.out.println(u.addr.city);
    }
}
