package com.taruna.assign;

interface Service {
    String b();
}

class ServiceA implements Service {
    @Override
    public String b() {
        return "Q";
    }
}

class ServiceB implements Service {
    @Override
    public String b() {
        return "R";
    }
}

class Main {
    public static ServiceA service;
}

class Assign {
    public static void main(String[] args) {
        String a = Main.service.b();
        System.out.println(a);
    }
}