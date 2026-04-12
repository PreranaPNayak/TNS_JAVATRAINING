package org.tnsif.cap.c2tc.collections;


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Dragon fruits");
		
		System.out.println("First fruit :"+ fruits.get(0));
		
		fruits.set(1,"Cherry");
		
		fruits.remove(2);
		
		if(fruits.contains("Cherry"));
		{
			System.out.println("Cherry is in the list");
		}
		
		for(String fruit :fruits)
		{
			System.out.println(fruit);
		}

		fruits.clear();
		
		System.out.println("List size " +fruits.size());
	}

}
