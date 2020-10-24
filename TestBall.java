package ru.mirea.lab2;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball (28, 28);
        System.out.println(b1);
        b1.move(20, 10);
        System.out.println(b1);
    }
}
