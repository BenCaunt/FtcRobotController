package org.firstinspires.ftc.teamcode;

public class firstProgram {

    public static void main(String args[]) {

        System.out.println("The for loop");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        boolean isComplete = false;
        int a = 0;

        while (! isComplete) {

            System.out.println("The while loop");

            if (a == 10) {
                System.out.println("a is 10");
            } else if (a == 5) {
                System.out.println("a is 5");
            } else {
                System.out.println("a is neither 10 nor 5");
            }

            isComplete = true;
        }

    }

}
