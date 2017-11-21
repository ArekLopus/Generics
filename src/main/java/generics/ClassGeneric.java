package generics;

import generics.additionalClasses.Pair;


public class ClassGeneric<T> {
	
	T element;
	
	public ClassGeneric(Class<T> clazz) throws InstantiationException, IllegalAccessException {
		element = clazz.newInstance();
		System.out.println(element.getClass().getName());
	}
	
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		new ClassGeneric<>(String.class);
		new ClassGeneric<>(Pair.class);
	}

}
