package OOPS;
//Inheritence Example ClassA

public class ClassB extends ClassA {
	public void m3()
	{
		System.out.println("m3-classB");
	}


	public static void main(String[] args)
	{
	 ClassB obj = new ClassB();
	 obj.m1();
	 obj.m2();
	 obj.m3();
	 

	}

}
