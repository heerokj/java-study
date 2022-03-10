package day13;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet(); 
			
		hs.add("µþ±â");
		hs.add("¹Ù³ª³ª");
		hs.add("°¨");
		hs.add("µþ±â");
		hs.add("µþ±â");
		hs.add("µþ±â");
		hs.add("µþ±â");
		hs.add("µþ±â");
		hs.add("µþ±â");
		System.out.println(hs);
	
		//hs.get(0); 
		Iterator it = hs.iterator();   //????
	
//		boolean data = it.hasNext();
		
//		Object obj = it.next();
//		System.out.println(obj); //°¨
		
		
		boolean data = it.hasNext();
		if(data)System.out.println("´ÙÀ½ °ª ÀÖÀ½");
		else System.out.println("´ÙÀ½°ª ¾øÀ½");
		
		while(it.hasNext()) {
			Object obj2 = it.next();
			System.out.println(obj2);
		}
		
	}

}
