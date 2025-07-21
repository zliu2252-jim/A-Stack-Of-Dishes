package org.example;

/**
 * This class implements a simple stack for storing Dish objects.
 * It provides methods to push, pop, and peek dishes, and check the current stack size.
 */
public class DishStack {
    /**
     * The maximum number of dishes that can be stored in the stack.
     */
    static final int Max_size = 10;
    /**
     * This is the array that can hold the Dish objects.
     */
    Dish[] stack;
    /**
     * The index of the next available slot in the stack
     */
    int top;

    /**
     * The code Constructs the new DishStack with a fixed maximum size.
     */
    public DishStack() {
        stack = new Dish[Max_size];
        top = 0;
    }

    /**
     * Pushes a Dish object onto the top of the stack.
     * A warning message will be printed and the stack remains
     * unchanged if the stack is already full.
     *
     * @param dish the Dish object to push onto the stack
     */
    public void push(Dish dish) {
        if (top >= Max_size) {
            System.out.println("The stack is full! Cannot push more dishes.");
            return;
        }
        stack[top++] = dish;
    }

    /**
     * Removes and returns the Dish object at the top of the stack.
     * A warning message will be printed and null is returned if the stack is empty.
     *
     * @return the Dish object removed from the stack, or null if the stack is empty
     */
    public Dish pop() {
        if (top == 0) {
            System.out.println("The stack is empty! Cannot pop.");
            return null;
        }
        Dish dish = stack[--top];
        stack[top] = null; // Clean up reference
        return dish;
    }

    /**
     * Returns the Dish object at the top of the stack.
     * A warning message will be printed and null is returned if the stack is empty.
     *
     * @return the Dish object at the top of the stack, or null if the stack is empty
     */
    public Dish peek() {
        if (top == 0) {
            System.out.println("Stack is empty! Nothing to peek.");
            return null;
        }
        return stack[top - 1];
    }

    /**
     * Returns the number of Dish objects in the stack.
     *
     * @return the size of the stack
     */
    public int size() {
        return top;
    }
}