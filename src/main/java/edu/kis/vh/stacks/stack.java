package edu.kis.vh.stacks;

public class stack {

	private static final int STACK_FULL = 11;

	private static final int STACK_SIZE = 12;

	private static final int STACK_EMPTY = -1;

	private int[] ITEMS = new int[STACK_SIZE];

	private int total = STACK_EMPTY;

	public int getTotal() {
		return total;
	}

	/**
	 * @param i
	 * @return void
	 * Pushes argument i on the stack
	 */
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	/**
	 * @return true if stack is empty, otherwise - returns false
	 */
	public boolean isEmpty() {
		return total == STACK_EMPTY;
	}

	/**
	 * @return true if stack is full, otherwise - returns false
	 */
	public boolean isFull() {
		return total == STACK_FULL;
	}

	/**
	 * @return an element from top of the stack
	 */
	public int top() {
		if (isEmpty())
			return STACK_EMPTY;
		return ITEMS[total];
	}

	/**
	 * @return integer
	 * Removes top element from the stack
	 */
	public int pop() {
		if (isEmpty())
			return STACK_EMPTY;
		return ITEMS[total--];
	}

}
