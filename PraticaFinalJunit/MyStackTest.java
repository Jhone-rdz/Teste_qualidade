import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    void shouldBeEmptyWhenNewStackIsCreated() {
        MyStack stack = new MyStack();

        assertTrue(stack.isEmpty());
    }

    @Test
    void shouldNotBeEmptyAfterPush() {
        MyStack stack = new MyStack();
        stack.push("a");

        assertFalse(stack.isEmpty());
    }

    @Test
    void shouldPopItemsInLifoOrder() {
        MyStack stack = new MyStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        assertEquals("c", stack.pop());
        assertEquals("b", stack.pop());
        assertEquals("a", stack.pop());
    }

    @Test
    void shouldBeEmptyAfterPoppingAllItems() {
        MyStack stack = new MyStack();
        stack.push("a");
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    void shouldReturnNullWhenPoppingEmptyStack() {
        MyStack stack = new MyStack();

        assertNull(stack.pop());
    }

    @Test
    void shouldPeekTopItemWithoutRemovingIt() {
        MyStack stack = new MyStack();
        stack.push("a");
        stack.push("b");

        assertEquals("b", stack.peek());
        assertFalse(stack.isEmpty());
        assertEquals("b", stack.pop());
    }

    @Test
    void shouldReturnNullWhenPeekingEmptyStack() {
        MyStack stack = new MyStack();

        assertNull(stack.peek());
    }

    @Test
    void shouldMaintainLifoOrderWithInterleavedOperations() {
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        assertEquals("2", stack.pop());

        stack.push("3");
        assertEquals("3", stack.pop());
        assertEquals("1", stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void shouldCreateAmbiguityWhenPushingNullValue() {
        MyStack stack = new MyStack();
        stack.push(null);

        assertFalse(stack.isEmpty());
        assertNull(stack.peek());
        assertNull(stack.pop());
    }
}