package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.list.StackArray;
import edu.kis.vh.stacks.list.StackList;

public class StacksFactoryList implements IstacksFactory{

	
	public stack GetStandardStack() {
		return new stack(new StackList());
	}
	
	public StackFIFO GetFalseStack() {
		return new StackFIFO(new StackArray());
	}
	
	public StackFIFO GetFIFOStack() {
		return new StackFIFO(new StackList());
	}
	
	public StackHanoi GetHanoiStack() {
		return new StackHanoi(new StackList());
	}
}
