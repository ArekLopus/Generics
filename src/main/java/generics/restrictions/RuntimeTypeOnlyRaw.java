package generics.restrictions;

public class RuntimeTypeOnlyRaw {

	public RuntimeTypeOnlyRaw() {
		//if (a instanceof Pair<String>) 	// ERROR
		//if (a instanceof Pair<T>) 	// ERROR
		//Pair<String> p = (Pair<String>) a; 	// WARNING--can only test that a is a Pair
		
		//In the same spirit, the getClass() always returns the raw type. For example:
		//Pair<String> stringPair = . . .;	
		//Pair<Employee> employeePair = . . .;
		//if (stringPair.getClass() == employeePair.getClass()) 	// they are equal
		//The comparison yields true because both calls to getClass return Pair.class.
	}
	
	
	public static void main(String[] args) {
		new RuntimeTypeOnlyRaw();
	}

}
