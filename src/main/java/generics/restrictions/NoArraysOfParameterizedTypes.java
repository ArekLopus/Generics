package generics.restrictions;

import generics.additionalClasses.Employee;
import generics.additionalClasses.Pair;

public class NoArraysOfParameterizedTypes {

	public NoArraysOfParameterizedTypes() {
		
		//You can declare a variable of type Pair<String>[]. But you can’t initialize it with a new Pair<String>[10].
		//Pair<String>[] table = new Pair<String>[10]; // ERROR
		Pair<String>[] table = new Pair[10];
		Object[] objarray = table;
		//objarray[0] = "Hello"; // ERROR--component type is Pair -> Exc in thread "main" ArrayStoreException: String
		objarray[0] = new Pair();
		objarray[0] = new Pair<Employee>();
		
	}
	
	
	public static void main(String[] args) {
		new NoArraysOfParameterizedTypes();
	}

}
