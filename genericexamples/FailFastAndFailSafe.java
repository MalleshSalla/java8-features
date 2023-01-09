package org.capgemini.genericexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;



public class FailFastAndFailSafe {
public static void main(String[] args) {
	
	//Map<String,String> phoneMap =   new HashMap<>();
	
	Map<String,String> phoneMap =   new ConcurrentHashMap<>();
	
	phoneMap.put("Appale", "iphone");
	phoneMap.put("HTC", "HTC one");
	phoneMap.put("Samsung", "s6");
	
	Set<String> keySet = phoneMap.keySet();
	Iterator<String> iterator = keySet.iterator();
	
	while(iterator.hasNext()) {
		phoneMap.put("Sony", "Xperia z");
		String phoneType = iterator.next();
		System.out.println(phoneType+" : "+phoneMap.get(phoneType));
	}
}
}
