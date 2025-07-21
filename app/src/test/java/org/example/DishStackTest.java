package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for DishStack functionality.
 * These tests verify push, pop, peek, and full-stack behaviors.
 */
class DishStackTest {

    /**
     * Tests that pushing dishes onto the stack increases its size correctly.
     */
    @Test
    void testPushAndSize() {
        DishStack stack = new DishStack();
        stack.push(new Dish("Dish A"));
        stack.push(new Dish("Dish B"));
        assertEquals(2, stack.size());
    }

    /**
     * Tests that popping returns the most recently pushed dish
     * and reduces the size of the stack.
     */
    @Test
    void testPopReturnsTopAndReducesSize() {
        DishStack stack = new DishStack();
        stack.push(new Dish("First"));
        stack.push(new Dish("Second"));
        Dish popped = stack.pop();
        assertNotNull(popped);
        assertEquals("Second", popped.description);
        assertEquals(1, stack.size());
    }

    /**
     * Tests the peek shows the top dish without removing it from the stack.
     */
    @Test
    void testPeekShowsTopWithoutRemoving() {
        DishStack stack = new DishStack();
        stack.push(new Dish("Solo Dish"));
        Dish peeked = stack.peek();
        assertNotNull(peeked);
        assertEquals("Solo Dish", peeked.description);
        assertEquals(1, stack.size());
    }

    /**
     * Tests that pushing to a full stack does not increase its size.
     */
    @Test
    void testPushToFullStackShowsFull() {
        DishStack stack = new DishStack();
        for (int i = 0; i < DishStack.Max_size; i++) {
            stack.push(new Dish("Dish " + i));
        }
        stack.push(new Dish("Overflow Dish"));
        assertEquals(DishStack.Max_size, stack.size());
    }
}