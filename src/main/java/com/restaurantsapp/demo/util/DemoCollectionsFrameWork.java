/**
 * 
 */
package com.restaurantsapp.demo.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

/**
 * @author User
 *
 */
public class DemoCollectionsFrameWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayListDemo();
		
		//vectorDemo ();
		
		LinkedListDemo();
	}
	
	
	public static void arrayListDemo() {
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("atlanta");
		arrayList.add("dunwoody");
		arrayList.add("nj");
		arrayList.add("alpha");
		
		System.out.println("Storing the data:: "+arrayList);
		
		// start from 0 value index
		arrayList.remove(0);
		
		System.out.println("update afrer removeable data:: "+arrayList);
		
		for (Object s : arrayList) {
			System.out.println(s.toString());
		}
		
		System.out.println("length:: "+arrayList.size());
		
		// sorting
		Collections.sort(arrayList);
		
		System.out.println("after sorting the data:: "+arrayList);
		
		Collections.reverse(arrayList);
		
		System.out.println("reverese sorting the data:: "+arrayList);
		
		System.out.println("arrayList zero th elemenet:: "+arrayList.get(0));
		
		System.out.println("arrayList contains the string:: "+arrayList.contains("nj") + "\t" + arrayList.contains("njee"));
		
		
		ArrayList<String> firstArrayList = new ArrayList<String>();
		firstArrayList.add("a");
		firstArrayList.add("b");
		firstArrayList.add("c");
		firstArrayList.add("d");
		
		ArrayList<String> secondArrayList = new ArrayList<String>();
		secondArrayList.add("a");
		secondArrayList.add("b");
		secondArrayList.add("f");
		secondArrayList.add("e");
		
		ArrayList<String> tempArrayList = new ArrayList<String>();
		
		for (String temp : secondArrayList) {
			tempArrayList.add(firstArrayList.contains(temp) ? "Yes" : "No" );
		}
		
		
		System.out.println("Compare two arrayList result::" + tempArrayList);
		
		// converting from the arraylist to array
		String strArray[] = new String[secondArrayList.size()];
		
		for (int i=0; i<secondArrayList.size(); i++) {
			strArray[i] =  secondArrayList.get(i);
		}
		
		for (String s : strArray) {
			System.out.println(s);
		}
		
	}
	
	/**
	 * 
	 */
	public static void vectorDemo () {
		Vector v = new Vector();
		
		v.add("v");
		v.add("a");
		v.add("d");
		
		for (Object o : v) {
			System.out.println(o);
		}
		
		Collections.sort(v);
		
		for (Object o : v) {
			System.out.println(o);
		}
	}
	
	/**
	 * 
	 */
	public static void LinkedListDemo() {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		
		
		System.out.println("Linksed List values:: "+linkedList);
		
		linkedList.addFirst("a");
		linkedList.addLast("e");
		
		System.out.println("After addFirst and addLast method :: "+linkedList);
		
		linkedList.set(0, "welcome to java class...");
		
		System.out.println("get values :: "+linkedList.get(0));
		
	}

}
