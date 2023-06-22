package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	List<Integer> list = new ArrayList<>();

	public void addValue(int value) {
		list.add(value);
	}

	public Integer first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}

	public void print() {

		for (Integer number : list) {
			System.out.println(number);
		}

	}

}
