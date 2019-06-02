package optional;

import java.util.ArrayList;

public class ExtraArrayList extends ArrayList<Object> {

	private ArrayList<Object> arrayList;

	public ExtraArrayList() {
		super();
		this.arrayList = new ArrayList<Object>();
	}

	public Object pop() {
		try {
			return arrayList.remove(arrayList.size() - 1);
		} catch (Exception e) {
			System.out.println("List is empty");
			return null;
		}
	}

	public void print() {
		System.out.println(arrayList);
	}

	public void insert(int item, int index) {
		if (index > 0 && index <= arrayList.size()) {
			try {
				arrayList.add(index, item);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			int nulls = index - arrayList.size();
			for (int i = 0; i < nulls; i++) {
				arrayList.add(null);
			}
			arrayList.add(item);
		}
	}

	public static void main(String[] args) {

		ExtraArrayList extended = new ExtraArrayList();

		extended.insert(22, 0);
		extended.insert(24, 1);
		extended.insert(32, 2);
		extended.insert(45, 3);
		extended.insert(55, 4);

		extended.print();
		extended.pop();
		extended.print();
		extended.pop();
		extended.print();

		extended.insert(88, 5);
		extended.print();
		extended.insert(92, 6);
		extended.print();
		extended.insert(321, 3);
		extended.print();
		
		extended.pop();
		extended.print();
		extended.pop();
		extended.print();

	}

}
