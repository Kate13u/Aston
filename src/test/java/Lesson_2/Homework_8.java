package Lesson_2;

public class Homework_8 {

    public static void main(String[] args) {
        printStringTimes("Домашнее задание!", 3);
    }
    public static void printStringTimes(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}