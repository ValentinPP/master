package saptamana4.curs1.list;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		list1.add(5);
		list1.add(8);

		list2.add(5);
		list2.add(8);

		boolean x = list1.equals(list2);
		boolean y = list1.size() == list2.size();
		System.out.println("\nVerifica egalitatea intre liste ca si continut " + x);
		System.out.println(y);

		list2.contains(5); //returneaza true daca lista contine pe 5
		list2.contains(1); //returneaza false daca lista nu contine pe 1;

		System.out.println("\n" + list2.contains(9));

		list1.remove(0);
		list1.remove(0);

		list1.add(5);

		System.out.println("\nEste lista mea goala? " + list1.isEmpty());

		if (list1.size() > list2.size()) {
			System.out.println("zzzzzzzzz");
		} else {
			System.out.println("aaaaaaaaa");
		}

		boolean o = list1.size() == list2.size();


	}
}
