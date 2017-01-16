package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.IstacksFactory;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public class DefaultStacksFactory implements IstacksFactory {

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.IstacksFactory#GetStandardStack()
	 */
	@Override
	public stack GetStandardStack() {
		return new stack();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.IstacksFactory#GetFalseStack()
	 */
	@Override
	public stack GetFalseStack() {
		return new stack();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.IstacksFactory#GetFIFOStack()
	 */
	@Override
	public StackFIFO GetFIFOStack() {
		return new StackFIFO();
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.factory.IstacksFactory#GetHanoiStack()
	 */
	@Override
	public StackHanoi GetHanoiStack() {
		return new StackHanoi();
	}

}
