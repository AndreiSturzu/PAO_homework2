package ro.unibuc.factory;

import java.util.Scanner;

public class FactoryPatternDesign {

    public static void main(String[] args) {
        DrawShapes shapes = new DrawShapes();

        menu(); //Provide user options for drawing

        String choice;
        Scanner in = new Scanner(System.in);
        choice = in.nextLine();

        while(!choice.equalsIgnoreCase("exit")) {
            Shape selected_shape = shapes.drawShape(choice);
            selected_shape.draw();
            menu();
            choice = in.nextLine();
        }

        System.exit(0);
    }

    public static void menu(){
        System.out.println("You can draw the following SHAPES:");
        System.out.println(" - Circle\n - Rectangle\n - Square\n - Triangle\n\nTYPE exit to stop the APP\n");
        System.out.println("**********************************************************************************************");
        System.out.println("If the choice you enter does not match the options provided, the app will draw a DEFAULT SHAPE");
        System.out.println("**********************************************************************************************\n");

        System.out.println("Input the shape you want to draw:");
    }

}