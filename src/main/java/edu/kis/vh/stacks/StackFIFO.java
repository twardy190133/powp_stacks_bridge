package edu.kis.vh.stacks;

public class StackFIFO extends stack {

	private stack temp = new stack();

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.stack#pop()
	 */
	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())
			push(temp.pop());

		return ret;
	}

}
