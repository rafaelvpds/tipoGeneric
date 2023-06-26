package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public T first() {
		// Verificando se a lista esta vaizia
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}

	public void print() {

		if (!list.isEmpty()) {
			System.out.println("[");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(", " + list.get(i));
			}
			System.out.println("]");
		}

	}

}
