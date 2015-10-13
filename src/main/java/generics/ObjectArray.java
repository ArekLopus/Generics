package generics;


public class ObjectArray {

	public ObjectArray() {
		
		String[] str = new String[5];
		Object[] obj = str;
		obj[0] = "abc";
		obj[2] = new Object();	//ERROR - pamięta, ze to String[]
	}
	
	
	public static void main(String[] args) {
		new ObjectArray();
	}

}
