package generics.restrictions;

public class NoTypeVarsInStaticFieldsOrMethods<T> {

//	public class Singleton<T> {
//	    private static T singleInstance; 		// ERROR
//	    public static T getSingleInstance()  { … }	// ERROR
//	}
	
//If this could be done, then a program could declare a Singleton<Random> to share a random number generator
//and a Singleton<JFileChooser> to share a file chooser dialog. But it can’t work. 

//After type erasure there is only one Singleton class, and only one singleInstance field.
//For that reason, static fields and methods with type variables are simply outlawed.
	
}