package ru.job4j.oop.Kolobok;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEatBall(ball);
        ball.escape();
        wolf.tryEatBall(ball);
        ball.escape();
        fox.tryEatBall(ball);
        ball.escape();
    }
}
