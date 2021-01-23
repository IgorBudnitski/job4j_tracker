package ru.job4j.oop.RedHat;

public class Story {
    public static void main(String[] args) {
        Girl girl = new Girl();
        Pioneer petya = new Pioneer();
        Wolf wolf = new Wolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
