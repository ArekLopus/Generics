package generics.restrictions;

//It is illegal to create conditions that cause clashes when generic types are erased.
public class BewareClashesAfterErasure {

	public BewareClashesAfterErasure() {
		
		//2 same method signatures after erasure - The remedy is, of course, to rename the offending method.
		
		
//A class or type variable may not at the same time be a subtype of two interface types
//which are different parameterizations of the same interface
		
		//class Calendar implements Comparable<Calendar> { . . . }
		//class GregorianCalendar extends Calendar implements Comparable<GregorianCalendar>	{ . . . } // ERROR
		
		//The interface Comparable cannot be implemented more than once with different arguments:
		//Comparable<Calendar> and Comparable<GregorianCalendar>
	}
	
	
	public static void main(String[] args) {
		new BewareClashesAfterErasure();
	}

}