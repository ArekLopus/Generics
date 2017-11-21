package generics.reflection;

import generics.additionalClasses.Employee;
import generics.additionalClasses.Pair;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

public class GenericReflection {
	
	Pair<? extends Employee> pe = new Pair<Employee>(new Employee("Emp1N", "Emp1S"), new Employee("Emp2N", "Emp2S"));
	
	public GenericReflection() {
		Type type = pe.getClass().getGenericSuperclass();
		
		if (type instanceof Class) {
			Class<?> t = (Class<?>) type;
			System.out.print(t.getName());
		}
		else if (type instanceof TypeVariable) {
			TypeVariable<?> t = (TypeVariable<?>) type;
			System.out.print(t.getName());
		}
		else if (type instanceof WildcardType) {
			WildcardType t = (WildcardType) type;
			System.out.print(t.getLowerBounds());
			System.out.print(t.getUpperBounds());
		}	
		else if (type instanceof ParameterizedType) {
			ParameterizedType t = (ParameterizedType) type;
			System.out.println(t.getOwnerType());
			System.out.println(t.getRawType());
		}
		else if (type instanceof GenericArrayType) {
			GenericArrayType t = (GenericArrayType) type;
			System.out.print(t.getTypeName());
		}	
	}
	
	
	
	public static void main(String[] args) {
		new GenericReflection();
	}

}
