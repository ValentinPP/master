package saptamana4.curs2.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Ex7 {
	public static void main(String[] args) {
		Map<String, Pisica> map = new HashMap<>();

		map.put("pisica5", new Pisica("Tom"));
		map.put("tralala", new Pisica("Tomitza"));

		System.out.println(map);

		Map<String, String> map2 = new HashMap<>();

		map2.put("ex1", "ceva");
		map2.put("ex2", "altvceva");

		System.out.println(map2);
	}
}
