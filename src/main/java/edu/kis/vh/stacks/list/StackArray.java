package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.IStacks;

public class StackArray implements IStacks {
	private static final int STACK_FULL = 11;

	private static final int STACK_SIZE = 12;

	private int[] ITEMS = new int[STACK_SIZE];

	private int total = EMPTY;

	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStacks#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStacks#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == EMPTY;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStacks#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == STACK_FULL;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStacks#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY;
		return ITEMS[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStacks#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY;
		return ITEMS[total--];
	}
}
