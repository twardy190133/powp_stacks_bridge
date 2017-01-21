package edu.kis.vh.stacks.list;

import edu.kis.vh.stacks.IStacks;

public class StackList implements IStacks {

	private Node last;

	/**
	 * @param i
	 */
	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
