package saptamana4.curs1.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("gigel");
		list.add("ionel");

		for(String x: list){
			System.out.println("Lista " + x);
		}

		String x [] = new String[list.size()]; //initializam arrayul

		x = list.toArray(x);

		for (String y:x){
			System.out.println("Array din lista " + y);
		}

		List<String> lista1 = Arrays.asList(x);

		lista1.forEach(element -> System.out.println("Lista din Array " + element + " *"));
	}
}
