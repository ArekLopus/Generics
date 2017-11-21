package generics.inheritance;

import generics.additionalClasses.Employee;
import generics.additionalClasses.Manager;
import generics.additionalClasses.Pair;


public class RawTypeRefCanTakeAll {
	
	Employee e1 = new Employee("NewE1N","NewE1S");
	Manager m1 = new Manager("NewM1N", "NewM1S", "NewMan");
	
	public RawTypeRefCanTakeAll() {
		
		Pair<Manager> managerBuddies = new Pair<>();
		//Pair<Employee> employeeBuddies = managerBuddies;	//ERROR - Type mismatch: cannot convert from Pair<Manager> to Pair<Employee> 	
		
		Pair p = managerBuddies;
		p.setFirst(m1);		//Type safety: The method setFirst(Object) belongs to the raw type Pair. References to generic type Pair<T> should be parameterized
		p.setSecond("abc");	//Type safety: The method setFirst(Object) belongs to the raw type Pair. References to generic type Pair<T> should be parameterized
		System.out.println(p);
		
	}
	
	
	public static void main(String[] args) {
		new RawTypeRefCanTakeAll();
	}

}
