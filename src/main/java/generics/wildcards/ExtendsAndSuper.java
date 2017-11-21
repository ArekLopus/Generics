package generics.wildcards;

import generics.additionalClasses.Employee;
import generics.additionalClasses.Manager;
import generics.additionalClasses.Pair;

public class ExtendsAndSuper {
	
	Pair<Employee> pe = new Pair<Employee>(new Employee("Emp1N", "Emp1S"), new Employee("Emp2N", "Emp2S"));
	Pair<Manager> pm = new Pair<Manager>(new Manager("Man1N", "Man1S", "man1"), new Manager("Man2N", "Man2S", "man2"));
	Employee e1 = new Employee("NewE1N","NewE1S");
	Manager m1 = new Manager("NewM1N", "NewM1S", "NewMan");
	
	
	public ExtendsAndSuper() {
		
		printBuddies(pe);
		printBuddies2(pm);
		
	}
	
	public void printBuddies(Pair<? extends Employee> p) {
		//p.setFirst(e1);	//ERROR (both) -> The method setFirst(capture#1-of ? extends Employee) in the type 
		//p.setFirst(m1);	//Pair<capture#1-of ? extends Employee> is not applicable for the arguments (Employee)
		
		//Manager m = p.getFirst();	//Type mismatch: cannot convert from capture#1-of ? extends Employee to Manager
		Employee e = p.getFirst();	//YOU CAN READ  Employee
		
		System.out.println(e+", "+p.getSecond());
	}
	
	public void printBuddies2(Pair<? super Manager> p) {
		//p.setFirst(e1);	//The method setFirst(capture#3-of ? super Manager) in the type Pair<capture#3-of ? super Manager> is not applicable for the arguments (Employee)
		p.setFirst(m1);		//YOU CAN WRITE  Manager
		
		//Manager m = p.getFirst();		//Type mismatch: cannot convert from capture#4-of ? super Manager to Manager
		//Employee e = p.getFirst();    //Type mismatch: cannot convert from capture#4-of ? super Manager to Employee
		
		Object o = p.getFirst();
		
		System.out.println(o+", "+p.getSecond());
	}
	
	
	public static void main(String[] args) {
		new ExtendsAndSuper();
	}

}
