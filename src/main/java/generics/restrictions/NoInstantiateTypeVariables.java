package generics.restrictions;

import generics.additionalClasses.Pair;


public class NoInstantiateTypeVariables<T> {

	public NoInstantiateTypeVariables() {
		
		//public Pair() { first = new T(); second = new T(); } 	// ERROR - Type erasure would change T to Object
		//T[] mm = new T[2]; 									// ERROR - Cannot create a generic array of T
		
		//Type erasure would cause this method to always construct an array Comparable[2].
		//public static <T extends Comparable> T[] minmax(T[] a) { T[] mm = new T[2]; } // ERROR
		
	}
	


	public static void main(String[] args) {
		new NoInstantiateTypeVariables();
	}

}
