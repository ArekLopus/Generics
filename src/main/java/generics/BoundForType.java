package generics;

import java.util.Arrays;
import java.util.Optional;

public class BoundForType {

	public BoundForType() {
		int i1 = min2(new Integer[] {1,2,3});
		System.out.println(i1);

		String s1 = min(new String[] {"One","Three","Four", "Abc", "abc"});
		System.out.println(s1);

		
	}
	
	
	public static <T extends Comparable<T>> T min(T[] a) {
		Optional<T> opt = Arrays.stream(a).min(Comparable::compareTo);
		return opt.orElse(null);
	}
	
	public static <T extends Comparable> T min2(T[] a) {
		Optional<T> opt = Arrays.stream(a).min(Comparable<T>::compareTo);
		return opt.orElse(null);
	}
	
	public static void main(String[] args) {
		new BoundForType();
	}

}
