package generics.wildcards;

import generics.additionalClasses.Employee;
import generics.additionalClasses.Manager;
import generics.additionalClasses.Pair;

//It isn’t known what type the wildcard denotes, but it is a definite type,
public class WildcardCapture {
	
	Pair<Employee> pe = new Pair<Employee>(new Employee("Emp1N", "Emp1S"), new Employee("Emp2N", "Emp2S"));
	
	
	public WildcardCapture() {
		//in this case, we were not compelled to use a wildcard. We could have directly implemented
		//<T> void swap(Pair<T> p) as a generic method without wildcards.
		System.out.println(pe);
		swap(pe);
		System.out.println(pe);
		captureNeeded(pe);
		System.out.println(pe);
	}
	
	//Here, the wildcard capture mechanism cannot be avoided.
	public static void captureNeeded(Pair<? super Manager> result) {
	    swap(result); 	// OK--swapHelper captures wildcard type
	}
	
	public static void swap(Pair<?> p) {    swapHelper(p);    }
	
	public static <T> void swapHelper(Pair<T> p) {
	    T t = p.getFirst();     p.setFirst(p.getSecond());     p.setSecond(t);
	}
	
	
	public static void main(String[] args) {
		new WildcardCapture();
	}

}
