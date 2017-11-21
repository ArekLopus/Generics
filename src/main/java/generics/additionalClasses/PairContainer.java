package generics.additionalClasses;

public class PairContainer<T,U> {
	
	private T first;
	private U second;
	
	public PairContainer(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	public PairContainer() {}
	
	
	
	
	
	
	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public U getSecond() {
		return second;
	}

	public void setSecond(U second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "PairContainer [first=" + first + ", second=" + second + "]";
	}
	
	
}
