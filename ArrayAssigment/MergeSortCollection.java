package com.techment.day7collection;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortCollection {

	public static void main(String[] args) {
		ArrayList<String> a1 =new ArrayList<String>();    //default capacity= 10;
		a1.add(" sachin");
		a1.add(" ravi");
		a1.add(" kumar");
		a1.add(" soumya");
		System.out.println("a1 element are:"+a1);
		ArrayList<String> a2 =new ArrayList<String>();    //default capacity= 10;

		a2.add(" sourabh");
		a2.add(" manish ");
		a2.add(" sachine");
		a2.add(" ankit");
		a2.add(" kumar");
       		System.out.println("a2 element are:"+a2);
		a1.addAll(a2);
		System.out.println("merge two a1 and a2 element are\n"+a2);
		a2.remove("kumar");
		System.out.println(" removed  duplicate  element are\n"+a2);

		
	   Collections.sort(a2);
	System.out.println(" after sorting element are\n"+a2);


		
	}

}
