package edu.kis.vh.stacks;

public class StackHanoi extends stack {

	private int totalRejected = 0;

	/**
	 * @return number of rejected elements
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.stack#push(int)
	 */
	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
