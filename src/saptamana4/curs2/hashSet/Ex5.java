package saptamana4.curs2.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex5 {
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("ionel");
		set.add("marcel");
		set.add("costel");
		set.add("costel");

		System.out.println(set);

		List<String> list = new ArrayList<>();

		list.add("ionel");
		list.add("marcel");
		list.add("costel");
		list.add("costel");

		System.out.println(list);

		set.isEmpty();
		set.size();
		System.out.println(set.size());

		for(int i = 0; i < list.size(); i++){
			list.get(i);
		}

		for(String s:set){
			System.out.println(s);
		}
	}
}
