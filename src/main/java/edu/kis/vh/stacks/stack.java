package edu.kis.vh.stacks;

/* Konsekwencje zmiany dokonanej w punkcie 6 są takie, że
 * od teraz obiekt stackArray będzie posiadał tylko te metody
 * które są zadeklarowane w interfejsie IStacks.
 */
public class stack {
	
	private IStacks stackArray;

	public stack(IStacks stackArray) {
		super();
		this.stackArray = stackArray;
	}
	
	public stack() {
		
	}
	

	public void push(int i) {
		stackArray.push(i);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int top() {
		return stackArray.top();
	}

	public int pop() {
		return stackArray.pop();
	}




}
