package org.example;

/**
 * Driver class to show the DishStack is working correctly.
 * Creates a DishStack, pushes several dishes onto it, pops dishes,
 * and displays the stack's size.
 */
public class App {
    public static void main(String[] args) {
        // Create a new stack for Dish objects
        DishStack stack = new DishStack();

        // Create several Dish objects with different descriptions
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        // Display the initial size of the stack
        System.out.println("Initial stack size: " + stack.size());

        // Push all the created Dish objects onto the stack
        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);

        // Display the size of the stack after pushing four dishes
        System.out.println("Size after pushes: " + stack.size());

        // Peek at the top dish on the stack without removing it
        System.out.println("Top dish (peek): " + stack.peek().description);

        // Pop the top dish from the stack and display its description
        Dish popped = stack.pop();
        System.out.println("Popped dish: " + popped.description);

        // Pop another dish from the stack and display its description
        Dish anotherPopped = stack.pop();
        System.out.println("Another popped dish: " + anotherPopped.description);

        // Display the final size of the stack
        System.out.println("Final stack size: " + stack.size());
    }
}
