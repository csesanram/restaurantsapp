/**
 * 
 */
package com.restaurantsapp.demo.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import com.restaurantsapp.demo.pojo.CustomerInformation;
import com.restaurantsapp.demo.pojo.StudentInformation;

/**
 * @author User
 *
 */
public class DemoCollectionsFrameWork {
	
	enum Color {
		RED, GREEN, BLUE;
	}
	
	/*class Color {
		
		public static final Color RED = new Color();
	}*/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayListDemo();
		
		//vectorDemo ();
		
		//LinkedListDemo();
		
		//hashSetDemo();
		
		//linkedHashSetDemo();
		
		//treeSetDemo();
		
		//priortyQueueDemo();
		
		//hashMapDemo();
		
		//hashTableDemo();
		
		//linkedHashMapDemo();
		
		treeMapDemo();
		
		Color c1 = Color.RED;
		System.out.println(c1);
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
	
	
	public static void hashSetDemo() {
		
		HashSet<String> hashSetObj = new HashSet<String>();
		
		//adding elements into the hashset
		hashSetObj.add("sunday");
		hashSetObj.add("monday");
		hashSetObj.add("friday");
		
		//addition of duplicate elements
		hashSetObj.add("monday");
		hashSetObj.add("friday");
		
		//addition of null values
		hashSetObj.add(null);
		hashSetObj.add(null);
		
		System.out.println("hashset demo::"+ hashSetObj);
		
		// make it like synchroniozed set
		//Collections.synchronizedSet(hashSetObj);
		
		hashSetObj.remove("sunday");
		
		System.out.println("after remove hashset demo::"+ hashSetObj);
		
		for (String s : hashSetObj) {
			System.out.println("after remove hashset demo::"+ s);
		}
		
		System.out.println("##################################################");
		
		//create an array
		String[] array = new String[hashSetObj.size()];
		hashSetObj.toArray(array);
		
		for (String s : array) {
			System.out.println("array iteration::"+ s);
		}
		
	}
	
	public static void linkedHashSetDemo() {
		LinkedHashSet<String> lhSetObj = new LinkedHashSet<String>();
		lhSetObj.add("Z");
		lhSetObj.add("X");
		lhSetObj.add("M");
		lhSetObj.add("A");
		
		System.out.println(lhSetObj);
		
		lhSetObj.remove("Z");
		
		System.out.println("removed Z object:: "+lhSetObj);
	}

	
	public static void treeSetDemo() {
		
		TreeSet<String> tSetObj = new TreeSet<String>();
		tSetObj.add("ABC");
		tSetObj.add("Test");
		tSetObj.add("Apple");
		tSetObj.add("Pen");
		tSetObj.add("Ink");
		tSetObj.add("Jack");
		tSetObj.add("null");
		tSetObj.add("null");
		System.out.println(tSetObj);
		
		
		TreeSet<Integer> rSetIntegerObj = new TreeSet<Integer>();
		rSetIntegerObj.add(88);
		rSetIntegerObj.add(9);
		rSetIntegerObj.add(0);
		rSetIntegerObj.add(3);
		rSetIntegerObj.add(6);
		rSetIntegerObj.add(5);
		
		System.out.println(rSetIntegerObj);
	}
	
	public static void priortyQueueDemo() {
		PriorityQueue<String> pQObj = new PriorityQueue<String>();
		
		// adding the element into pQ Object
		pQObj.add("C");
		pQObj.add("C++");
		pQObj.add("Java");
		pQObj.add("Python");
		
		//print it
		System.out.println("Head value using peelk function:: "+pQObj.peek());
		
		Iterator<String> iS = pQObj.iterator();
		
		while(iS.hasNext()) 
			System.out.println(iS.next());
		
		pQObj.poll();
		
		System.out.println("after removeing an element with poll function :: ");
		
		Iterator<String> iS1 = pQObj.iterator();
		
		while(iS1.hasNext()) 
			System.out.println(iS1.next());	
		
		Object[]  o = pQObj.toArray();
		 
		for (Object o1 : o) 
			System.out.println(o1);
		
		
		
	}
	
	public static <V, K> void hashMapDemo() {
		HashMap<Integer, CustomerInformation> hashMapObj = new HashMap<Integer, CustomerInformation>();
		CustomerInformation custInfo = new CustomerInformation();
		custInfo.setFirstName("Sankar");
		custInfo.setLastName("Ram");
		hashMapObj.put(1, custInfo);
		
		custInfo = new CustomerInformation();
		custInfo.setFirstName("v");
		custInfo.setLastName("b");
		hashMapObj.put(2, custInfo);
		
		//display content using for iterator
		Set set = hashMapObj.entrySet();
		Iterator iterator =  set.iterator();
		
		while(iterator.hasNext()) {
		Map.Entry<K, V> mEntry	= (Map.Entry<K, V>)iterator.next();
		System.out.println(mEntry.getKey()  + "     " + mEntry.getValue());
	
		}
		
		System.out.println("fetch object value from HashMap:: "+hashMapObj.get(2));
		
	}
	
	public static void hashTableDemo() {
		
		Hashtable<String, String> hTObject = new Hashtable<String, String>();
		
		hTObject.put("1", "Atlanta");
		hTObject.put("2", "Nj");
		hTObject.put("3", "CA");
		
		Enumeration no = hTObject.keys();
		String key;
		while(no.hasMoreElements())  {
			key  = (String)no.nextElement();
			
			System.out.println("Key :"+ key + "   value "+hTObject.get(key));
		}
	}

	public static void linkedHashMapDemo() {
		LinkedHashMap<Integer, String> lhMObj = new LinkedHashMap<Integer, String>();
		
		lhMObj.put(12, "Kishore");
		lhMObj.put(3,"Tarun");
		lhMObj.put(5, "Vinaya");
		
		Set set = lhMObj.entrySet();
		
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry m = (Map.Entry)i.next();
			System.out.println("Key ::"+m.getKey() + "   Value::" + m.getValue());
		}
		
	}
	
	public static void treeMapDemo() {
		
		TreeMap<Integer, String> treeMapObj = new TreeMap<Integer, String>();
		
		treeMapObj.put(12, "Kishore");
		treeMapObj.put(3,"Tarun");
		treeMapObj.put(5, "Vinaya");
		treeMapObj.put(4, "Abbe");
		
		Map map = sortByValue(treeMapObj);
		
		Set set  = map.entrySet();
		
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry m	 = (Map.Entry)i.next();
			System.out.println(m.getKey() + "\t\t\t" +m.getValue() );
		}
		
	}
	
	public static <K, V extends Comparable<V>> Map<K, V> sortByValue(final Map<K, V> map) {
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				int  compare = map.get(k1).compareTo(map.get(k2));
				if (compare == 0) {
					return 1;
				}else {
					return compare;
				}
				
			}
		};
		Map<K,V> sortByValues = new TreeMap<K, V>(valueComparator);
		sortByValues.putAll(map);
		return sortByValues;
	}
}
