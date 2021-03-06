package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.list.StackArray;
import edu.kis.vh.stacks.list.StackList;

public class StacksFactoryArray implements IstacksFactory {
	
	public stack GetStandardStack() {
		return new stack(new StackArray());
	}
	
	public StackFIFO GetFalseStack() {
		return new StackFIFO(new StackList());
	}
	
	public StackFIFO GetFIFOStack() {
		return new StackFIFO(new StackArray());
	}
	
	public StackHanoi GetHanoiStack() {
		return new StackHanoi(new StackArray());
	}
	
}
