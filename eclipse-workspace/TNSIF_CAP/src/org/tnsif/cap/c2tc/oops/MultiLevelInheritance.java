package org.tnsif.cap.c2tc.oops;

class eat
{
	void eating()
	{
		System.out.println("I can eat");
		}
	}
class sleep extends eat
 {
	void sleeping()
	{
	System.out.println("I can sleep");	
	}
}
class work extends sleep
{
	void working() 
	{
		System.out.println("I can work");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		work w = new work();
		w.working();
		w.sleeping();
		w.eating();

	}

}