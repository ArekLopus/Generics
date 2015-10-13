package generics.wildcards;

import generics.additionalClasses.Employee;
import generics.additionalClasses.Manager;
import generics.additionalClasses.Pair;

//It is like ANY TYPE
//The return value of getFirst() can only be assigned to an Object.
//The setFirst() can never be called, not even with an Object (null possible).
public class UnboundedWildcards {
	
	Pair<?> pe = new Pair<Employee>(new Employee("Emp1N", "Emp1S"), new Employee("Emp2N", "Emp2S"));
	Employee e1 = new Employee("NewE1N","NewE1S");
	Manager m1 = new Manager("NewM1N", "NewM1S", "NewMan");
	
	public UnboundedWildcards() {
		//pe.setFirst(e1);	//The method setFirst(capture#1-of ?) in the type Pair<capture#1-of ?> is not applicable for the arguments (Employee)
		pe.setFirst(null);
		
		//Employee e = pe.getFirst();	//Type mismatch: cannot convert from capture#2-of ? to Employee
		
		Object o = pe.getSecond();
		System.out.println(o);
		
		Class<?> clazz = "abc".getClass();
		
		boolean a = hasNulls(pe);
		
		System.out.println(clazz);
		System.out.println(a);
	}
	
	public static boolean hasNulls(Pair<?> p) {
	    return p.getFirst() == null || p.getSecond() == null;
	}
	
	
	public static void main(String[] args) {
		new UnboundedWildcards();
	}

}
