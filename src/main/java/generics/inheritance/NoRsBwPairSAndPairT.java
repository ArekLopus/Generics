package generics.inheritance;

import generics.additionalClasses.Employee;
import generics.additionalClasses.Manager;
import generics.additionalClasses.Pair;


public class NoRsBwPairSAndPairT {

	public NoRsBwPairSAndPairT() {
		
		Pair<Manager> managerBuddies = new Pair<>();
		//Pair<Employee> employeeBuddies = managerBuddies;	//ERROR - Type mismatch: cannot convert from Pair<Manager> to Pair<Employee> 	
		//There is no relationship between Pair<S> and Pair<T>
		
		
		//An important difference between generic types and Java arrays.
		//You can assign a Manager[] array to a variable of type Employee[]:
		Manager[] m = new Manager[5];
		Employee[] e = m;
		
		e[0] = new Manager();
		e[0] = new Employee();	//ERROR - java.lang.ArrayStoreException: generics.additionalClasses.Employee
		//Pamięta, ze to tablica typu Manager
		
	}
	
	
	public static void main(String[] args) {
		new NoRsBwPairSAndPairT();
	}

}
