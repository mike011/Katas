public interface Stack {

	public class Empty extends RuntimeException {
		private static final long serialVersionUID = -7856779114807902230L;
	}

	public static class IllegalCapacity extends RuntimeException {
		private static final long serialVersionUID = 4762278508972436879L;
	
	}

	public static class UnderFlow extends RuntimeException {
		private static final long serialVersionUID = 1L;
	
	}

	public static class OverFlow extends RuntimeException {
		private static final long serialVersionUID = -3300220518031624480L;
	
	}

	public abstract boolean isEmpty();

	public abstract int getSize();

	public abstract void push(int element);

	public abstract int pop();

	public abstract int top();

	public abstract Integer find(int element);

}