package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.IStacks;
import edu.kis.vh.stacks.stack;
import edu.kis.vh.stacks.list.StackArray;

public class stackTest {
	
	@Test
	public void testPush() {
		IStacks stackArray = new StackArray();
		stack stackObj = new stack(stackArray);
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		IStacks stackArray = new StackArray();
		stack stackObj = new stack(stackArray);
		boolean result = stackObj.isEmpty();		
		Assert.assertEquals(true, result);
		
		stackObj.push(888);
		
		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		IStacks stackArray = new StackArray();
		stack stackObj = new stack(stackArray);
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < (STACK_CAPACITY-1); i++) {
			boolean result = stackObj.isFull();		
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}
		
		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		IStacks stackArray = new StackArray();
		stack stackObj = new stack(stackArray);
		
		int result = stackObj.top();
		Assert.assertEquals(IStacks.STACK_EMPTY, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		IStacks stackArray = new StackArray();
		stack stackObj = new stack(stackArray);
		
		int result = stackObj.pop();
		Assert.assertEquals(IStacks.STACK_EMPTY, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(IStacks.STACK_EMPTY, result);
	}

}
