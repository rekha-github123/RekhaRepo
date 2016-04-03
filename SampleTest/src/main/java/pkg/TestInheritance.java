package pkg;

public class TestInheritance {

	public static void main(String[] aa){
		ParentClass p = new ParentClass();
		ParentClass c = new ChildClass();
		ChildClass obj = new ChildClass();
		//p.doStuff();
		//c.doStuff();
		obj.childTask();
		//c.childTask();
	}
}
