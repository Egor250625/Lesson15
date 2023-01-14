package com.example.part2;

public class Part2 {
    public static void main(String[] args) {

        try {
            int[] array = {123, 3, 1, 2, 45};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Wrong index,try again");
        }
        try {
            int b = 123 / 0;
            System.out.println(b);
        }
        catch (ArithmeticException exception){
            System.out.println("You can't divide by zero,try another number");
        }

    }
}
