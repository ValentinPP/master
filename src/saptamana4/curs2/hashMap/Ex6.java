package saptamana4.curs2.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Ex6 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Gigel");
		map.put(2, "Ana");
		map.put(3, "Ioana");
		map.put(-8, "Viorica");
		map.put(5, "Andrei");
		//map.put(5, "Vasile"); // un singur string pe o singura keye, daca se pune acceasi cheie se suprascrie

		System.out.println(map);

		for(Integer i:map.keySet()){
			System.out.println("Cheia este: " + i + " are valoarea: " + map.get(i));
		}

	}
}
