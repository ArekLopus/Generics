package generics.restrictions;

//-You can neither throw nor catch objs of a generic class. It is not even legal for a generic class to extend Throwable.
public class NoThrowOrCatchInstancesOfGenericClass {

	public NoThrowOrCatchInstancesOfGenericClass() {
		
		//public class Problem<T> extends Exception { /* . . . */ } 	// ERROR—can't extend Throwable
		
		//However, it is OK to use type variables in exception specifications. The following method is legal:
		//public static <T extends Throwable> void doWork(T t) throws T {	 // OK
	}
	
//	public static <T extends Throwable> void doWork(Class<T> t) {
//	    try {
//	        do work
//	    } catch (T e) {	 												// ERROR--can't catch type variable
//	        Logger.global.info(...)
//	    }
//	}
	
	public static void main(String[] args) {
		new NoThrowOrCatchInstancesOfGenericClass();
	}

}
