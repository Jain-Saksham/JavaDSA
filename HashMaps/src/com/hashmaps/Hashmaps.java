package com.hashmaps;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmaps {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("Saksham", 90);
		map.put("Vashu", 93);
		
		System.out.println(map.get("Saksham"));
		System.out.println(map.containsKey("Vashu"));
		
		HashSet<Integer> set=new HashSet<>();
		set.add(34);
		set.add(34);
		set.add(44);
		set.add(27);
		
		System.out.println(set);
	}

}
