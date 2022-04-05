package ro.unibuc.facade;

import java.util.Scanner;

public class FacadePatternDesing {
    public static void main(String[] args) {

        DrawShapes shapes = new DrawShapes();

        menu(); //Provide user options for drawing

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt(); //Integer.parseInt(System.console().readLine());

        while(choice > 0) {
            switch (choice) {
                case 1 -> {
                    shapes.drawCircle();
                }
                case 2 -> {
                    shapes.drawRectangle();
                }
                case 3 -> {
                    shapes.drawSquare();
                }
                case 4 -> {
                    shapes.drawTriangle();
                }
                default -> {
                    System.out.println("Option is not available. Please select one of the provided options!\n");
                }
            }
            menu();
            choice = in.nextInt();
        }
        System.exit(0);

    }

    //Provide user options for drawing
    public static void menu(){
        System.out.println("You can draw the following SHAPES");
        System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Triangle\n0. EXIT APP\n");
        System.out.println("Input the shape you want to draw:");
    }
}

