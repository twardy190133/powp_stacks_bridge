package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.IStacks;

public class StackArray implements IStacks {
	
	private static final int STACK_SIZE = 12;
	
	private static final int STACK_FULL = STACK_SIZE - 1;

	private int[] items = new int[STACK_SIZE];

	private int total = 0;

	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStacks#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStacks#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == 0;
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
			return STACK_EMPTY;
		return items[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.IStacks#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return STACK_EMPTY;
		return items[total--];
	}
}
