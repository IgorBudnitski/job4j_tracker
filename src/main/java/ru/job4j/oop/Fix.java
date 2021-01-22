package ru.job4j.oop;

public class Fix {
    private String desc;

    public Fix(String text){
        desc = text;
    }

    void display(){
        System.out.println("Desc: " + desc);
    }

    public static void main(String[] args) {
        Fix fix = new Fix("Helloooo");
        fix.display();
    }
}
