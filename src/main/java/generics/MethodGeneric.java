package generics;

public class MethodGeneric {

	public MethodGeneric() {
		String s1 = MethodGeneric.<String>getMiddle("a", "b", "c");  //you can place the actual types, before the method name:
		String s2 = getMiddle2("a", "b", "c", "d");	// in most cases, you can omit the type parameter (type inference)
		System.out.println(s1);
		System.out.println(s2);
		
	}
	
	
	@SafeVarargs	//Działa tylko ze static
	public static <T> T getMiddle(T... a)  {
		return a[a.length / 2];
	}
	
	
	@SuppressWarnings("unchecked")
	public <T> T getMiddle2(T... a)  {
		return a[a.length / 2];
	}
	
	public static void main(String[] args) {
		new MethodGeneric();
	}

}
