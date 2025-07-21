package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for DishStack functionality.
 * These tests verify that the stack operates correctly for push, pop, peek,
 * and full stack behavior.
 */
class AppTest {

    /**
     * Tests that pushing dishes onto the stack increases the size correctly.
     */
    @Test
    void testPushAndSize() {
        DishStack stack = new DishStack();
        stack.push(new Dish("Dish A"));
        stack.push(new Dish("Dish B"));
        assertEquals(2, stack.size());
    }

    /**
     * Tests that popping a dish returns the top item and reduces the stack size.
     */
    @Test
    void testPopReturnsTop() {
        DishStack stack = new DishStack();
        stack.push(new Dish("First"));
        stack.push(new Dish("Second"));
        Dish popped = stack.pop();
        assertNotNull(popped);
        assertEquals("Second", popped.description);
        assertEquals(1, stack.size());
    }

    /**
     * Tests the peek returns the top dish without removing it.
     */
    @Test
    void testPeekDoesNotRemove() {
        DishStack stack = new DishStack();
        stack.push(new Dish("Only Dish"));
        Dish peeked = stack.peek();
        assertNotNull(peeked);
        assertEquals("Only Dish", peeked.description);
        assertEquals(1, stack.size());
    }

    /**
     * Tests that the stack does not allow more than the maximum number of dishes.
     */
    @Test
    void testPushToFullStack() {
        DishStack stack = new DishStack();
        for (int i = 0; i < 10; i++) {
            stack.push(new Dish("Dish " + i));
        }
        stack.push(new Dish("Overflow Dish"));
        assertEquals(10, stack.size());
    }
}
