package generics.restrictions;

import generics.additionalClasses.Pair;

import java.util.Collection;
import java.util.HashSet;

//In order to call addAll() method, the Java VM must make an array of Pair<String>, which is against the rules. 
///However, the rules have been relaxed for this situation, and you only get a warning, not an error.
//You can add the annotation @SuppressWarnings("unchecked") to the method containing the call to addAll.
//Or, as of Java SE 7, you can annotate the addAll() itself with @SafeVarargs:
public class VarargsWarnings {
	
	//@SuppressWarnings("unchecked")
	public VarargsWarnings() {
		Collection<Pair<String>> table = new HashSet<>();
		Pair<String> pair1 = new Pair<>();
		Pair<String> pair2 = new Pair<>();
		addAll(table, pair1, pair2);
		System.out.println();
	}
	
	//Warning -> Type safety: Potential heap pollution via varargs parameter ts
	//@SafeVarargs	//You can use this @ for any methods that merely read the elements of the parameter array. (J7)
	public static <T> void addAll(Collection<T> coll, T... ts) {
		for (T t : ts) coll.add(t);
	}
	
	
	public static void main(String[] args) {
		new VarargsWarnings();
	}

}
