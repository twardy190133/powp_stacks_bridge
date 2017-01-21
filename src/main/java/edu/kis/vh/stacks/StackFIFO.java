package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackArray;

public class StackFIFO extends stack {

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(IStacks stackArray) {
		super(stackArray);
		// TODO Auto-generated constructor stub
	}

	/* W tym wypadku lepszym wyborem będzie StackArray, ponieważ klasa stack używa obiektu StackArray.
	 * 
	 */
	private StackArray temp = new StackArray();

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
