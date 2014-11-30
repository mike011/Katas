import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoundedStackTest {

	private Stack stack;

	@Before
	public void setup() {
		stack = BoundedStack.make(2);
	}

	@Test
	public void newlyCreatedStack_ShouldBeEmpty() {
		assertTrue(stack.isEmpty());
		assertEquals(0, stack.getSize());
	}

	@Test
	public void afterOnePush_StackSizeShouldBeOne() throws Exception {
		stack.push(3);
		assertEquals(1, stack.getSize());
		assertFalse(stack.isEmpty());
	}

	@Test
	public void afterOnePushAndPop_ShouldBeEmpty() {
		stack.push(3);
		stack.pop();
		assertTrue(stack.isEmpty());
	}

	@Test(expected = BoundedStack.OverFlow.class)
	public void whenPushedPassedLimit_StackOverflows() {
		stack.push(1);
		stack.push(3);
		stack.push(4);
	}

	@Test(expected = BoundedStack.UnderFlow.class)
	public void whenEmptyStackIsPopped_ShouldThrowUnderFlow() {
		stack.pop();
	}

	@Test
	public void WhenOneIsPushed_OneIsPopped() {
		stack.push(1);
		assertEquals(1, stack.pop());
	}

	@Test
	public void WhenOneAndTwoArePushed_TwoAndOneArePopped() throws Exception {
		stack.push(1);
		stack.push(2);
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
	}

	@Test(expected = BoundedStack.IllegalCapacity.class)
	public void WhenCreatingWithNegativeSize_ShouldThrowIllegalCapacity() throws Exception {
		BoundedStack.make(-1);
	}

	@Test(expected = BoundedStack.OverFlow.class)
	public void WhenCreatingStackWithZeroCapacity_AnyPushShouldOverflow() throws Exception {
		stack = BoundedStack.make(0);
		stack.push(0);
	}
	
	@Test
	public void whenOneIsPushed_OneIsOnTOp() throws Exception {
		stack.push(1);
		assertEquals(1, stack.top());
	}
	
	@Test(expected = Stack.Empty.class)
	public void whenStackIsEmpty_TopThrowsEmpty() throws Exception {
		stack.top();
	}

	@Test(expected = Stack.Empty.class)
	public void withZeroCapacityStack_TopThrowEmpty() throws Exception {
		stack = BoundedStack.make(0);
		stack.top();
	}
	
	@Test
	public void GivenStackWithOneTwoPushed_FindOne() throws Exception {
		stack.push(1);
		stack.push(2);
		int oneIndex = stack.find(1);
		int twoIndex = stack.find(2);
		assertEquals(1, oneIndex);
		assertEquals(0, twoIndex);
		
	}
	
	@Test
	public void GivenWhenStackWithNo2_Find2ShouldReturnNull() throws Exception {
		assertNull(stack.find(2));
	}
}
