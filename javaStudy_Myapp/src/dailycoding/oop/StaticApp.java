package dailycoding.oop;

class Foo {
	public static String classVar = "I class Var";
	public String instanceVar = "I instance Var";

	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar);
	}

	public void instnaceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}

}

public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
//		System.out.println(Foo.intanceVar);
		Foo.classMethod();
//		Foo.instanceMethod();

		Foo f1 = new Foo();
		Foo f2 = new Foo();
		f1.instnaceMethod();  //I instance Var
		f1.classMethod();  //I class Var
		
		f1.classVar = "Changed by f1";
		f1.classMethod();  //Changed by f1
		Foo.classMethod(); //Changed by f1
		
		f1.instanceVar = "changed by f1";
		f1.instnaceMethod(); //Changed by f1
		f2.instnaceMethod();  //I instance Var
		

	}

}
