package ru.job4j.oop;

public class Cat {
    /*    public String sound() {
            String voice = "may-may";
            return voice;
        }

        public static void main(String[] args) {
            Cat peppy = new Cat();
            String say = peppy.sound();
            System.out.println("Peppy says " + say);
        }*/
    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name + " eats " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        //System.out.println("Here is Gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("GavGav");
        gav.show();
        //System.out.println("Here is Black's food");
        Cat black = new Cat();
        black.giveNick("BlackBlack");
        black.eat("sosiska");
        black.show();
    }
}
