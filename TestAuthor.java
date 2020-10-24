package ru.mirea.lab2;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Robert", "robert1999@gmail.com", 'm');
        System.out.println("Author is " +a1.getName()
                + ", email:" +a1.getEmail()
                + ", gender:" +a1.getGender());
        Author a2 = new Author("Fionna", "fionna1992@gmail.com", 'f');
        System.out.println("Author is " +a2.getName()
                + ", email:" +a2.getEmail()
                + ", gender:" +a2.getGender());
        Author a3 = new Author("Axel", "axekkrause@index.com", 'm');
        System.out.println("Author is " +a3.getName()
                + ", email:" +a3.getEmail()
                + ", gender:" +a3.getGender());
    }
}
